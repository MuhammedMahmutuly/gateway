package com.wildberries.gateway.controllers;

import com.wildberries.gateway.dto.OrderDTO;
import com.wildberries.gateway.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/getAllOrders")
    public OrderDTO getAllOrders() {
        return orderService.getAllOrders();
    }
}
