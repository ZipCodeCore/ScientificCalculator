package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/16/17.
 */
public class CalculatorSingleVariableFunctionsTest {
    @Test
    public void calculateSquareTest() {
        double firstNumber = 2;
        assertEquals(4, CalculatorSingleVariableFunctions.calculateSquare(firstNumber),0.0);
    }

    @Test
    public void calculateSquareRootTest()  {
        double firstNumber = 101;
        assertEquals(10.05, CalculatorSingleVariableFunctions.calculateSquareRoot(firstNumber),0.01);
    }

    @Test
    public void calculateInverseTest() {
        double firstNumber = 10;
        assertEquals(.1, CalculatorSingleVariableFunctions.calculateInverse(firstNumber),0.01);
    }

    @Test
    public void calculateSignInversion() {
        double firstNumber = -2;
        assertEquals(2,CalculatorSingleVariableFunctions.calculateSignInversion(firstNumber),0.00);
    }

    @Test
    public void calculateFactorialTest() {
        double firstNumber = 5;
        assertEquals(120,CalculatorSingleVariableFunctions.calculateFactorial(firstNumber),0.0);
    }

    @Test
    public void calculateSineTest() {
        double firstNumber = 45;
        assertEquals(.8509,CalculatorSingleVariableFunctions.calculateSine(firstNumber),0.0001);
    }

    @Test
    public void calculateCosineTest() {
        double firstNumber = 1;
        assertEquals(0.5403,CalculatorSingleVariableFunctions.calculateCosine(firstNumber),0.0001);
    }

    @Test
    public void calculateTangentTest() {
        double firstNumber = 1;
        assertEquals(1.5574,CalculatorSingleVariableFunctions.calculateTangent(firstNumber),0.0001);
    }

    @Test
    public void calculateArcsineTest() {
        double firstNumber = 1;
        assertEquals(1.5707,CalculatorSingleVariableFunctions.calculateArcSine(firstNumber),0.0001);
    }

    @Test
    public void calculateArcosineTest() {
        double firstNumber = .5;
        assertEquals(1.0471,CalculatorSingleVariableFunctions.calculateArcosine(firstNumber),0.001);
    }

    @Test
    public void calculateArctangentTest() {
        double firstNumber = 1;
        assertEquals(0.7853,CalculatorSingleVariableFunctions.calculateArcTangent(firstNumber),0.01);
    }

    @Test
    public void convertToDegreesTest() {
        double firstNumber = 4;
        assertEquals(229.1831,CalculatorSingleVariableFunctions.convertToDegrees(firstNumber),0.001);
    }
    @Test
    public void convertToRadiansTest() {
        double firstNumber = 45;
        assertEquals(.7853,CalculatorSingleVariableFunctions.convertToRadians(firstNumber),0.001);
    }
}