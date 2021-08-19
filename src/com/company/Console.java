package com.company;
import java.util.*;


public class Console {
    public Scanner scanner = new Scanner(System.in);
    public int userSelection;

    public void displayMenu() {
        System.out.println("%%%%%%%%%%%%% Menu Options %%%%%%%%%%%%% ");
        System.out.println("1). Purchase Inventory.");
        System.out.println("2). Sell Produce.");
        System.out.println("3). Shrink Inventory.");
        System.out.println("4). Add Product To Inventory.");
        System.out.println("5). Display Store Balance.");
        System.out.println("Enter selection: ");

        userSelection = scanner.nextInt();
    }

    public void handleMenu() {
        switch (userSelection) {


        }
    }

    public static void spaces() {
        int spaceCounter = 0;
        while (spaceCounter < 33) {
            System.out.println();
            spaceCounter++;
        }
    }


}
