package com.example.sof3022_sd20102_bl1_su25.B9_JPA.repository;

import com.example.sof3022_sd20102_bl1_su25.B9_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
