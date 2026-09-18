package com.example.demo.controller;

import com.example.demo.dto.response.ProductResponseDto;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @GetMapping(value = "/{product_id}")
    public ResponseEntity<ProductResponseDto> getById(@PathVariable("product_id") Long productId){
        return ResponseEntity.ok(productService.findById(productId));
    }
}
