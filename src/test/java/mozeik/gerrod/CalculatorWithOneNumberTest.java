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

}