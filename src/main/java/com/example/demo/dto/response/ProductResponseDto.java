package com.example.demo.dto.response;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
@Getter
@Builder
public class ProductResponseDto {
    private Long id;
    private Long sellerId;
    private Long brandId;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private boolean isActive;
}
