package com.company;

public class Fruit extends Product{
    private String color;

    public Fruit(String category, String inventoryId, String name, double retailPricePerPound, double cost, int qtyAvailable, String color) {
        super(category, inventoryId, name, retailPricePerPound, cost, qtyAvailable);
        this.color = color;
    }
    //new overloaded constructors
    public Fruit(String type, String color, int qty, double price) {

        super(type, qty, price);
        this.color = color;
    }

   public String getColor() {
       return color;
    }
}
