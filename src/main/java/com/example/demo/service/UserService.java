package com.example.demo.service;


import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserLoginDto;
import com.example.demo.request.UserCreationRequest;
import com.example.demo.request.UserLoginRequest;

public interface UserService {

    UserDto create(UserCreationRequest userCreationRequest);

    UserLoginDto authenticate(UserLoginRequest userLoginRequest);

    UserDto getDetails(String userId);

    UserDto getDetailsByEmail(String email);

    UserDto identify(String accessToken);
}
