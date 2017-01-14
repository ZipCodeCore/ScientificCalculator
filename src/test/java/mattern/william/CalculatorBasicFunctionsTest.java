package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/14/17.
 */
public class CalculatorBasicFunctionsTest {
    CalculatorBasicFunctions calculatorEngine = new CalculatorBasicFunctions();

    @Test
    public void calculateAdditionTest() {
        double firstNumber = 2, secondNumber  = 2;
        assertEquals(4,calculatorEngine.calculateAddition(firstNumber,secondNumber),0.0);
    }

    @Test
    public void calculateSubtractionTest(){
        double firstnumber = 2, secondNumber = 2;
        assertEquals(0,calculatorEngine.calculateSubtraction(firstnumber,secondNumber),0.0);
    }

    @Test
    public void calculateMultiplicationTest(){
        double firstNumber = 5, secondnumber  = 6;
        assertEquals(30, calculatorEngine.calculateMultiplication(firstNumber,secondnumber),0.0);
    }

    @Test
    public void calculateDivisionTest(){
        double firstNumber = 5, secondnumber  = 2;
        assertEquals(2.5, calculatorEngine.calculateDivision(firstNumber,secondnumber),0.0);
    }

    @Test
    public void calculateDivisionByZeroTest(){
        double firstNumber = 5, secondnumber  = 0;
        assertEquals(0, calculatorEngine.calculateDivision(firstNumber,secondnumber),0.0);
    }

}