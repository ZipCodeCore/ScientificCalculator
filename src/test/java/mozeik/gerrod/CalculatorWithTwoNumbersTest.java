package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class CalculatorWithTwoNumbersTest {

    CalculatorWithTwoNumbers calculatorWithTwoNumbers = new CalculatorWithTwoNumbers();

    @Test
    public void calculateAdditionTest() {
        double firstNumber = 1, secondNumber = 2;
        assertEquals(3, calculatorWithTwoNumbers.calculateAddition(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateSubtractionTest() {
        double firstNumber = 3, secondNumber = 2;
        assertEquals(1, calculatorWithTwoNumbers.calculateSubtraction(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateMultiplicationTest() {
        double firstNumber = 3, secondNumber = 2;
        assertEquals(6, calculatorWithTwoNumbers.calculateMultiplication(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateDivisionTest() {
        double firstNumber = 4, secondNumber = 2;
        assertEquals(2, calculatorWithTwoNumbers.calculateDivision(firstNumber, secondNumber), 0.0);
    }

    @Test
    public void calculateDivisionByZeroTest() {
        double firstNumber = 2, secondNumber = 0;
        assertEquals(0, calculatorWithTwoNumbers.calculateDivision(firstNumber, secondNumber), 0.0);
    }

}