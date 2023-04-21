package ru.netology.springjdbc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date date;
    @Column(name = "product_name")
    private String productName;
    @Column
    private int amount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
