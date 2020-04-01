package vehicle;

import highway.vehicle.Car;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void testCarSpeedWhenCarInitialized() {
        Car car = new Car("BP6754AA", 200);
        int expected = 0;
        int actual = car.getSpeed();
        Assert.assertEquals("The speed is supposed to be zero on car initialization",
                expected, actual);
    }

    @Test
    public void testIsProtectionOnWhenCarInitializedThenReturnFalse() {
        Car car = new Car("BP6754AA", 200);
        boolean actual = car.isProtectionOn();
        Assert.assertFalse("The belt is not supposed to be on on car initialization",
                actual);
    }

    @Test
    public void testCarSpeedWhenCarStarts() {
        Car car = new Car("BP6754AA", 200);
        car.start();
        int expected = 15;
        int actual = car.getSpeed();
        Assert.assertEquals("The speed is supposed to be different", expected, actual);
    }

    @Test
    public void testIsProtectionOnWhenCarStopsThenReturnFalse() {
        Car car = new Car("BP6754AA", 200);
        car.start();
        car.stop();
        boolean actual = car.isProtectionOn();
        Assert.assertFalse("The belt is not supposed to be on", actual);
    }


}
