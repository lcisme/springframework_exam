package com.example.springboot_exam.sale.repository;

import com.example.springboot_exam.sale.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
