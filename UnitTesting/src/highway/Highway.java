package highway;

import highway.vehicle.Car;
import highway.vehicle.Motorbike;
import highway.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collection;

public class Highway {
    Collection<Vehicle> vehiclesOnHighway;
    private double taxGathered;

    public Highway() {
        this.taxGathered = 0;
        this.vehiclesOnHighway = new ArrayList<>();
    }
    
    public void addNewVehicle(Vehicle vehicle) {
        this.vehiclesOnHighway.add(vehicle);
        this.taxGathered += vehicle.calculateHighwayTax();

        //this logic is not practical as if we decide to add more vehicles
        //it will become really mundane to always add new if clauses
        /*if (vehicle instanceof Car) {
            taxGathered += vehicle.getHorsepower() * 0.2;
        }

        if (vehicle instanceof Motorbike) {
            taxGathered += vehicle.getHorsepower() * 0.1;
        }*/
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehiclesOnHighway.remove(vehicle);
    }

    public int getNumberOfVehicles() {
        return this.vehiclesOnHighway.size();
    }

}
