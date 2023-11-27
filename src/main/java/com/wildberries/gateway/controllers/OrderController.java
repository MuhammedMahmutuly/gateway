package com.wildberries.gateway.controllers;

import com.wildberries.gateway.dto.OrderDTO;
import com.wildberries.gateway.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getAllOrders")
    public OrderDTO getAllOrders() {
        return orderService.getAllOrders();
    }
}
