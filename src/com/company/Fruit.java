package com.company;

public class Fruit extends Product{
    private String color;

    public Fruit(String category, String inventoryId, String name, double retailPricePerPound, double cost, int qtyAvailable, String color) {
        super(category, inventoryId, name, retailPricePerPound, cost, qtyAvailable);
        this.color = color;
    }

}
