package com.vsc;

public class Cat {

    byte age;
    String color;
    String kind;
    String name;

    public Cat(byte age, String color, String kind, String name) {
        this.age = age;
        this.color = color;
        this.kind = kind;
        this.name = name;
    }

    public Cat(byte age) {
        this.age = age;
    }

//    public Cat() {
//        this.age = age;
//        this.color = color;
//        this.kind = kind;
//        this.name = name;
//    }

    public Cat(byte age, String name) {
        this.age = age;
        this.name = name;
    }
}
