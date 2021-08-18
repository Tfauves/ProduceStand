package com.company;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
   public List<Product> inventoryList = new ArrayList<>();
   public List<Product> reOrder = new ArrayList<>();
   public List<Product> shrinkage = new ArrayList<>();

    public void addToInventory(Product product){
        inventoryList.add(product);

    }

    public void removeFromInventory() {
        for (Product product : inventoryList) {
            if (product.getQtyAvailable() == 0) {
                inventoryList.remove(product);
                reOrder.add(product);
            }
        }

    }

    public void shrinkInventory() {

    }


    public void displayProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }

    public void sellProduct(String name, int qty) {
        for (Product product : inventoryList) {
//needs error check against name
           if (name.equals(product.getName())) {
                double total = Math.ceil(qty * product.getPricePerPound());
                int itemQty = product.getQtyAvailable();
                int newQty = itemQty - qty;
                if (newQty <= 0) {
                    inventoryList.remove(product);
                    System.out.println("The current stock of " + product.getName() + " is " + newQty);
                    System.out.println("Would like to place item on the reorder list? y/n");
                    //if input = y add to reorderOrderReport

                }
                product.setQtyAvailable(newQty);
                System.out.println("The total for this sale is: " + "$" + total);
                break;

            }
        }

    }


}
