package com.vsc;

public class PrintMultipleNumbersTask {

    public static void main(String[] args) {
        printMultipleNumbers();
    }

    private static void printMultipleNumbers() {
        int m = 10;
        int n = 30;

        while (m <= n) {
            if (m % 2 == 0 && m % 3 == 0) {
                System.out.println(m);
            }
            m++;
        }
    }
}
