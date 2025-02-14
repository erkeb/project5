package com.example.restaurantmanagementsystem.util;

import com.example.restaurantmanagementsystem.model.Order;
import com.example.restaurantmanagementsystem.model.User;

import java.util.ArrayList;

public class OrderFactory {
    public static Order createOrder(User user) {
        Order order = new Order();
        order.setUser(user);
        order.setStatus("NEW");
        return order;
    }

    public static Order createOrder(Order order) {
        Order newOrder = new Order();
        newOrder.setUser(order.getUser());
        newOrder.setItems(new ArrayList<>(order.getItems())); // Копируем список, а не ссылку
        newOrder.setStatus("NEW"); // Устанавливаем корректный статус
        return newOrder;
    }
}
