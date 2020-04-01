package highway.vehicle;

public class Car extends VehicleBase {

    public Car(String registrationNumber, int horsepower) {
        //we execute the logic of the parent's class constructor
        super(registrationNumber, horsepower);
    }

    @Override
    public void start() {
        //super.start() calls start() method in the parent class and executes its logic
        super.start();
        this.speed = 15;
    }

    @Override
    public double calculateHighwayTax() {
        return this.horsepower * 0.2;
    }

}
