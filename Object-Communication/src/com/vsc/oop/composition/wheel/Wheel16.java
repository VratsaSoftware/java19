package com.vsc.oop.composition.wheel;

public class Wheel16 extends BaseWheel {

    private int size = 16;

    public Wheel16(Tire tire, Rim rim) {
        super(tire, rim);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printSize() {
        System.out.println(size);
    }


}
