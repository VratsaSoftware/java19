package com.vsc;

public class Dolphin extends Animal {

    private String name;

    public Dolphin(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
