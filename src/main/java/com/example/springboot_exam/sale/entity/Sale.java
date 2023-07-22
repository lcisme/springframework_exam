package com.example.springboot_exam.sale.entity;

import com.example.springboot_exam.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slNo;

    private int salesmanID;

    @ManyToOne
    @JoinColumn(name = "prodID")
    private Product product;

    private String salesmanName;

    private LocalDate dos;

}
