package kamsheh.adam.project1calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by adam on 9/12/16.
 */
public class BasicOperationsTest {

    @Test
    public void addTest() {
        double expected = 10;
        double actual = BasicOperations.add(5, 5);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest() {
        double expected = 0;
        double actual = BasicOperations.subtract(5, 5);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplyTest() {
        double expected = 25;
        double actual = BasicOperations.multiply(5, 5);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void divideTest() {
        double expected = 2;
        double actual = BasicOperations.divide(10, 5);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareTest() {
        double expected = 25;
        double actual = BasicOperations.square(5);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareRootTest() {
        double expected = 5;
        double actual = BasicOperations.squareRoot(25);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void cubedRootTest() {
        double expected = 2;
        double actual = BasicOperations.cubedRoot(8);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void toThePowerTest() {
        double expected = 100;
        double actual = BasicOperations.toThePower(10, 2);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseTest() {
        double expected = .1;
        double actual = BasicOperations.inverse(10);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void changeSignTest() {
        double expected = -1;
        double actual = BasicOperations.changeSign(1);

        Assert.assertEquals(expected, actual, 0);
    }
}
