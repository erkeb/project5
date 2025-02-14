package com.example.restaurantmanagementsystem.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class OrderDTO {
    @NotNull(message = "Имя клиента не должно быть пустым")
    @Size(min = 3, max = 50, message = "Имя должно содержать от 3 до 50 символов")
    private String customerName;

    @NotNull(message = "Статус заказа не должен быть пустым")
    private String status;
}
