package com.luv2code.ecommerce23.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.ecommerce23.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}