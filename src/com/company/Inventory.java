package com.company;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
   private List<Product> inventoryList;
   private List<Product> reOrder;
   private List<Product> shrinkage;
   private double margin = 1.67;

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

    public void addToInventory(String category) {
//        Product produce = new Product(category, inventoryId, name, retailPricePerPound, cost, qty);
        switch (category) {
            case "1":
                System.out.println("Name: ");
                String fruitType = Console.scanner.next();
                Console.scanner.nextLine();
                System.out.println("Color: ");
                String fruitColor = Console.scanner.next();
                System.out.println("Qty: ");
                int fruitQty = Console.scanner.nextInt();
                System.out.println("Cost per pound: ");
                double fruitCost = Console.scanner.nextDouble();
                double fruitRetailPricePerPound = Math.round(fruitCost * margin);
                Fruit fruit = new Fruit(fruitType, fruitColor, fruitQty, fruitRetailPricePerPound);
                inventoryList.add(fruit);
                break;
            case "2":
                System.out.println("Name: ");
                String meatType = Console.scanner.next();
                Console.scanner.nextLine();
                System.out.println("Qty: ");
                int meatQty = Console.scanner.nextInt();
                System.out.println("Cost per pound: ");
                double meatCost = Console.scanner.nextDouble();
                double meatRetailPricePerPound = Math.round(meatCost * margin);
                Meat meat = new Meat(meatType, meatQty, meatRetailPricePerPound);
                inventoryList.add(meat);
                break;
            case "3":
                System.out.println("Name: ");
                String vegType = Console.scanner.next();
                Console.scanner.nextLine();
                System.out.println("In season y/n: ");
                String seasonalDiscount = Console.scanner.next();
                if(seasonalDiscount.equals("y")) {
                   margin = 1.57;
                    System.out.println("Qty: ");
                    int vegQty = Console.scanner.nextInt();
                    System.out.println("Cost per pound: ");
                    double vegCost = Console.scanner.nextDouble();
                    double vegRetailPricePerPound = Math.round(vegCost * margin);
                    Veggies veggies = new Veggies(vegType, true, vegQty, vegRetailPricePerPound);
                    inventoryList.add(veggies);
                    break;

                } else if (seasonalDiscount.equals("n")) {
                    System.out.println("Qty: ");
                    int vegQty = Console.scanner.nextInt();
                    System.out.println("Cost per pound: ");
                    double vegCost = Console.scanner.nextDouble();
                    double vegRetailPricePerPound = Math.round(vegCost * margin);
                    Veggies veggies = new Veggies(vegType, false, vegQty, vegRetailPricePerPound);
                    inventoryList.add(veggies);
                    break;
                }
            default:
                System.out.println("Name: ");
                String productType = Console.scanner.next();
                System.out.println("Qty: ");
                int productQty = Console.scanner.nextInt();
                System.out.println("Cost per pound: ");
                double productCost = Console.scanner.nextDouble();
                double productRetailPricePerPound = Math.round(productCost * margin);
                Product produce = new Product(productType, productQty, productRetailPricePerPound);
                inventoryList.add(produce);
                break;
        }

    }

    public void shrinkInventory(String name, int qty) {

        double shrinkageTotal = 0;
        for (Product product : getInventoryList()) {
            if (product.getName().equals(name)) {
                product.setQtyAvailable(product.getQtyAvailable() - qty);
               // System.out.println("You selected to remove: " + product.getName() + " from inventory. Is this correct y/n: ");
                shrinkage.add(product);
                shrinkageTotal = qty * product.getRetailPricePerPound();
                System.out.println();
                System.out.println("Current shrinkage: " + qty + " " + product.getName() + shrinkageTotal);

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
