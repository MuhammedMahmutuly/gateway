package com.wildberries.gateway.services.impl;

import com.wildberries.gateway.dto.OrderDTO;
import com.wildberries.gateway.services.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDTO getAllOrders() {
        return null;
    }
}
