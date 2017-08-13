package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.models.Product;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.respose.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rahulb on 13/8/17.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    @Qualifier("shopifyRestTemplate")
    private RestTemplate shopifyRestTempalte;

    @Value("${shopifyHostUrl}")
    private String shopifyHostUrl;

    private final String PRODUCTS = "products.json";

    @Override
    public List<ProductDto> list() {
        List<Product> products =  getProducts();
        productsRepository.save(products);
        return products.parallelStream().map(Product::toProductDto).collect(Collectors.toList());
    }

    private List<Product> getProducts(){

        URI targetUrl = UriComponentsBuilder.fromUriString(shopifyHostUrl).
                path(PRODUCTS).
                build().
                toUri();

        ProductResponse productResponse = shopifyRestTempalte.getForObject(targetUrl,ProductResponse.class);
        return productResponse.getProducts();


    }

}
