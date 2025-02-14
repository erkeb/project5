package com.example.restaurantmanagementsystem.service.interfaces;

import com.example.restaurantmanagementsystem.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductServiceInterface {
    List<Product> getAllProducts();

    Product createProduct(Product product);

    Optional<Product> getProductById(Long id);
}