package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/14/17.
 */
public class CalculatorTwoVariableFunctionsTest {


    @Test
    public void calculateAdditionTest() {
        double firstNumber = 2, secondNumber  = 2;
        assertEquals(4, CalculatorTwoVariableFunctions.calculateAddition(firstNumber,secondNumber),0.0);
    }

    @Test
    public void calculateSubtractionTest(){
        double firstnumber = 2, secondNumber = 2;
        assertEquals(0, CalculatorTwoVariableFunctions.calculateSubtraction(firstnumber,secondNumber),0.0);
    }

    @Test
    public void calculateMultiplicationTest(){
        double firstNumber = 5, secondnumber  = 6;
        assertEquals(30, CalculatorTwoVariableFunctions.calculateMultiplication(firstNumber,secondnumber),0.0);
    }

    @Test
    public void calculateDivisionTest(){
        double firstNumber = 5, secondnumber  = 2;
        assertEquals(2.5, CalculatorTwoVariableFunctions.calculateDivision(firstNumber,secondnumber),0.0);
    }

    @Test
    public void calculateDivisionByZeroTest(){
        double firstNumber = 5, secondnumber  = 0;
        assertEquals(0, CalculatorTwoVariableFunctions.calculateDivision(firstNumber,secondnumber),0.0);
    }

    @Test
    public void calculateToThePowerOfTest() {
        double firstNumber = 5, secondnumber = 3;
        assertEquals(125, CalculatorTwoVariableFunctions.calculateToThePowerOf(firstNumber, secondnumber), 0.0);
    }
}