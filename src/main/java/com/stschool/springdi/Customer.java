package com.stschool.springdi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<Order> orders;
}
