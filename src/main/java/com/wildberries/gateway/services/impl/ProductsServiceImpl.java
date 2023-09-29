package com.wildberries.gateway.services.impl;

import com.wildberries.gateway.dto.ProductDTO;
import com.wildberries.gateway.services.ProductsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Override
    public List<ProductDTO> getAllProducts() {
        return null;
    }
}
