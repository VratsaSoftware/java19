package com.vsc;

public class Student extends Human {

    private int number;

    public Student(int number) {
        super();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void doHomework() {
        System.out.println("do Homework");
    }
}
