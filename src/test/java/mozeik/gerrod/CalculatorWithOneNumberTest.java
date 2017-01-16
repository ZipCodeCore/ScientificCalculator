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
        double firstNumber = 3;
        assertEquals(0.3333333333333333, calculatorWithOneNumber.calculateInvert(3), 0.0);
    }

    @Test
    public void calculateSquareTest() {
        double firstNumber = 3;
        assertEquals(9, calculatorWithOneNumber.calculateSquare(3), 0.0);
    }

    @Test
    public void calculateSquareRootTest() {
        double firstNumber = 9;
        assertEquals(3, calculatorWithOneNumber.calculateSquareRoot(9), 0.0);
    }

}