package com.vsc;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 9, 6},
                {9, 4, 3, 9},
                {5, 3, 7, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
