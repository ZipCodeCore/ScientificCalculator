package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/16/17.
 */
public class CalculatorComplexFunctionsTest {
    @Test
    public void calculateSquareTest() {
        double firstNumber = 2;
        assertEquals(4,CalculatorComplexFunctions.calculateSquare(firstNumber),0.0);
    }

    @Test
    public void calculateSquareRootTest()  {
        double firstNumber = 101;
        assertEquals(10.05, CalculatorComplexFunctions.calculateSquareRoot(firstNumber),0.01);
    }

    @Test
    public void calculateInverseTest() {
        double firstNumber = 10;
        assertEquals(.1,CalculatorComplexFunctions.calculateInverse(firstNumber),0.01);
    }

}