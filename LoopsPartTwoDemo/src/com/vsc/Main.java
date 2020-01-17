package com.vsc;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("j = " + j);
                for (int k = 0; k < 10; k++) {
                    System.out.println("k = " + k);
                }
            }
            System.out.println();
        }

    }
}
