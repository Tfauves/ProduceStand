package com.company;

public class Meat extends Product{
    private boolean isMarinated;


    public Meat(String category, String inventoryId, String name, double retailPricePerPound, double cost, int qtyAvailable, boolean isMarinated) {
        super(category, inventoryId, name, retailPricePerPound, cost, qtyAvailable);
        this.isMarinated = isMarinated;
    }


}
