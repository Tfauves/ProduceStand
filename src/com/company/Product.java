package com.company;

public class Product {
    private String type;
    private String inventoryId;
    private String name;
    private double retailPricePerPound;
    private double cost;
    private int qtyAvailable;

    public Product(String type, String inventoryId, String name, double retailPricePerPound, double cost, int qtyAvailable) {
        this.type = type;
        this.inventoryId = inventoryId;
        this.name = name;
        this.cost = cost;
        this.retailPricePerPound = retailPricePerPound;
        this.qtyAvailable = qtyAvailable;
    }
    public Product(String type, int qty, double retailPricePerPound) {
        this.type = type;
        this.qtyAvailable = qty;
        this.retailPricePerPound = retailPricePerPound;
    }




//    public String getCategory() {
//        return type;
//    }

    public void setQtyAvailable(int newQty) {
        qtyAvailable = newQty;
    }

    public int getQtyAvailable() {
        return qtyAvailable;
    }

    public String getName() {
        return type;
    }

    public double getRetailPricePerPound() {
        return retailPricePerPound;
    }

    public double getCost() {
        return cost;
    }


}
