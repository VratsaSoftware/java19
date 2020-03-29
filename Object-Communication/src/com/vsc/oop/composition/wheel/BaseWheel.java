package com.vsc.oop.composition.wheel;

public abstract class BaseWheel implements Wheel {

    private Tire tire;
    private Rim rim;

    protected BaseWheel(Tire tire, Rim rim) {
        this.tire = tire;
        this.rim = rim;
    }

    @Override
    public boolean startSpinning(String season) {
        return isInCondition(season);
    }

    public boolean isInCondition(String season) {
        if (this.tire == null || this.rim == null) {
            return false;
        }

        return (season.equals("winter") && this.tire.isWinterTire())
                || (season.equals("summer") && !this.tire.isWinterTire());
    }
}
