package com.vsc;

public class HasSixInArray {

    public static void main(String[] args) {
        int[] myArray = {1, 4, 8, 0, 6};

        if (myArray[0] == 6 || myArray[myArray.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
