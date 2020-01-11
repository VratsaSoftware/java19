package com.vsc;

public class ConcatenateName {

    public static void main(String[] args) {
        String firstName = "Lilly";
        String lastName = "Mihaylova";
        String fullName = concatenateName(firstName, lastName);
        System.out.println(fullName);
        System.out.println(concatenateName(firstName, lastName));
    }

    public static String concatenateName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}
