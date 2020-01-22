package com.vsc;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            myArray[i] = 5 + i;
            System.out.println(myArray[i]);
        }
    }
}
