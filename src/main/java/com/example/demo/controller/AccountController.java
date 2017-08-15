package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.request.UserCreationRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rahulb on 13/8/17.
 */
@RestController
public class AccountController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public UserDto create(@RequestBody  UserCreationRequest userCreationRequest){
            return userService.create(userCreationRequest);
    }
}
