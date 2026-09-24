package com.example.demo.exception;

public class ProductNotFoundException extends RuntimeException {
    private static final String ERROR_MESSAGE = "Product with id: %s not found";
    public ProductNotFoundException(Long productId) {
        super(String.format(ERROR_MESSAGE, productId));
    }
}
