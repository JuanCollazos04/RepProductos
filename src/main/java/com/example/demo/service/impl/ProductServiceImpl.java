package com.example.demo.service.impl;

import com.example.demo.dto.request.ProductRequestDto;
import com.example.demo.dto.response.ProductResponseDto;
import com.example.demo.entity.ProductEntity;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ProductResponseDto findById(Long productId) {
        ProductEntity product = productRepository.findById(productId)
                .orElseThrow(()-> new ProductNotFoundException(productId));
        return ProductResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .brandId(product.getBrandId())
                .sellerId(product.getSellerId())
                .isActive(product.isActive())
                .stock(product.getStock())
                .build();
    }

    @Override
    public void save(ProductRequestDto productRequestDto) {

    }

    @Override
    public void update(ProductRequestDto productRequestDto, Long productId) {

    }
}
