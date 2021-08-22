package com.company.distributor;

import java.util.Scanner;

public class Console {
    public static final Scanner scanner = new Scanner(System.in);
    public void displayProduce() {
        System.out.println("%%%%%%%%%%%%% Fresh Produce %%%%%%%%%%%%%");
        System.out.println("""
                            1). Fruits:\s
                            2). Meats: \s
                            3). Veggies:\s""");
        System.out.println("Enter Selection: ");
        String productSelected = scanner.next();
        switch (productSelected) {
            case "1":
                System.out.println("""
                        1). Apples\s
                        2). Bananas\s
                        3). Peaches\s
                        4). Pears\s
                        5). Strawberries\s
                        """);
                System.out.println("Enter Selection: ");
                String fruitSelected = scanner.next();
                break;
            case "2":
                System.out.println("""
                        1). Red Meat
                        2). Pork\s
                        3). Chicken\s
                        4). Fish
                        """);
                System.out.println("Enter Selection: ");
                String meatSelected = scanner.next();
                break;
            case "3":
                System.out.println("""
                        1). Beans
                        2). Corn\s
                        3). Tomatoes\s
                        4). Squash
                        """);
                System.out.println("Enter Selection: ");
                String vegSelected = scanner.next();
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
}
