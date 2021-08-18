package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProduceStand myStand  = new ProduceStand();

        myStand.standInventory.addToInventory(new Fruit("fruit", "#001", "apple", 1.59, 6, "red"));
        myStand.standInventory.addToInventory(new Meat("meat", "#003", "steak", 8.29, 3, true));
        myStand.standInventory.addToInventory(new Veggies("veggies", "#006", "corn", 2.99, 12, true));

        myStand.standInventory.displayProducts(myStand.standInventory.inventoryList);
        myStand.standInventory.sellProduct("apple", 6);
        myStand.standInventory.displayProducts(myStand.standInventory.inventoryList);

        for (Product product : myStand.standInventory.inventoryList) {
            System.out.println(product.getQtyAvailable());
        }







    }



}
