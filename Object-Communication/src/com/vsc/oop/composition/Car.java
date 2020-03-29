package com.vsc.oop.composition;

import com.vsc.oop.composition.chassis.Chassis;
import com.vsc.oop.composition.engine.Engine;
import com.vsc.oop.composition.gearbox.Gearbox;
import com.vsc.oop.composition.wheel.Wheel;

public class Car {

    private Engine engine;
    private Chassis chassis;
    private Wheel[] wheels;
    private Gearbox gearbox;

    private String brand;
    private String model;

    public Car(Engine engine, Chassis chassis, Wheel[] wheels, Gearbox gearbox, String brand, String model) {
        this.engine = engine;
        this.chassis = chassis;
        this.wheels = wheels;
        this.gearbox = gearbox;
        this.brand = brand;
        this.model = model;

        System.out.println(this.chassis.getMaterialFrom());
    }

    public void startCar(String season) {
        System.out.println("Current gear: " + this.gearbox.getCurrentGear());

        engine.start(this.gearbox);
        System.out.println("Current gear: " + this.gearbox.getCurrentGear());

        if (this.wheels.length == 4) {
            turnWheels(season);
        } else {
            System.out.println("Go to the repair shop");
        }
    }

    private void turnWheels(String season) {
        boolean areAllWheelsInCondition = true;

        for (Wheel wheel : wheels) {
            boolean isWheelInCondition = wheel.startSpinning(season);
            if (!isWheelInCondition) {
                areAllWheelsInCondition = false;
                break;
            }
        }

        if (areAllWheelsInCondition) {
            System.out.println("Wheels are spinning");
        } else {
            System.out.println("Cannot move");
        }
    }

    public String getCarName() {
        return this.brand + " " + this.model;
    }
}
