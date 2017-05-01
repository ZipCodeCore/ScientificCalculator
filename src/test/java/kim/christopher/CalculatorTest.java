package kim.christopher;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.lang3.math.NumberUtils;

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

        //: When
        String result = controller.calc.subtract(firstOperand, secondOperand);

        //: Then
        assertEquals("5 - 3 should equal 2", "2.0", result);

    }

    @Test
    public void testMultiplication(){

        //: Given
        String firstOperand = "5.0", secondOperand = "3.0";

        //: When
        String result = controller.calc.multiply(firstOperand, secondOperand);

        //: Then
        assertEquals("5 * 3 should equal 15", "15.0", result);
    }

    @Test
    public void testDivision(){

        //: Given
        String firstOperand = "5.0", secondOperand = "3.0";

        //: When
        String result = controller.calc.divide(firstOperand, secondOperand);

        //: Then
        assertEquals("5 / 3 should be approximately 1.6666666666666667", "1.6666666666666667", result);
    }

    @Test
    public void testDivisionByZero(){

        //: Given
        String firstOperand = "5.0", secondOperand = "0.0";

        //: When
        String result = controller.calc.divide(firstOperand, secondOperand);

        //: Then
        assertEquals("Division by zero should result in an error", "ERROR", result);

    }

    @Test
    public void testExponentiation(){

        //: Given
        String firstOperand = "3", secondOperand = "3";

        //: When
        String result = controller.calc.power(firstOperand, secondOperand);

        //: Then
        assertEquals("", "27.0", result);
    }


    @Test
    public void testNegation(){

        //Given
        String operand = "-6.7";

        //When
        String result = controller.calc.negate(operand);

        //Then
        assertEquals("The negation of -6.7 is 6.7", "6.7", result);
    }

    @Test
    public void testInverse(){

        //Given
        String operand = "2";

        //When
        String result = controller.calc.inverse(operand);

        //Then
        assertEquals("The inverse of 2 is 0.5", "0.5", result);

    }

    @Test
    public void testSquare(){

        //Given
        String operand = "3";

        //When
        String result = controller.calc.square(operand);

        //Then
        assertEquals("The square of 3 is 9", "9.0", result);

    }

    @Test
    public void testSqrt(){

        //Given
        String operand = "9";

        //When
        String result = controller.calc.sqrt(operand);

        //Then
        assertEquals("The square root of 9 is 3", "3.0", result);

    }

    @Test
    public void testSqrtNegative() {

        //Given
        String operand = "-9";

        //When
        String result = controller.calc.sqrt(operand);

        //Then
        assertEquals("The square root of a negative number is not allowed", "ERROR" , result);
    }

    @Test
    public void testSineDegree() {

        //Given
        String operand = "30";

        //When
        String result = controller.calc.sin(operand, "degree");

        //Then
        assertEquals("Sine 30 degrees is 0.5", 0.5 , Double.parseDouble(result), 0.00001);
    }

    @Test
    public void testCosineDegree() {

        //Given
        String operand = "60";

        //When
        String result = controller.calc.cos(operand, "degree");

        //Then
        assertEquals("Cosine 60 is 0.5", 0.5 , Double.parseDouble(result), 0.00001);
    }

    @Test
    public void testTangentDegree() {

        //Given
        String operand = "45";

        //When
        String result = controller.calc.tan(operand, "degree");

        //Then
        assertEquals("Tangent 45 is 1", 1.0 ,  Double.parseDouble(result), 0.00001);
    }

    @Test
    public void testSineRadian() {

        //Given
        String operand = "3.14159265358979323846";

        //When
        String result = controller.calc.sin(operand, "radian");

        //Then
        assertEquals("Sine PI Radians is 0.0", 0.0 , Double.parseDouble(result), 0.00001);
    }

    @Test
    public void testCosineRadian() {

        //Given
        String operand = "3.14159265358979323846";

        //When
        String result = controller.calc.cos(operand, "radian");

        //Then
        assertEquals("Cosine PI Radians is -1", 0.5 , Double.parseDouble(result), 0.00001);
    }

    @Test
    public void testTangentRadian() {

        //Given
        String operand = "3.14159265358979323846";

        //When
        String result = controller.calc.tan(operand, "radian");

        //Then
        assertEquals("Tangent PI radians is 0", 0.0 ,  Double.parseDouble(result), 0.00001);
    }




}
