package com.vsc;

public class Human {

    private int age;

    public Human(int age) {
        this.age = age;
    }

    public Human() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getOld() {
        this.age++;
        System.out.println(age);
    }
}
