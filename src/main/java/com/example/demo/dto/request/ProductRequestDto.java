package com.example.demo.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    private Long sellerId;
    private Long brandId;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
}
