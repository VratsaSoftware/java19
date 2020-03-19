package com.vsc;

import javax.security.auth.login.AccountNotFoundException;

public class Dog extends Animal {

    private String color;

    public Dog(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void sayBau() {
        System.out.println("Bau Bau");
    }

    public static void run() {
        System.out.println("Running...");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}
