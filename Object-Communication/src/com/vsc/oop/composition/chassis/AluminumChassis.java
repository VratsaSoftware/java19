package com.vsc.oop.composition.chassis;

public class AluminumChassis implements Chassis {

    private static final String MATERIAL = "Aluminum";

    public AluminumChassis() {
    }

    @Override
    public String getMaterialFrom() {
        return MATERIAL;
    }
}
