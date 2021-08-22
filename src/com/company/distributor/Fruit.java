package com.company.distributor;

import com.company.Product;

public class Fruit extends Product {
    private String color;

    public Fruit(String type, double cost, int qty, String color) {
        super(type, qty, cost);
        this.color = color;
    }

}
