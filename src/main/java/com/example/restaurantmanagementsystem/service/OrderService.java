package com.example.restaurantmanagementsystem.service;

import com.example.restaurantmanagementsystem.model.Order;
import com.example.restaurantmanagementsystem.model.OrderItem;
import com.example.restaurantmanagementsystem.model.User;
import com.example.restaurantmanagementsystem.repository.OrderRepository;
import com.example.restaurantmanagementsystem.service.interfaces.OrderServiceInterface;
import com.example.restaurantmanagementsystem.util.OrderFactory;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService implements OrderServiceInterface {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        Order newOrder = OrderFactory.createOrder(order.getUser());
        return orderRepository.save(newOrder);
    }

    @Override
    public ResponseEntity<Order> getById(Long id) {
        return orderRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Map<String, Object>> getFullOrderDescription(Long orderId) {
        return orderRepository.findById(orderId)
                .map(order -> {
                    Map<String, Object> response = new HashMap<>();
                    response.put("order", order);
                    response.put("items", order.getItems());
                    response.put("user", order.getUser());
                    response.put("products", order.getProducts());
                    return ResponseEntity.ok(response);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Order> updateOrder(Long id, Order orderDetails) {
        return null;
    }

    @Override
    public ResponseEntity<Object> deleteOrder(Long id) {
        return null;
    }

    public List<Order> getOrdersByStatus(String status) {
        return orderRepository.findAll()
                .stream()
                .filter(order -> order.getStatus().equalsIgnoreCase(status))
                .toList();
    }
}
