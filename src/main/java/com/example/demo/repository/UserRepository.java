package com.example.demo.repository;

import com.example.demo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<User, String> {

    Integer countByEmail(String email);

    User findByEmail(String email);

    User findById(String i);

    User findByAccessToken(String accessToken);
}
