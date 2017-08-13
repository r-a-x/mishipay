package com.example.demo.repository;

import com.example.demo.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by rahulb on 13/8/17.
 */
public interface ProductsRepository extends MongoRepository<Product,String>{

    List<Product> findByUid(String uid);

    List<Product> findAll();
}
