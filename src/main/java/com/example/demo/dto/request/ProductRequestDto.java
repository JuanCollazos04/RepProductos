package com.example.demo.dto.request;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
@Getter
@Builder
public class ProductRequestDto {
    private Long selleId;
    private Long brandId;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
}
