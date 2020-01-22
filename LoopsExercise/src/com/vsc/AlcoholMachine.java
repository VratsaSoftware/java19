package com.vsc;

import java.util.Scanner;

public class AlcoholMachine {
    static String drinkName1 = "Vodka";
    static String drinkName2 = "Rakiya";
    static String drinkName3 = "Whiskey";
    static String drinkName4 = "Beer";
    static final int drinkCode1 = 13;
    static final int drinkCode2 = 15;
    static final int drinkCode3 = 7;
    static final int drinkCode4 = 8;
    static double drinkOnePrice = 2.4;
    static double drinkTwoPrice = 1.5;
    static double drinkThreePrice = 1;
    static double drinkFourPrice = 3;

    public static void main(String[] args) {
        sellAlcohol();
    }

    private static void sellAlcohol() {
        int drinkCode;
        double totalPrice = 0.0;
        do {
            printMenu();
            int age = getNumberFromUser();
            drinkCode = getNumberFromUser();
            if (age < 18) {
                System.out.println("NO");
            } else {
                totalPrice += sellDrink(drinkCode);
                if (drinkCode != 0) {
                    System.out.println("Your current account is: " + totalPrice);
                }
                sellDrink(drinkCode);
            }
        } while (drinkCode != 0);
    }

    private static void printMenu() {
        printSingleDrink(drinkCode1, drinkName1, drinkOnePrice);
        printSingleDrink(drinkCode2, drinkName2, drinkTwoPrice);
        printSingleDrink(drinkCode3, drinkName3, drinkThreePrice);
        printSingleDrink(drinkCode4, drinkName4, drinkFourPrice);
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        return scanner.nextInt();
    }

    private static double sellDrink(int code) {
        switch (code) {
            case drinkCode1:
                System.out.println("Get your " + drinkName1);
                return drinkOnePrice;
            case drinkCode2:
                System.out.println("Get your " + drinkName2);
                return drinkTwoPrice;
            case drinkCode3:
                System.out.println("Get your " + drinkName3);
                return drinkThreePrice;
            case drinkCode4:
                System.out.println("Get your " + drinkName4);
                return drinkFourPrice;
            default:
                System.out.println("Please choose from available drinks");
        }
        return 0;
    }

    private static void printSingleDrink(int drinkCode1, String drinkName1, double drinkPrice) {
        System.out.println("Code:" + drinkCode1 + " - " + drinkName1 + " " + drinkPrice);
    }
}
