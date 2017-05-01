import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrewwong on 4/28/17.
 */
public class BasicMathTests {

    //changed UML so need to changes tests
    @Test
    public void add_SimpleInput_ReturnsResult() {

        //given
        double firstNumber = 2;
        double secondNumber = 2;
        double expectedResult = 4;

        //when
        CalculationResult actualCalculationResult = BasicMath.add(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());


    }

    @Test
    public void add_NegativeInputs_ReturnsNegative() {

        //given
        double firstNumber = -35;
        double secondNumber = -36;
        double expectedResult = -71;

        //when
        CalculationResult actualCalculationResult = BasicMath.add(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void subtract_SimpleInput_ReturnsResult() {

        //given
        double firstNumber = 5;
        double secondNumber = 2;
        double expectedResult = 3;

        //when
        CalculationResult actualCalculationResult = BasicMath.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());

    }

    @Test
    public void subtract_UnderflowInput_ReturnsNegativeResult() {

        //given
        double firstNumber = 25;
        double secondNumber = 100;
        double expectedResult = -75;

        //when
        CalculationResult actualCalculationResult = BasicMath.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void subtract_NegativeInput_ReturnsResult() {

        //given
        double firstNumber = 50;
        double secondNumber = -20;
        double expectedResult = 70;

        //when
        CalculationResult actualCalculationResult = BasicMath.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void multiply_SimpleInput_ReturnsResult() {

        //given
        double firstNumber = 3;
        double secondNumber = 2;
        double expectedResult = 6;

        //when
        CalculationResult actualCalculationResult = BasicMath.multiply(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void multiply_NegativeInput_ReturnsNegativeResult() {

        //given
        double firstNumber = 3;
        double secondNumber = -4;
        double expectedResult = -12;

        //when
        CalculationResult actualCalculationResult = BasicMath.multiply(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void divide_SimpleInput_ReturnsResult() {

        //Arrange
        double firstNumber = 10;
        double secondNumber = 5;
        double expectedResult = 2;

        //Act
        CalculationResult actualCalculationResult = BasicMath.divide(firstNumber, secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void divide_NegativeIsInput_ReturnsNegativeOutput() {

        // Arrange
        double firstNumber = 20;
        double secondNumber = -5;
        double expectedResult = -4;

        // Act
        CalculationResult actualCalculationResult = BasicMath.divide(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void divide_DivideByZero_ReturnsError() {
        // nameOfMethod_Scanario_ExpectedResult
        // Arrange
        double firstNumber = 10;
        double secondNumber = 0;
        double expectedResult = 0;

        // Act
        CalculationResult actualCalculationResult = BasicMath.divide(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertTrue(actualCalculationResult.hasError());
    }

    @Test
    public void calculateSqr_SimpleInput_ReturnsResult() {
        //Arrange
        double secondNumber = 4;
        double expectedResult = 16;

        //Act
        CalculationResult actualCalculationResult = BasicMath.calculateSqr(secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateSqrRoot_SimpleInput_ReturnsResult() {
        //Arrange
        double secondNumber = 25;
        double expectedResult = 5;

        //Act
        CalculationResult actualCalculationResult = BasicMath.calculateSqrRoot(secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateSqrRoot_NegativeInput_ReturnsResult() {
        //Arrange
        double secondNumber = -36;
        double expectedResult = 0;

        //Act
        CalculationResult actualCalculationResult = BasicMath.calculateSqrRoot(secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertTrue(actualCalculationResult.hasError());
    }

    @Test
    public void variableExponentiation_SimpleInput_ReturnsResult(){
        //Arrange
        double firstNumber = 2;
        double secondNumber = 3;
        double expectedResult = 8;

        //Act
        CalculationResult actualCalculationResult = BasicMath.variableExponentation(firstNumber, secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), 1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void variableExponentiation_NegativeInput_ReturnsResult(){
        //Arrange
        double firstNumber = 2;
        double secondNumber = -3;
        double expectedResult = .125;

        //Act
        CalculationResult actualCalculationResult = BasicMath.variableExponentation(firstNumber, secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateInverse_SimpleInput_ReturnsResult(){
        //Arrange
        double secondNumber = 5;
        double expectedResult = .2;

        //Act
        CalculationResult actualCalculationResult = BasicMath.calculateInverse( secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void invertSign_SimpleInput_ReturnsResult(){
        //Arrange
        double secondNumber = 2;
        double expectedResult = -2;

        //Act
        CalculationResult actualCalculationResult = BasicMath.invertSign( secondNumber);

        //Assert
        assertEquals(expectedResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

}
