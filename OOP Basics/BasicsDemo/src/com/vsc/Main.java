package com.vsc;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(10);
        System.out.println(animal.getAge());
        animal.move();

        Dog dog = new Dog(2, "brown");
        System.out.println(dog.getColor() + " " + dog.getAge());
        dog.move();

        Dolphin dolphin = new Dolphin(50, "Jonny");
        System.out.println(dolphin.getName() + " " + dolphin.getAge());
        dolphin.move();
    }
}
