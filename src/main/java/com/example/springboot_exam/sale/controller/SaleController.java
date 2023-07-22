package com.example.springboot_exam.sale.controller;

import com.example.springboot_exam.sale.entity.Sale;
import com.example.springboot_exam.sale.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SaleController {

    @Autowired
    private SaleService saleService;

    @RequestMapping("/sales")
    public String listSales(Model model) {
        List<Sale> sales = saleService.getAllSales();
        model.addAttribute("sales", sales);
        return "sale";
    }
}
