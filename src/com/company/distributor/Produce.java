package com.company.distributor;

public abstract class Produce {
    protected String type;
    protected double cost;
    protected int qty;

    public Produce(String type, double cost, int qty) {
        this.type = type;
        this.cost = cost;
        this.qty = qty;
    }
}
