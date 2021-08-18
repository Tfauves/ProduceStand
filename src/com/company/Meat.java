package com.company;

public class Meat extends Product{
    private boolean isMarinated;


    public Meat(String category, String inventoryId, String name, double pricePerPound, int qtyAvailable, boolean isMarinated) {
        super(category, inventoryId, name, pricePerPound, qtyAvailable);
        this.isMarinated = isMarinated;
    }


}
