package com.vsc.oop.composition.lottery;

import com.vsc.oop.composition.Car;

public class Participant {

    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void takePrize(Car car) {
        car.startCar("winter");
    }
}
