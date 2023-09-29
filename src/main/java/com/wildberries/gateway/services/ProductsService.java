package com.wildberries.gateway.services;

import com.wildberries.gateway.dto.ProductDTO;

import java.util.List;

public interface ProductsService {
    public List<ProductDTO> getAllProducts();
}
