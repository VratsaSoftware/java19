package vehicletask;

public class Vehicle implements IMove{

    private int yearOfProduction;
    private String brand;
    private String model;
    private int drivenKm;
    private Vehicle[] vehiclesList;

    public Vehicle(Vehicle[] vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

    public Vehicle() {
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.model = model;
        this.drivenKm = drivenKm;
    }

    public Vehicle(int yearOfProduction, String brand, String model, int drivenKm) {
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.model = model;
        this.drivenKm = drivenKm;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDrivenKm() {
        return drivenKm;
    }

    public void setDrivenKm(int drivenKm) {
        this.drivenKm = drivenKm;
    }

    public void printVehiclesList() {
        for (Vehicle vehicle: vehiclesList) {
            System.out.println(vehicle.getBrand() + " " + vehicle.getModel());
            System.out.println(vehicle.getDrivenKm() + " " + vehicle.getYearOfProduction());
            vehicle.move();
            System.out.println("-----------------------------------");

        }
    }

    @Override
    public void move() { }
}
