package com.example.shoopingcart.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    private Long id;

    private double totalPrice;

    @OneToOne(mappedBy = "cart")
    private User user;
}
