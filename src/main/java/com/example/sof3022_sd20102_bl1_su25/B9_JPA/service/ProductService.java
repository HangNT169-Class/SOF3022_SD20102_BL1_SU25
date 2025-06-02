package com.example.sof3022_sd20102_bl1_su25.B9_JPA.service;

import com.example.sof3022_sd20102_bl1_su25.B9_JPA.entity.Product;
import com.example.sof3022_sd20102_bl1_su25.B9_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository proRepository;

    public List<Product> hienThiDuLieu() {
        return proRepository.findAll();
    }

}
