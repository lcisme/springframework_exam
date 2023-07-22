package com.example.springboot_exam.product.repository;


import com.example.springboot_exam.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
