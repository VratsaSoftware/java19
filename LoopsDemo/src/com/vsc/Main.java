package com.vsc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        testBreak(input);
        testContinue(input);
    }

    public static void testBreak(Scanner input) {
        int number;
        while (true) {
            System.out.println("Please, insert a number: ");
            number = input.nextInt();
            if (number == 0)
                break;

        }
    }

    public static void testContinue(Scanner input) {
        int number;
        while (true) {
            System.out.println("Please, insert a number: ");
            number = input.nextInt();
            if (number == 0)
                continue;
        }
    }
}
