package com.vsc;

import java.util.Scanner;

public class SameArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] firstArray = new int[3];
        int[] secondArray = new int[3];

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Enter number for first array:");
            firstArray[i] = input.nextInt();
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Enter number for second array:");
            secondArray[i] = input.nextInt();
        }


        if (firstArray.length == secondArray.length) {
            int flag = 0;
            for (int i = 0; i < secondArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    flag++;
                    break;
                }
            }
            if (flag > 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }

        } else {
            System.out.println("No");
        }
    }
}
