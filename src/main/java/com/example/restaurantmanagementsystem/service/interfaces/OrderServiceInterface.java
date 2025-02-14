package com.example.restaurantmanagementsystem.service.interfaces;

import com.example.restaurantmanagementsystem.model.Order;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;

public interface OrderServiceInterface {
    List<Order> getAll();
    Order create(Order order);
    ResponseEntity<Order> getById(Long id);

    ResponseEntity<Map<String, Object>> getFullOrderDescription(Long id);

    ResponseEntity<Order> updateOrder(Long id, Order orderDetails);

    ResponseEntity<Object> deleteOrder(Long id);
}
