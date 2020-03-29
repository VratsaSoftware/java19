package com.vsc.oop.exercise;

public abstract class Animal implements ISound {

    private int age;
    private String name;
    private String gender;

    protected Animal(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public static double calculateAverageAge(Animal[] animals) {
        float totalAgeSum = 0;
        for (Animal animal : animals) {
            totalAgeSum += animal.age;
            animal.makeSound();
        }

        return totalAgeSum  / animals.length;
    }
}
