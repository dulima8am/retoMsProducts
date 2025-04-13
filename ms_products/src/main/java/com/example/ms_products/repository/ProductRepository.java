package com.example.ms_products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_products.model.Product;     
public interface ProductRepository extends JpaRepository<Product, Long> 
{   
} 
