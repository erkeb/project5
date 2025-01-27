package com.example.restaurantmanagementsystem.model.repository;

import com.example.restaurantmanagementsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

