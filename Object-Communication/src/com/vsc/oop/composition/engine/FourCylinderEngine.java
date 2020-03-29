package com.vsc.oop.composition.engine;

import com.vsc.oop.composition.gearbox.Gearbox;

public class FourCylinderEngine implements Engine {

    @Override
    public void start(Gearbox gearbox) {
        System.out.println("starting engine " + this);
        gearbox.shiftGearUp();
    }
}
