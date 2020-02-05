package com.vsc;

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        int[] grades = new int[6];
        Scanner input = new Scanner(System.in);

        float average = 0;
        int min = 6;
        int max = 2;

        for (int i = 0; i <grades.length; i++) {
            System.out.println("Enter grade:");
            grades[i] = input.nextInt();

            if(grades[i] >=2 && grades[i]<=6) {
                average += grades[i];

                if (grades[i]> max) {
                    max = grades[i];
                }

                if (grades[i] < min) {
                    min = grades[i];
                }
            } else {
                System.out.println("Invalid input");
                i--;
            }
        }

        System.out.println("Average " + average/grades.length);
        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}
