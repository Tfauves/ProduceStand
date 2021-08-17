package com.company;

public class Product {
    private String category;
    protected String inventoryId;
    protected String name;
    protected double pricePerPound;
    protected int qtyAvailable;

    public Product(String category, String inventoryId, String name, double pricePerPound, int qtyAvailable) {
        this.category = category;
        this.inventoryId = inventoryId;
        this.name = name;
        this.pricePerPound = pricePerPound;
        this.qtyAvailable = qtyAvailable;
    }

    public String getCategory() {
        return category;
    }
}
