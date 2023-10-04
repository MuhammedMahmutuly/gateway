package com.kz.product.services.impl;

import com.kz.product.entityes.dto.ProductDTO;
import com.kz.product.entityes.dto.ProductDTO2;
import com.kz.product.entityes.dto.ProductDTO3;
import com.kz.product.mappers.ProductMapper;
import com.kz.product.repositoryes.ProductRepository;
import com.kz.product.services.ServiceProduct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceProductImpl implements ServiceProduct {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<ProductDTO> getAllProducts() {
        return ProductMapper.toListDTO(productRepository.findAll());

    }

    @Override
    public List<ProductDTO> getAllProductsByType(String type) {
        return ProductMapper.toListDTO(productRepository.findAllByType(type));
    }

    @Override
    public List<ProductDTO2> getAllByName(String type) {
        return ProductMapper.toListDTO2(productRepository.findAllByName(type));
    }

    @Override
    public List<ProductDTO3> getAllByTypeAndModel(String name) {
        return ProductMapper.toListDTO3(productRepository.findAllByTypeAndModel(name));
    }

}
