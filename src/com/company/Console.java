package com.company;
import java.util.*;


public class Console {
    public static final Scanner scanner = new Scanner(System.in);
    public int userSelection;



    public void displayMenu() {
            System.out.println("%%%%%%%%%%%%% Menu Options %%%%%%%%%%%%% ");
            System.out.println("1). Purchase Inventory.");
            System.out.println("2). Sell Produce.");
            System.out.println("3). Shrink Inventory.");
            System.out.println("4). Add Product To Inventory.");
            System.out.println("5). Display Store Balance.");
            System.out.println("6). Display Inventory.");
            System.out.println("7). Exit");
            System.out.println("Enter selection: ");

            userSelection = scanner.nextInt();
            spaces();
    }

    public void displayProducts(List<Product> productList) {
            System.out.println("%%%%%%%%%%% Inventory Report %%%%%%%%%%%");
            System.out.println("-----------------------------------------");
            System.out.println();

            for (Product product : productList) {
                System.out.println("Stock of " + product.getName() + " is " + product.getQtyAvailable() + " priced at " + "$" + product.getRetailPricePerPound() + " per pound.");

            }
            System.out.println("-----------------------------------------");
            System.out.println();
    }




    public static void spaces() {
        int spaceCounter = 0;
        while (spaceCounter < 33) {
            System.out.println();
            spaceCounter++;
        }
    }


}
