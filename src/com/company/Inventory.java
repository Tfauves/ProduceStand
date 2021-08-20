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

    // TODO: 8/20/2021 add menu of which object to create and add to inventory 
    public void addToInventory(String category, String inventoryId, String name, double retailPricePerPound, double cost, int qty) {
        Product produce = new Product(category, inventoryId, name, retailPricePerPound, cost, qty);
        inventoryList.add(produce);
    }



//    public void addToInventory(Product product){
//        inventoryList.add(product);
//
//    }


    public void shrinkInventory(String name, int qty) {

        double shrinkageTotal = 0;
        for (Product product : getInventoryList()) {
            if (product.getName().equals(name)) {
                product.setQtyAvailable(product.getQtyAvailable() - qty);
               // System.out.println("You selected to remove: " + product.getName() + " from inventory. Is this correct y/n: ");
                shrinkage.add(product);
                shrinkageTotal = qty * product.getRetailPricePerPound();
                System.out.println();
                System.out.println("Current shrinkage: " + qty + product.getName() + shrinkageTotal);

           }

        }
        //getInventoryList().removeIf(product -> product.getName().equals(name));


}

    public void displayProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println("Stock of " + product.getName() + " is " + product.getQtyAvailable() + " priced at " + "$" + product.getRetailPricePerPound() + " per pound.");

        }
    }

   public List<Product> getInventoryList() {
       return inventoryList;
   }

    public void setInventoryList(Product product) {

       inventoryList.add(product);
    }

//   public List<Product> getReOrder() {
//
//       return new ArrayList<>(reOrder);
//   }

    public void setReOrder(Product product) {

       reOrder.add(product);
    }

   public List<Product> getShrinkage() {

       return new ArrayList<>(shrinkage);
   }

    public void setShrinkage(List<Product> shrinkage) {

       this.shrinkage = shrinkage;
    }


}
