package com.company;

public class Product {
    private String category;
    private String inventoryId;
    private String name;
    private double pricePerPound;
    private int qtyAvailable;

    public Product(String category, String inventoryId, String name, double pricePerPound, int qtyAvailable) {
        this.category = category;
        this.inventoryId = inventoryId;
        this.name = name;
        this.pricePerPound = pricePerPound;
        this.qtyAvailable = qtyAvailable;
    }


}
