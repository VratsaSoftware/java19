package highway.vehicle;

public class VehicleBase implements Vehicle {

    protected String registrationNumber;
    protected int horsepower;
    protected int speed;
    protected boolean isProtectionOn;

    public VehicleBase(String registrationNumber, int horsepower) {
        this.registrationNumber = registrationNumber;
        this.horsepower = horsepower;
        this.speed = 0;
        this.isProtectionOn = false;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public void start() {
        this.isProtectionOn = true;
    }

    @Override
    public int increaseSpeed(int kph) {
        return this.speed += kph;
    }

    @Override
    public int decreaseSpeed(int kph) {
        return this.speed -= kph;
    }

    @Override
    public void stop() {
        this.speed = 0;
        this.isProtectionOn = false;
    }

    @Override
    public boolean doesItMove() {
        return this.speed > 0;
    }

    public boolean isProtectionOn() {
        return isProtectionOn;
    }

    public double calculateHighwayTax() {
        return 0.0;
    }

}
