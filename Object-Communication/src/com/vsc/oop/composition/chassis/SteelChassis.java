package com.vsc.oop.composition.chassis;

public class SteelChassis implements Chassis {

    private static final String MATERIAL = "Steel";

    @Override
    public String getMaterialFrom() {
        return MATERIAL;
    }
}
