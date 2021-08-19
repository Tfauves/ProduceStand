package com.company;

public class Product {
    private String category;
    private String inventoryId;
    private String name;
    private double retailPricePerPound;
    private double cost;
    private int qtyAvailable;

    public Product(String category, String inventoryId, String name, double retailPricePerPound, double cost, int qtyAvailable) {
        this.category = category;
        this.inventoryId = inventoryId;
        this.name = name;
        this.cost = cost;
        this.retailPricePerPound = retailPricePerPound;
        this.qtyAvailable = qtyAvailable;
    }



    public String getCategory() {
        return category;
    }

    public void setQtyAvailable(int newQty) {
        qtyAvailable = newQty;
    }

    public int getQtyAvailable() {
        return qtyAvailable;
    }

    public String getName() {
        return name;
    }

    public double getRetailPricePerPound() {
        return retailPricePerPound;
    }

    public double getCost() {
        return cost;
    }


}
