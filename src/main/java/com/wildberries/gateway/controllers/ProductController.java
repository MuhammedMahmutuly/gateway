package com.wildberries.gateway.controllers;

import com.wildberries.gateway.dto.ProductDTO;
import com.wildberries.gateway.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductsService productsService;

    @GetMapping("/getAllProducts")
    public List<ProductDTO> getAllProducts() {
        return productsService.getAllProducts();
    }
}
