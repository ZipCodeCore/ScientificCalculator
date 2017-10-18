package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/16/17.
 */
public class CalculatorWithOneNumberTest {

    CalculatorWithOneNumber calculatorWithOneNumber = new CalculatorWithOneNumber();

    @Test
    public void calculateInvertTest() {
        assertEquals(0.3333333333333333, calculatorWithOneNumber.calculateInvert(3), 0.0);
    }

    @Test
    public void calculateSquareTest() {
        assertEquals(9, calculatorWithOneNumber.calculateSquare(3), 0.0);
    }

    @Test
    public void calculateSquareRootTest() {
        assertEquals(3, calculatorWithOneNumber.calculateSquareRoot(9), 0.0);
    }

    @Test
    public void signInvertTest() {
        assertEquals(-1, calculatorWithOneNumber.signInvert(1), 0.0);
    }

    @Test
    public void factorialTest() {
        assertEquals(6, calculatorWithOneNumber.calculateFactorial(3), 0.0);
    }

    @Test
    public void calculateSineTest() {
        assertEquals(0.5715301650260188, calculatorWithOneNumber.calculateSine(180), 0.0);
    }

    @Test
    public void calculateCosineTest() {
        assertEquals(-0.5984600690578581, calculatorWithOneNumber.calculateCosine(180), 0.0);
    }

    @Test
    public void calculateTangentTest() {
        assertEquals(1.3386902103511544, calculatorWithOneNumber.calculateTangent(180), 0.0);
    }

    @Test
    public void calculateAsinTest() {
        assertEquals(1.5707963267948966, calculatorWithOneNumber.calculateArcSine(1), 0.0);
    }

    @Test
    public void calculateAcosTest() {
        assertEquals(0, calculatorWithOneNumber.calculateArcCosine(1), 0.0);
    }

    @Test
    public void calculateAtanTest() {
        assertEquals(0.7853981633974483, calculatorWithOneNumber.calculateArcTangent(1), 0.0);
    }

    @Test
    public void convertDegreesToRadians() {
        assertEquals(57.29577951308232, calculatorWithOneNumber.degreesToRadians(1), 0.0);
    }

    @Test
    public void convertRadiansToDegrees() {
        assertEquals(0.017453292519943295, calculatorWithOneNumber.radiansToDegrees(1), 0.0);
    }
}