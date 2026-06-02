package com.stschool.springdi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
}
