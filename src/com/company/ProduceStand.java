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
        storeBalance -= produce.getCost();
    }


//    public void purchaseInventory(Product product) {
//        standInventory.setInventoryList(product);
//        storeBalance -= product.getCost();
//
//    }

    public void disPlayStoreBalance() {
        System.out.println("The current stand balance is: " + storeBalance);
    }

        public void handleMenu() {
        String category;
        String inventoryId;
        String name;
        double retailPricePerPound;
        double cost;
        int qty;
        boolean isActiveMenu = true;
            console.displayMenu();
            switch (console.userSelection) {
                case 1:
                    System.out.println("Enter Item details: ");
                    System.out.println("Category: ");
                    category = console.scanner.next();
                    System.out.println("Inventory Id: ");
                    inventoryId = console.scanner.next();
                    System.out.println("Name: ");
                    name = console.scanner.next();
                    System.out.println("Retail price per pound: ");
                    retailPricePerPound = console.scanner.nextDouble();
                    System.out.println("Cost: ");
                    cost = console.scanner.nextDouble();
                    System.out.println("Qty: ");
                    qty = console.scanner.nextInt();
                    purchaseInventory(category, inventoryId, name, retailPricePerPound, cost, qty);
                    break;

                case 2:
                    System.out.println("Name: ");
                    name = console.scanner.next();
                    System.out.println("Qty");
                    qty = console.scanner.nextInt();
                    sellProduct(name, qty);
                    break;

                case 3:
                    System.out.println("Name: ");
                    name = console.scanner.nextLine();
                    System.out.println("Qty");
                    qty = console.scanner.nextInt();
                    standInventory.shrinkInventory(name, qty);
                    break;

                case 4:
                    System.out.println("Enter Item details: ");
                    System.out.println("Category: ");
                    category = console.scanner.next();
                    System.out.println("Inventory Id: ");
                    inventoryId = console.scanner.nextLine();
                    System.out.println("Name: ");
                    name = console.scanner.nextLine();
                    System.out.println("Retail price per pound: ");
                    retailPricePerPound = console.scanner.nextDouble();
                    System.out.println("Cost: ");
                    cost = console.scanner.nextDouble();
                    System.out.println("Qty: ");
                    qty = console.scanner.nextInt();
                    standInventory.addToInventory(category, inventoryId, name, retailPricePerPound, cost, qty);
                    break;

                case 5:
                    disPlayStoreBalance();
                    break;

                case 6:
                    System.out.println("Exiting");
                    isActiveMenu = false;
                    break;

                default:
                    System.out.println("Invalid entry!");
                    break;


            }

    }




}
