package com.slimbouzidi.devopsproject.repository;

import com.slimbouzidi.devopsproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
