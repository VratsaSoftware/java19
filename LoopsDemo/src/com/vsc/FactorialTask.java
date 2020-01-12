package com.vsc;

import java.util.Scanner;

public class FactorialTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int number = input.nextInt();
        calculateFactorial(number);
    }

    private static void calculateFactorial(int n) {
        int counter = 1;
        int result = 1;

        while (counter <= n) {
            result *= counter;
            counter++;
        }

        System.out.println(result);
    }
}
