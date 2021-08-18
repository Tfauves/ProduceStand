package com.company;

public class Fruit extends Product{
    private String color;

    public Fruit(String category, String inventoryId, String name, double pricePerPound, int qtyAvailable, String color) {
        super(category, inventoryId, name, pricePerPound, qtyAvailable);
        this.color = color;
    }

}
