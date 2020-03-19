package com.vsc;

public class PostAddressTask {

    public static void main(String[] args) {
        String[] addressArray = {"Ivan Ivanov", "Bulgaria", "Vratsa", "Kokiche 14", "3000"};
        System.out.println(formatPostAddress(addressArray));
    }

    public static String formatPostAddress(String[] addressArray) {
        return String.format("%s\n%s\n%s\n%s\n%s",
                addressArray[0], addressArray[1], addressArray[2], addressArray[3], addressArray[4]);
    }
}
