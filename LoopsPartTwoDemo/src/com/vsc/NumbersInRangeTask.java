package com.vsc;

import java.util.Scanner;

public class NumbersInRangeTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter m:");
        int m = input.nextInt();
        System.out.println("Enter n:");
        int n = input.nextInt();

        for (int i = m; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
