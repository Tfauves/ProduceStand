package com.company;
import java.util.*;


public class Console {
    public Scanner scanner = new Scanner(System.in);
    public int userSelection;

    public static void displayMenu() {
        System.out.println("%%%%%%%%%%%%% Menu Options %%%%%%%%%%%%% ");

    }

    public static void spaces() {
        int spaceCounter = 0;
        while (spaceCounter < 33) {
            System.out.println();
            spaceCounter++;
        }
    }


}
