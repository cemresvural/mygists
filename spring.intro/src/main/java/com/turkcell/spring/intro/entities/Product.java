package com.turkcell.spring.intro.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private double unitPrice;
}
