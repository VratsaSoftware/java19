package vehicletask;

public class TestClass {

    public static void main(String[] args) {

        Vehicle [] myVehicleList = new Vehicle[4];

        myVehicleList[0] = new Car(2014, "Audi", "A6", 120000);
        myVehicleList[1] = new MotorByke(2015, "Honda", "AllRoad", 50000);
        myVehicleList[2]= new Car(2011, "Bmw", "520", 100000);
        myVehicleList[3] = new Car (2012, "WV", "passat", 140000);


        Vehicle vehicle = new Vehicle(myVehicleList);
        vehicle.printVehiclesList();
    }
}
