package com.example.restaurantmanagementsystem.repository;

import com.example.restaurantmanagementsystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
