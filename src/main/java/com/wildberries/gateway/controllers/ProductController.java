package com.wildberries.gateway.controllers;

import com.wildberries.gateway.dto.ProductDTO;
import com.wildberries.gateway.dto.ProductDTO2;
import com.wildberries.gateway.dto.ProductDTO3;
import com.wildberries.gateway.services.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/getAllProducts")
    public List<ProductDTO> getAllProducts() {
        return productsService.getAllProducts();
    }
    @GetMapping("/getAllProductsByType")
    public List<ProductDTO> getAllProductsByType(@RequestParam String type) {
        return productsService.getAllProductsByType(type);
    }
    @GetMapping("/getAllByName")
    public List<ProductDTO2> getByType(@RequestParam String type) {
        return productsService.getAllByName(type);
    }

    @GetMapping("/getAllByTypeAndModel")
    public List<ProductDTO3> getAllByTypeAndModel(String name) {
        return productsService.getAllByTypeAndModel(name);
    }
}
