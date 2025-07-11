package com.example.quanlysanphamrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quanlysanphamrestapi.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
