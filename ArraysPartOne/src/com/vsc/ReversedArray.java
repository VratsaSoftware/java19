package com.vsc;

public class ReversedArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] newArray = {1, 2, 3, 4, 5};

//        for (int i = 0; i < myArray.length; i++) {
//            newArray[i] = myArray[myArray.length - 1 - i];
//            System.out.println(newArray[i]);
//        }

//        int j = 0;
//        for (int i = myArray.length - 1; i >= 0; i--) {
//            System.out.println(myArray.length - i - 1);
//            newArray[j] = myArray[myArray.length - i - 1];
//            j++;
//        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
