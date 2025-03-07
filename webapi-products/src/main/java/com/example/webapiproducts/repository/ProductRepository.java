package com.example.webapiproducts.repository;

import com.example.webapiproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}