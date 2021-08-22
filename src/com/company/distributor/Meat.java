package com.company.distributor;

public class Meat extends Produce{
    private boolean isMarinated;

    public Meat(String type, double cost, int qty, boolean isMarinated) {
        super(type, cost, qty);
        this.isMarinated = isMarinated;
    }
}
