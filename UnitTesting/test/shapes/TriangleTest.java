package shapes;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testCalculatePerimeterWhenSidesAreEqual() {
        Triangle triangle = new Triangle(2, 2, 2);
        double expected = 6.0;
        double actual = triangle.calculatePerimeter();
        Assert.assertEquals("The perimeter is not as expected", expected, actual, 0.01);
    }

    @Test
    public void testIsEquilateralWhenAllSidesAreEqualThenReturnTrue() {
        Triangle triangle = new Triangle(2, 2, 2);
        boolean actual = triangle.isEquilateral();
        Assert.assertTrue("The triangle is expected to be equilateral", actual);
    }

    @Test
    public void testIsEquilateralWhenSidesAreNotEqualThenReturnFalse() {
        Triangle triangle = new Triangle(3, 2, 2);
        boolean actual = triangle.isEquilateral();
        Assert.assertFalse("The triangle is not expected to be equilateral", actual);
    }

    @Test
    public void testIsIsoscelesWhenSideAEqualsSideBThenReturnTrue() {
        Triangle triangle = new Triangle(2, 2, 3);
        boolean actual = triangle.isIsosceles();
        Assert.assertTrue("The triangle is expected to be isosceles", actual);
    }

    @Test
    public void testIsIsoscelesWhenSideAEqualsSideCThenReturnTrue() {
        Triangle triangle = new Triangle(2, 4, 2);
        boolean actual = triangle.isIsosceles();
        Assert.assertTrue("The triangle is expected to be isosceles", actual);
    }


}
