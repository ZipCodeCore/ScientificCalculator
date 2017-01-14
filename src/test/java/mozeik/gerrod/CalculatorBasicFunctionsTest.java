package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class CalculatorBasicFunctionsTest {
    @Test
    public void calculateAdditionTest() {
        double firstNumber = 1, secondNumber = 2;
        assertEquals(3, CalculatorBasicFunctions.calculateAddition(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateSubtractionTest() {
        double firstNumber = 3, secondNumber = 2;
        assertEquals(1, CalculatorBasicFunctions.calculateSubtraction(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateMultiplicationTest() {
        double firstNumber = 3, secondNumber = 2;
        assertEquals(6, CalculatorBasicFunctions.calculateMultiplication(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateDivisionTest() {
        double firstNumber = 4, secondNumber = 2;
        assertEquals(2, CalculatorBasicFunctions.calculateDivision(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateDivisionByZeroTest() {
        double firstNumber = 2, secondNumber = 0;
        assertEquals(0, CalculatorBasicFunctions.calculateDivision(firstNumber, secondNumber), 0.0);
    }

}