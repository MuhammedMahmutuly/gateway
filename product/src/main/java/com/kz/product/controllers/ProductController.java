package com.kz.product.controllers;

import com.kz.product.entityes.dto.ProductDTO;
import com.kz.product.entityes.dto.ProductDTO2;
import com.kz.product.entityes.dto.ProductDTO3;
import com.kz.product.services.ServiceProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.collections4.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    @Autowired
    private ServiceProduct serviceProduct;

    @GetMapping("/getAllProducts")
    public List<ProductDTO> getAllProducts() {
        return serviceProduct.getAllProducts();
    }

    @GetMapping("/getAllProductsByType")
    public List<ProductDTO> getAllProductsByType(@RequestParam String type) {
        return serviceProduct.getAllProductsByType(type);
    }

    @GetMapping("/getAllByName")
    public List<ProductDTO2> getAllByName(@RequestParam String type) {
        return serviceProduct.getAllByName(type);
    }

    @GetMapping("/getAllByTypeAndModel")
    public List<ProductDTO3> getAllByTypeAndModel(@RequestParam String name) {
        return serviceProduct.getAllByTypeAndModel(name);
    }
}
