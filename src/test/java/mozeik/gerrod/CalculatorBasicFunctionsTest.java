package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class CalculatorBasicFunctionsTest {

    CalculatorBasicFunctions calculatorBasicFunctions = new CalculatorBasicFunctions();

    @Test
    public void calculateAdditionTest() {
        double firstNumber = 1, secondNumber = 2;
        assertEquals(3, calculatorBasicFunctions.calculateAddition(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateSubtractionTest() {
        double firstNumber = 3, secondNumber = 2;
        assertEquals(1, calculatorBasicFunctions.calculateSubtraction(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateMultiplicationTest() {
        double firstNumber = 3, secondNumber = 2;
        assertEquals(6, calculatorBasicFunctions.calculateMultiplication(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateDivisionTest() {
        double firstNumber = 4, secondNumber = 2;
        assertEquals(2, calculatorBasicFunctions.calculateDivision(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateDivisionByZeroTest() {
        double firstNumber = 2, secondNumber = 0;
        assertEquals(0, calculatorBasicFunctions.calculateDivision(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateInvertTest() {
        double firstNumber = 3;
        assertEquals(0.3333333333333333, calculatorBasicFunctions.calculateInvert(3), 0.0);
    }

}