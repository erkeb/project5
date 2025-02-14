package com.example.restaurantmanagementsystem.controller;

import com.example.restaurantmanagementsystem.dto.OrderDTO;
import com.example.restaurantmanagementsystem.model.Order;
import com.example.restaurantmanagementsystem.service.interfaces.OrderServiceInterface;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderServiceInterface orderService;

    public OrderController(OrderServiceInterface orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAll();
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@Valid @RequestBody OrderDTO orderDTO) {
        Order order = new Order();
        order.setStatus(orderDTO.getStatus());
        return ResponseEntity.ok(orderService.create(order));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @GetMapping("/full/{id}")
    public ResponseEntity<Map<String, Object>> getFullOrderDescription(@PathVariable Long id) {
        return orderService.getFullOrderDescription(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order orderDetails) {
        return orderService.updateOrder(id, orderDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOrder(@PathVariable Long id) {
        return orderService.deleteOrder(id);
    }
}
