package com.slimbouzidi.devopsproject.controller;

import com.slimbouzidi.devopsproject.entity.Product;
import com.slimbouzidi.devopsproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping
    public List<Product> getProducts() { return service.getAllProducts(); }

    @PostMapping
    public Product createProduct(@RequestBody Product product) { return service.saveProduct(product); }
}