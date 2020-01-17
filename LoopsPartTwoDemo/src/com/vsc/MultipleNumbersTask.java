package com.vsc;

import java.util.Scanner;

public class MultipleNumbersTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int number = input.nextInt();

        int counter = 1;
        int sum = 0;

        while (counter <= number) {
//            if (counter % 2 != 0) {
//                sum += counter;
//            }
            sum += counter;
            counter += 2;
        }
        System.out.println("sum = " + sum);

    }
}
