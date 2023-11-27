package com.wildberries.gateway.services.impl;

import com.wildberries.gateway.dto.ProductDTO;
import com.wildberries.gateway.dto.ProductDTO2;
import com.wildberries.gateway.dto.ProductDTO3;
import com.wildberries.gateway.services.api.ProductApiService;
import com.wildberries.gateway.services.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductApiService productApiService;

    @Override
    public List<ProductDTO> getAllProducts() {
        try {
            return productApiService.getAllProducts();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ProductDTO> getAllProductsByType(String type) {
        try {
            return productApiService.getAllProductsByType(type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ProductDTO2> getAllByName(String type) {
        try {
            return productApiService.getAllByName(type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ProductDTO3> getAllByTypeAndModel(String name) {
        try {
            return productApiService.getAllByTypeAndModel(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
