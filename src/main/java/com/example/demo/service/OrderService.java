package com.example.demo.service;

import com.example.demo.models.Order;
import com.example.demo.request.OrderCreationRequest;

import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
public interface OrderService {
    List<Order> list();
    Order createOrder(OrderCreationRequest orderCreationRequest);

}
