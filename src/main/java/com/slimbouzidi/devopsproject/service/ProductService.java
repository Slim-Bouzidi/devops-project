package com.slimbouzidi.devopsproject.service;

import com.slimbouzidi.devopsproject.entity.Product;
import com.slimbouzidi.devopsproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repo;

    public List<Product> getAllProducts() { return repo.findAll(); }

    public Product saveProduct(Product p) { return repo.save(p); }
}
