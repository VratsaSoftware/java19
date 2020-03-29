package com.vsc.oop;

import com.vsc.oop.chess.Pawn;
import com.vsc.oop.chess.PlayingPiece;
import com.vsc.oop.exercise.Animal;
import com.vsc.oop.exercise.Cat;
import com.vsc.oop.exercise.Dog;
import com.vsc.oop.exercise.Kitten;
import com.vsc.oop.exercise.Tomcat;

public class Main {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Cat[] cats = new Cat[3];

        dogs[0] = new Dog(5, "Pesgo", "male");
        dogs[1] = new Dog(3, "Maria", "female");
        dogs[2] = new Dog(1, "nqkoj", "other");

        cats[0] = new Tomcat(5, "Pesgo");
        cats[1] = new Kitten(8, "Maria");
        cats[2] = new Tomcat(1, "nqkoj");

        System.out.println(Animal.calculateAverageAge(dogs));
        System.out.println(Animal.calculateAverageAge(cats));
    }
}
