package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserLoginDto;
import com.example.demo.exception.*;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.CustomerCreationRequest;
import com.example.demo.request.UserCreationRequest;
import com.example.demo.request.UserLoginRequest;
import com.example.demo.respose.CustomerCreateResponse;
import com.example.demo.util.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RestTemplate shopifyRestTemplate;

    private final String CUSTOMERS = "customers.json";

    @Value("${shopifyHostUrl}")
    private String shopifyHostUrl;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, @Qualifier("shopifyRestTemplate") RestTemplate shopifyRestTemplate) {
        this.userRepository = userRepository;
        this.shopifyRestTemplate = shopifyRestTemplate;
    }

    @Override
    public UserDto create(UserCreationRequest userCreationRequest) {

        if(!userRepository.countByEmail(userCreationRequest.getEmail()).equals(0)) {
            throw new UserEmailExistsException(userCreationRequest.getEmail());
        }

        CustomerCreationRequest customerCreationRequest = new CustomerCreationRequest(userCreationRequest);
        String id = createCustomer(customerCreationRequest);

        User user = new User( id, userCreationRequest.getFirst_name(),
                              userCreationRequest.getLast_name(),
                userCreationRequest.getEmail(),
                userCreationRequest.getPhone(),
                userCreationRequest.getVerified_email(),
                userCreationRequest.getAddresses(),
//                null,
                userCreationRequest.getPassword(),
                userCreationRequest.getSend_email_welcome()
        );

        user = userRepository.save(user);

        return user.toDto();
    }

    @Override
    public UserLoginDto authenticate(UserLoginRequest userLoginRequest) {

        User user = userRepository.findByEmail(userLoginRequest.getEmail());

        if(user == null) {
            throw new UserLoginFailedException();
        }

        if(!Password.verify(userLoginRequest.getPassword(), user.getEncryptedPassword())) {
            throw new UserLoginFailedException();
        }

        return new UserLoginDto(user.getId(), user.getEmail(), user.getAccessToken());
    }

    @Override
    public UserDto getDetails(String userId) {

        User user = userRepository.findById(userId);

        if(user == null) {
            throw new UserIdNotFoundException();
        }

        return user.toDto();
    }

    @Override
    public UserDto getDetailsByEmail(String email) {

        User user = userRepository.findByEmail(email);

        if(user == null) {
            throw new UserEmailNotFoundException(email);
        }

        return user.toDto();
    }

    @Override
    public UserDto identify(String accessToken) {

        User user = userRepository.findByAccessToken(accessToken);

        if(user == null) {
            throw new InvalidAccessTokenException();
        }

        return user.toDto();
    }

//  There would be certain data at this point to signinfy, the presence of something

    private  String createCustomer(CustomerCreationRequest customerCreationRequest){

        URI targetUrl = UriComponentsBuilder.fromHttpUrl(shopifyHostUrl).
                path(CUSTOMERS).
                build().toUri();

        CustomerCreateResponse response = shopifyRestTemplate.postForObject(targetUrl,customerCreationRequest, CustomerCreateResponse.class);
        return response.getCustomerResponse().getId();
    }


}
