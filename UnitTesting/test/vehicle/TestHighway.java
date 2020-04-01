package vehicle;

import highway.Highway;
import highway.vehicle.Car;
import highway.vehicle.Motorbike;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestHighway {
    private Highway highway;
    private static Car car;
    private static Motorbike motorbike;

    //this is going to be executed only once in the beginning
    @BeforeClass
    public static void setup() {
        car = new Car("BP7754AA", 200);
        motorbike = new Motorbike("BP7554AA", 250);
    }

    //this will be executed before each test
    @Before
    public void createHighway(){
        this.highway = new Highway();
    }

    @Test
    public void testAddNewVehicleThenIncreaseTheSizeOfTheVehiclesOnHighway() {
        this.highway.addNewVehicle(car);
        int expected = 1;
        int actual = highway.getNumberOfVehicles();
        Assert.assertEquals("The size of the list should be different", expected, actual);
    }

}
