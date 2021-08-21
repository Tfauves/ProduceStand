package com.company;

public class Meat extends Product{
    private boolean isMarinated;


    public Meat(String category, String inventoryId, String name, double retailPricePerPound, double cost, int qtyAvailable, boolean isMarinated) {
        super(category, inventoryId, name, retailPricePerPound, cost, qtyAvailable);
        this.isMarinated = isMarinated;
    }

    public Meat(String type, int qty, double price) {

        super(type, qty, price);

    }


}
