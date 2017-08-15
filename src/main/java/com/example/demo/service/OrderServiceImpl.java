package com.example.demo.service;

import com.example.demo.models.Order;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.DraftOrderRequest;
import com.example.demo.request.OrderCreationRequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
@Service
public class OrderServiceImpl implements OrderService {

    private RestTemplate shopifyRestTemplate;

    private UserRepository userRepository;

    private final String  DRAFT_ORDERS="draft_orders.json";

    @Value("${shopifyHostUrl}")
    private String shopifyHostUrl;

    public OrderServiceImpl(@Qualifier("shopifyRestTemplate") RestTemplate shopifyRestTemplate, UserRepository userRepository) {
        this.shopifyRestTemplate = shopifyRestTemplate;
        this.userRepository = userRepository;
    }

    @Override
    public List<Order> list() {
        return null;
    }

    @Override
    public Order createOrder(OrderCreationRequest orderCreationRequest) {
        URI targetUrl = UriComponentsBuilder.fromUriString(shopifyHostUrl).
                path(DRAFT_ORDERS).
                build().
                toUri();
        DraftOrderRequest draftOrderRequest = new DraftOrderRequest(orderCreationRequest);
        String string = shopifyRestTemplate.postForObject(targetUrl,draftOrderRequest,String.class);
        return null;
    }

}
