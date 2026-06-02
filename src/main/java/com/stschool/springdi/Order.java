package com.stschool.springdi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private int orderId;
    private int quantity;
    private Product product;

}
