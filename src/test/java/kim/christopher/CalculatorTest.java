package kim.christopher;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Controller controller;

    @Before
    public void initialize(){
        controller = new Controller();
    }

    @Test
    public void testAddition(){

        //: Given
        double firstOperand = 2.0, secondOperand = 2.0;
        double expectedSum = 4.0;

        //: When
        double actualSum = controller.calculator.add(firstOperand, secondOperand);

        //: Then
        assertEquals("2 + 2 should equal 4", expectedSum, actualSum, 0);

    }

    @Test
    public void testSubtraction(){

        //: Given
        double firstOperand = 5.0, secondOperand = 3.0;
        double expectedResult = 2.0;

        //: When
        double actualResult = controller.calculator.subtract(firstOperand, secondOperand);

        //: Then
        assertEquals("5 - 3 should equal 2", expectedResult, actualResult, 0);

    }

    @Test
    public void testMultiplication(){

        //: Given
        double firstOperand = 5.0, secondOperand = 3.0;
        double expectedProduct = 15.0;

        //: When
        double actualProduct = controller.calculator.multiply(firstOperand, secondOperand);

        //: Then
        assertEquals("5 * 3 should equal 15", expectedProduct, actualProduct, 0);
    }

    @Test
    public void testDivision(){

        //: Given
        double firstOperand = 5.0, secondOperand = 3.0;
        double expectedQuotient = 1.66666666667;

        //: When
        double actualQuotient = controller.calculator.divide(firstOperand, secondOperand);

        //: Then
        assertEquals("5 / 3 should be approximately 1.66667", expectedQuotient, actualQuotient, 0.00001);
    }

    @Test
    public void testDivisionByZero(){

        //: Given
        double firstOperand = 5.0, secondOperand = 0.0;

        //: When
        double result = controller.calculator.divide(firstOperand, secondOperand);

        //: Then
        assertTrue(Double.isNaN(result));

    }




}
