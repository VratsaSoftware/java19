package com.vsc;

public class MaxNumberInArray {

    public static void main(String[] args) {
        int[] array = {43, 56, 4, 3, 6, 8, 43, 5, 7, 87, 4, 3, 5, 6};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
