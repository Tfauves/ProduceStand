package com.company;

public class ProduceStand {
    public Console console = new Console();
    public Inventory standInventory = new Inventory();
    private double storeBalance = 200;



    public void sellProduct(String name, int qty) {
        for (Product product : standInventory.getInventoryList()) {
//needs error check against name
            if (name.equals(product.getName())) {
                double total = Math.ceil(qty * product.getRetailPricePerPound());
                int itemQty = product.getQtyAvailable();
                int newQty = itemQty - qty;
                if (newQty <= 0) {
                    standInventory.getInventoryList().remove(product);
                    standInventory.getReOrder().add(product);
                    System.out.println("The current stock of " + product.getName() + " is " + newQty);
                    System.out.println("Would like to place item on the reorder list? y/n");
                    //if input = y add to reorderOrderReport

                }
                product.setQtyAvailable(newQty);
                storeBalance += total;
                System.out.println("The total for this sale is: " + "$" + total);
                System.out.println(storeBalance);
                break;

            }
        }

    }

    public void purchaseInventory(Product product) {

        standInventory.getInventoryList().add(product);

    }



}
