package com.wildberries.gateway.controllers;

import com.wildberries.gateway.dto.DiscountDTO;
import com.wildberries.gateway.services.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/discount")
public class DiscountController {
    private final DiscountService discountService;

    @GetMapping("/getAllDiscount")
    public DiscountDTO getAllDiscount() {
    return discountService.getAllDiscount();
    }
}
