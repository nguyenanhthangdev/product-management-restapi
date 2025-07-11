package com.example.quanlysanphamrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quanlysanphamrestapi.entity.Product;
import com.example.quanlysanphamrestapi.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired 
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> update(Product newProduct, Long id) {
        return productRepository.findById(id).map(old -> {
            old.setName(newProduct.getName());
            old.setDescription(newProduct.getDescription());
            old.setPrice(newProduct.getPrice());
            return productRepository.save(old);
        });
    }

    public boolean delete(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
