package com.example.springboot_exam.sale.service;

import com.example.springboot_exam.sale.entity.Sale;
import com.example.springboot_exam.sale.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;


    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }
}
