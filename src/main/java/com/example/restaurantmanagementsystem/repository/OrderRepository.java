package com.example.restaurantmanagementsystem.repository;

import com.example.restaurantmanagementsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT o FROM Order o LEFT JOIN FETCH o.products WHERE o.id = :id")
    Optional<Order> findByIdWithProducts(@Param("id") Long id);
}
