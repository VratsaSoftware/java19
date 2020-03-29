package com.vsc.oop.exercise;

public class Kitten extends Cat {

    private static final String GENDER = "female";

    public Kitten(int age, String name) {
        super(age, name, GENDER);
    }
}
