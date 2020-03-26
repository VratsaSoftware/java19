package vehicletask;

public class MotorByke extends Vehicle implements IMove {

    public MotorByke() {}

    public MotorByke(int yearOfProduction, String brand, String model, int drivenKm) {
        super(yearOfProduction, brand, model, drivenKm);
    }

    @Override
    public void move() {
        System.out.println("MotorByke move");
    }
}
