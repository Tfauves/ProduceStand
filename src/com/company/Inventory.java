package com.company;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
   private List<Product> inventoryList;
   private List<Product> reOrder;
   private List<Product> shrinkage;

   public Inventory() {
       this.inventoryList = new ArrayList<>();
       this.reOrder = new ArrayList<>();
       this.shrinkage = new ArrayList<>();
   }


    public void addToInventory(Product product){
        inventoryList.add(product);

    }

    public void shrinkInventory(String name, int qty) {
        double shrinkageTotal = 0;
        for (Product product : getInventoryList()) {
            if (product.getName().equals(name) && product.getQtyAvailable() > 0) {
               // System.out.println("You selected to remove: " + product.getName() + " from inventory. Is this correct y/n: ");
                inventoryList.remove(product);
                shrinkage.add(product);
                shrinkageTotal = qty * product.getRetailPricePerPound();
                System.out.println();
                System.out.println("Current shrinkage: " + shrinkageTotal);

            }

        }

    }

    public void displayProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }


   public List<Product> getInventoryList() {
       return new ArrayList<>(inventoryList);
   }

    public void setInventoryList(List<Product> inventoryList) {
        this.inventoryList = inventoryList;
    }

   public List<Product> getReOrder() {
       return new ArrayList<>(reOrder);
   }

    public void setReOrder(List<Product> reOrder) {
        this.reOrder = reOrder;
    }

   public List<Product> getShrinkage() {
       return new ArrayList<>(shrinkage);
   }

    public void setShrinkage(List<Product> shrinkage) {
        this.shrinkage = shrinkage;
    }


}
