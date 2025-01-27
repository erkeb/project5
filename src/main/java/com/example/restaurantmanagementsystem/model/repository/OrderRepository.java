package com.example.restaurantmanagementsystem.model.repository;

import com.example.restaurantmanagementsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
