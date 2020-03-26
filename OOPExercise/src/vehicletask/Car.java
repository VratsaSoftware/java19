package vehicletask;

public class Car extends Vehicle implements IMove {

    public Car() {}

    public Car(int yearOfProduction, String brand, String model, int drivenKm) {
        super(yearOfProduction, brand, model, drivenKm);
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }
}
