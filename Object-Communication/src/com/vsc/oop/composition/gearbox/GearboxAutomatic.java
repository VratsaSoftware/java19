package com.vsc.oop.composition.gearbox;

public class GearboxAutomatic implements Gearbox {

    private int currentGear;

    @Override
    public int getCurrentGear() {
        return this.currentGear;
    }

    @Override
    public void shiftGearUp() {
        System.out.println("automatic up");
        this.currentGear++;
    }

    @Override
    public void shiftGearDown() {
        System.out.println("automatic down");
        this.currentGear--;
    }
}
