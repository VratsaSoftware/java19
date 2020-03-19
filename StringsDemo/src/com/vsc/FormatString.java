package com.vsc;

public class FormatString {
    public static void main(String[] args) {
        String name = "Lilly";
        String lastName = "Mihaylova";
        byte age = 29;
        System.out.println(String.format("Fist Name: %s Last Name %s age: %d address %s",
                name, lastName,  age, "Kokiche"));
    }
}
