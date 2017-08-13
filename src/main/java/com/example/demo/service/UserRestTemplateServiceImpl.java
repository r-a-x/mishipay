package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;

/**
 * Created by rahulb on 13/8/17.
 */
public class UserRestTemplateServiceImpl implements UserRestTemplateService {

    @Autowired
    @Qualifier("shopifyRestTemplate")
    private RestTemplate shopifyRestTemplate;


}
