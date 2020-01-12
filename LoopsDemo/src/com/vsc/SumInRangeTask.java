package com.vsc;

public class SumInRangeTask {
    public static void main(String[] args) {
        printSumInRange();
    }

    public static void printSumInRange() {
        int m = 2;
        int n = 10;
        int sum = 0;

        while (m <= n) {
            sum += m;
            m++;
            System.out.println(sum);
        }
    }
}
