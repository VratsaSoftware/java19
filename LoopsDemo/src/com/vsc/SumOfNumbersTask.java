package com.vsc;

import java.util.Scanner;

public class SumOfNumbersTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        findSumOfNumbers(number);

    }

    public static void findSumOfNumbers(int number) {
        int counter = 1;
        int sum = 0;

//        do {
//            sum += counter;
//            counter++;
//
//        } while (counter <= number);

        while (counter <= number) {
            sum = sum + counter;
            counter++;
        }


        System.out.println(sum);

    }
}
