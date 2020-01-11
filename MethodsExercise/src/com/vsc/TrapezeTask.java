package com.vsc;

import java.util.Scanner;

public class TrapezeTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side a:");
        int sideA = input.nextInt();
        System.out.println("Enter side b:");
        int sideB = input.nextInt();
        System.out.println("Enter side h:");
        int height = input.nextInt();

        System.out.println(calculateTrapezeArea(sideA, sideB, height));
    }

    public static double calculateTrapezeArea(int sideA, int sideB, int height) {
        double trapezeArea = ((sideA + sideB) * height) / 2;
        return trapezeArea;
    }
}
