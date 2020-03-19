package com.vsc;

import java.util.Scanner;

public class FormattedNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(formattedNumbers(number));
    }

    public static String formattedNumbers(int number) {
        StringBuilder formattedNumber = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            formattedNumber.append(i);
        }
        return formattedNumber.toString();
    }
}
