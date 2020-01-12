package com.vsc;

import java.util.Scanner;

public class AskForNumbersTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        askForNumberWhileIsNotZero(input);
    }

    public static void askForNumberWhileIsNotZero(Scanner input) {
        int number = 1;
//        while (number != 0) {
//            System.out.println("Enter next number");
//            number = input.nextInt();
//        }
//
//        System.out.println("Goodbye!");

        do {
            System.out.println("Enter next number");
            number = input.nextInt();
        } while (number != 0);

        System.out.println("Goodbye!");
    }
}
