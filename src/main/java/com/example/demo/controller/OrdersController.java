package com.example.demo.controller;

import com.example.demo.models.Order;
import com.example.demo.request.OrderCreationRequest;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
@RestController
//@Secure(role = Role.USER)
public class OrdersController extends   AuthenticatedController{

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public List<Order> list(){
        return orderService.list();
    }

    @RequestMapping(value = "/orders",method = RequestMethod.POST)
    public Order createOrder(@RequestBody OrderCreationRequest orderCreationRequest){
        return orderService.createOrder(orderCreationRequest);
    }


}
