package com.company;

import java.util.Calendar;
import java.util.Date;

public class ProduceStand {
    public Console console = new Console();
    public Inventory standInventory = new Inventory();
    private double storeBalance = 200;
    // TODO: 8/20/2021 change from double to longs and convert from cents to dollars for display.



    // TODO: 8/22/2021 employee validation, employee class? with map or list?
    public void open() {
        boolean showOpenInfo = true;
//        boolean isOpen = true;

        console.openLogin();
        handleMenu();


    }






    public void sellProduct(String name, int qty) {
        for (Product product : standInventory.getInventoryList()) {
//needs error check against name
            if (name.equals(product.getName())) {
                double total = Math.ceil(qty * product.getRetailPricePerPound());
                int itemQty = product.getQtyAvailable();
                int newQty = itemQty - qty;
                if (newQty <= 0) {
                    standInventory.getInventoryList().remove(product);
                    standInventory.setReOrder(product);
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

    public void purchaseInventory(String category, String inventoryId, String name, double retailPricePerPound, double cost, int qty) {
        Product produce = new Product(category, inventoryId, name, retailPricePerPound, cost, qty);
        standInventory.setInventoryList(produce);
        double purchaseTotal = produce.getCost() * qty;
        storeBalance -= purchaseTotal;
    }

    public void purchaseInventory(String category) {

//        Product produce = new Product(category, inventoryId, name, retailPricePerPound, cost, qty);
//        standInventory.setInventoryList(produce);
//        double purchaseTotal = produce.getCost() * qty;
//        storeBalance -= purchaseTotal;
    }

    public void disPlayStoreBalance() {
        System.out.println("The current stand balance is: " + storeBalance);
    }

    public void handleMenu() {
        String categorySelection;
        String name;
        int qty;
        int exit = 7;

        do {
            console.displayMenu();
            switch (console.userSelection) {
                case 1:
                    System.out.println("%%%%%%%%%%%%% Purchase Item %%%%%%%%%%%%% ");
                    System.out.println("Enter Item details: ");
                    System.out.println("Category: ");
                    System.out.println("""
                            1). Fruits:\s
                            2). Meats: \s
                            3). Veggies:\s""");
                    //access though instance reference or via static member.
                    categorySelection = Console.scanner.next();
                    purchaseInventory(categorySelection);
                    break;

                case 2:
                    System.out.println("%%%%%%%%%%%%% Sell %%%%%%%%%%%%% ");
                    console.displayProducts(standInventory.getInventoryList());
                    System.out.println("Name: ");
                    name = Console.scanner.next();
                    System.out.println("Qty");
                    qty = Console.scanner.nextInt();
                    sellProduct(name, qty);
                    break;

                case 3:
                    System.out.println("%%%%%%%%%%%%% Dispose Item %%%%%%%%%%%%% ");
                    System.out.println("Name: ");
                    name = Console.scanner.next();
                    System.out.println("Qty");
                    qty = Console.scanner.nextInt();
                    standInventory.shrinkInventory(name, qty);
                    break;

                case 4:
                    System.out.println("%%%%%%%%%%%%% Add Item To Inventory %%%%%%%%%%%%% ");
                    System.out.println("Enter Item details: ");
                    System.out.println("Category: ");
                    System.out.println("""
                            1). Fruits:\s
                            2). Meats: \s
                            3). Veggies:\s""");
                    categorySelection = Console.scanner.next();
                    standInventory.addToInventory(categorySelection);
                    break;

                case 5:
                    System.out.println("%%%%%%%%%%%%% Operating Fund %%%%%%%%%%%%% ");
                    System.out.println();
                    disPlayStoreBalance();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;

                case 6:
                    console.displayProducts(standInventory.getInventoryList());
                    break;

                case 7:
                    System.out.println("%%%%%%%%%%%%% Exit Menu %%%%%%%%%%%%% ");
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid entry!");
                    break;


            }
        } while(console.userSelection != exit);
    }


}
