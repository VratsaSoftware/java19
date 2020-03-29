package com.vsc.oop.composition.gearbox;

public class GearboxManual implements Gearbox {

    private int currentGear;

    @Override
    public int getCurrentGear() {
        return this.currentGear;
    }

    @Override
    public void shiftGearUp() {
        System.out.println("manual up");
        this.currentGear++;
    }

    @Override
    public void shiftGearDown() {
        System.out.println("manual down");
        this.currentGear--;
    }
}
