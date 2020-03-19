package com.vsc;

import java.util.Scanner;

public class EqualsTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String favoriteLanguage = input.nextLine();

        if (favoriteLanguage.equalsIgnoreCase("java")) {
            System.out.println("Good choice");
        } else {
            System.out.println("Try again");
        }

    }
}
