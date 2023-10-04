package com.kz.product.services;

import com.kz.product.entityes.Product;
import com.kz.product.entityes.dto.ProductDTO;
import com.kz.product.entityes.dto.ProductDTO2;
import com.kz.product.entityes.dto.ProductDTO3;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceProduct {
    public List<ProductDTO> getAllProducts();

    public List<ProductDTO> getAllProductsByType(String type);

    public List<ProductDTO2> getAllByName(String type);

    public List<ProductDTO3> getAllByTypeAndModel(String name);
}
