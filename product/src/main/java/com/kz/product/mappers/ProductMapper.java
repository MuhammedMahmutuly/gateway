package com.kz.product.mappers;

import com.kz.product.entityes.Product;
import com.kz.product.entityes.dto.ProductDTO;
import com.kz.product.entityes.dto.ProductDTO2;
import com.kz.product.entityes.dto.ProductDTO3;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public static ProductDTO toDTO(Product entity) {
        return ProductDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .type(entity.getType())
                .model(entity.getModel())
                .build();
    }

    public static ProductDTO2 toDTO2(Product entity) {
        return ProductDTO2.builder()
                .name(entity.getName())
                .build();
    }

    public static ProductDTO3 toDTO3(Product entity) {
        return ProductDTO3.builder()
                .type(entity.getType())
                .model(entity.getModel())
                .build();
    }

    public static Product toEntity(ProductDTO productDTO) {
        return Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .type(productDTO.getType())
                .model(productDTO.getModel())
                .build();
    }

    public static List<ProductDTO> toListDTO(List<Product> entityList) { //метод создает ДТОЛИСТ из ентитилист
        return entityList.stream()   //entitylist не келседе stream()- га берип тур
                .map(ProductMapper::toDTO)  //map е ишине келгенди toDTO-га беремиз,
                // сол кезде жогарыдагы метод шакырылады, toDTO(Order entity) жумысын жасайды (калай? - ол ентитидан дто жасайды)
                .collect(Collectors.toList());   //toList()- ка айналдырып List<OrderDTO> кылып кайтарады
    }

    public static List<ProductDTO2> toListDTO2(List<Product> entityList2) {
        return entityList2.stream()
                .map(ProductMapper::toDTO2)
                .collect(Collectors.toList());
    }

    public static List<ProductDTO3> toListDTO3(List<Product> entityList3) {
        return entityList3.stream()
                .map(ProductMapper::toDTO3)
                .collect(Collectors.toList());
    }

}


