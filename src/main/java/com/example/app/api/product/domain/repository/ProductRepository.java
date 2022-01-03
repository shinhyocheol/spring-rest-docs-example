package com.example.app.api.product.domain.repository;

import com.example.app.api.product.domain.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
