package com.company;

public class Veggies extends Product{
    public boolean isInSeason;


    public Veggies(String category, String inventoryId, String name, double pricePerPound, int qtyAvailable, boolean isInSeason) {
        super(category, inventoryId, name, pricePerPound, qtyAvailable);
        this.isInSeason = isInSeason;
    }


}
