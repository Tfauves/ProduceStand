package com.company;

public class Veggies extends Product{
    public boolean isInSeason;


    public Veggies(String category, String inventoryId, String name, double retailPricePerPound, double cost , int qtyAvailable, boolean isInSeason) {
        super(category, inventoryId, name, retailPricePerPound, cost, qtyAvailable);
        this.isInSeason = isInSeason;
    }

    public Veggies(String type, boolean isInSeason, int qty, double price) {

        super(type, qty, price);
        this.isInSeason = isInSeason;
    }


}
