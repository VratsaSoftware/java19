package com.vsc;

import java.util.Scanner;

public class PhoneTask {

    public static void main(String[] args) {
        String[] myContacts = {"Pesho", "Gosho", "Ivan", "Petkan", "Dragan", "Georgi", "Asen", "Mariika", "Temenujka"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact number from 1 to 9");
        int contactNumber = input.nextInt();

        if (contactNumber > 0 && contactNumber <= 9) {
            System.out.println("Calling.." + myContacts[contactNumber - 1]);
        } else {
            System.out.println("Try again next time");
        }

    }
}
