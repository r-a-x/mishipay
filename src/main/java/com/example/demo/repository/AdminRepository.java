package com.example.demo.repository;

import com.example.demo.models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {

    Admin findByKey(String key);
}
