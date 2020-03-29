package com.vsc.oop.exercise;

public abstract class Cat extends Animal {

    protected Cat(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

}
