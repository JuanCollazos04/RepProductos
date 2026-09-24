package com.example.demo.service;

import com.example.demo.dto.request.ProductRequestDto;
import com.example.demo.dto.response.ProductResponseDto;

public interface ProductService {
    ProductResponseDto findById(Long productId);
    void save(ProductRequestDto productRequestDto);
    void update(ProductRequestDto productRequestDto, Long productId);
}
