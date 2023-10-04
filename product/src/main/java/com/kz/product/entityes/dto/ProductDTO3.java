package com.kz.product.entityes.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ProductDTO3 {
    private String type;
    private String model;
}
