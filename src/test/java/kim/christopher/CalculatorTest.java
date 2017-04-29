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
        String firstOperand = "2.0", secondOperand = "2.0";
        String expectedSum = "4.0";

        //: When
        String actualSum = controller.calc.add(firstOperand, secondOperand);

        //: Then
        assertEquals("2 + 2 should equal 4", expectedSum, actualSum);

    }

    @Test
    public void testSubtraction(){

        //: Given
        String firstOperand = "5.0", secondOperand = "3.0";
        String expectedResult = "2.0";

        //: When
        String actualResult = controller.calc.subtract(firstOperand, secondOperand);

        //: Then
        assertEquals("5 - 3 should equal 2", expectedResult, actualResult);

    }

    @Test
    public void testMultiplication(){

        //: Given
        String firstOperand = "5.0", secondOperand = "3.0";
        String expectedProduct = "15.0";

        //: When
        String actualProduct = controller.calc.multiply(firstOperand, secondOperand);

        //: Then
        assertEquals("5 * 3 should equal 15", expectedProduct, actualProduct);
    }

    @Test
    public void testDivision(){

        //: Given
        String firstOperand = "5.0", secondOperand = "3.0";
        String expectedQuotient = "1.6666666666666667";

        //: When
        String actualQuotient = controller.calc.divide(firstOperand, secondOperand);

        //: Then
        assertEquals("5 / 3 should be approximately 1.66667", expectedQuotient, actualQuotient);
    }

    @Test
    public void testDivisionByZero(){

        //: Given
        String firstOperand = "5.0", secondOperand = "0.0";

        //: When
        String result = controller.calc.divide(firstOperand, secondOperand);

        //: Then
        assertTrue(Double.isNaN(Double.parseDouble(result)));

    }




}
