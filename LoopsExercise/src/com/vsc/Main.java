package com.vsc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startInfiniteCalculator();
    }

    private static void startInfiniteCalculator() {
        int userInputTwo;
        do {
            int userInputOne = getNumberFromUser();
            userInputTwo = getNumberFromUser();
            int sum = sum(userInputOne, userInputTwo);
            System.out.println(sum);
        } while (userInputTwo != 0);
    }

    private static int sum(int userInputOne, int userInputTwo) {
        return userInputOne + userInputTwo;
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        return scanner.nextInt();
    }
}
