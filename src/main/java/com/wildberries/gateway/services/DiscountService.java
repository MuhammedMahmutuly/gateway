package com.wildberries.gateway.services;

import com.wildberries.gateway.dto.DiscountDTO;
import org.springframework.stereotype.Service;

@Service
public interface DiscountService {
    public DiscountDTO getAllDiscount();
}
