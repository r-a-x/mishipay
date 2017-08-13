package com.example.demo.controller;

import com.example.demo.models.Orders;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
@RestController
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public List<Orders> list(){
        return orderService.list();
    }


}
