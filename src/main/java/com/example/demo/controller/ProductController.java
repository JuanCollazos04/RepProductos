package com.example.demo.controller;

import com.example.demo.dto.request.ProductRequestDto;
import com.example.demo.dto.response.ProductResponseDto;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @GetMapping(value = "/{product_id}")
    public ResponseEntity<ProductResponseDto> getById(@PathVariable("product_id") Long productId){
        return ResponseEntity.ok(productService.findById(productId));
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ProductRequestDto productRequestDto){
        productService.save(productRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
