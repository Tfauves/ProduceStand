package com.company;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
   public List<Product> inventoryList = new ArrayList<>();
   public List<Product> reOrder = new ArrayList<>();

    public void addToInventory(Product product){
        inventoryList.add(product);

    }

    public void removeFromInventory() {
        for (Product product : inventoryList) {
            if (product.qtyAvailable == 0) {
                inventoryList.remove(product);
                reOrder.add(product);
            }
        }

    }

    public void displayProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void sellProduct(String type, String name, int qty) {
        for (Product product : inventoryList) {
            if (type.equals(product.getCategory()) && name.equals(product.name)) {
                double total = qty * product.pricePerPound;
                System.out.println(total);
            }
        }

    }


}
