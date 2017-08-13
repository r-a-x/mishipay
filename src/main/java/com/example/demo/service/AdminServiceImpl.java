package com.example.demo.service;

import com.example.demo.dto.AdminDto;
import com.example.demo.exception.InvalidAccessTokenException;
import com.example.demo.models.Admin;
import com.example.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminDto identify(String key) {
        Admin admin = adminRepository.findByKey(key);

        if(admin == null) {
            throw new InvalidAccessTokenException();
        }

        return admin.toDto();
    }
}
