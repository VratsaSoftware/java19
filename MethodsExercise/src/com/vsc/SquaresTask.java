package com.vsc;

import java.util.Scanner;

public class SquaresTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side for first square:");
        int firstSquareSide = input.nextInt();
        System.out.println("Enter side for second square:");
        int secondSquareSide = input.nextInt();

        findBiggerArea(calculateSquareArea(firstSquareSide), calculateSquareArea(secondSquareSide));
    }

    public static int calculateSquareArea(int squareSide) {
        return squareSide * squareSide;
    }

    public static void findBiggerArea(int firstSquareArea, int secondSquareArea) {
        if (firstSquareArea == secondSquareArea) {
            System.out.println("They are equal");
        } else {
            int result = (firstSquareArea > secondSquareArea) ? firstSquareArea : secondSquareArea;
            System.out.println("Bigger square is: " + result);
        }
    }
}
