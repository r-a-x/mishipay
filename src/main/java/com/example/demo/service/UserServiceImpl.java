package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserLoginDto;
import com.example.demo.exception.*;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.UserCreationRequest;
import com.example.demo.request.UserLoginRequest;
import com.example.demo.util.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RestTemplate shopifyRestTemplate;

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


        User user = new User(userCreationRequest.getEmail(), userCreationRequest.getName(), userCreationRequest.getPassword());
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

    private createCustomer(){}


}
