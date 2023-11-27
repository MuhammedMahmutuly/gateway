package com.wildberries.gateway.controllers;

import com.wildberries.gateway.dto.DiscountDTO;
import com.wildberries.gateway.services.DiscountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/discount")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @GetMapping("/getAllDiscount")
    public DiscountDTO getAllDiscount() {
    return discountService.getAllDiscount();
    }
}
