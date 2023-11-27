package com.wildberries.gateway.services;

import com.wildberries.gateway.dto.ProductDTO;
import com.wildberries.gateway.dto.ProductDTO2;
import com.wildberries.gateway.dto.ProductDTO3;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public interface ProductsService {

    public List<ProductDTO> getAllProducts();

    public List<ProductDTO> getAllProductsByType(String type);

    public List<ProductDTO2> getAllByName(String type);

    public List<ProductDTO3> getAllByTypeAndModel(String name);
}
