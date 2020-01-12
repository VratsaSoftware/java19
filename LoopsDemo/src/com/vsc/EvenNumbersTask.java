package com.vsc;

import java.util.Scanner;

public class EvenNumbersTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int number = input.nextInt();
        printEvenNumber(number);
    }

    public static void printEvenNumber(int number) {

        int counter = 1;
//        while (counter <= number) {
//            if (counter % 2 == 0) {
//                System.out.println(counter);
//            }
//            counter++;
//        }
        do {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        } while (counter <= number);
    }
}
