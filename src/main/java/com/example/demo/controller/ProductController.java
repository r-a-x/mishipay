package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productServiceImpl;

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public List<ProductDto> list(){
        return productServiceImpl.list();
    }

}
