package com.example.restaurantmanagementsystem.model;

import com.example.restaurantmanagementsystem.category.ProductCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name should not be empty")
    @Size(max = 255, message = "Name should not exceed 255 characters")
    private String name;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Category should not be null")
    private ProductCategory category;

    @NotNull(message = "Price should not be null")
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
