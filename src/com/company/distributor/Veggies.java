package com.company.distributor;

public class Veggies extends Produce{
    private boolean isInseason;

    public Veggies(String type, double cost, int qty, boolean isInseason) {
        super(type, cost, qty);
        this.isInseason = isInseason;
    }
}
