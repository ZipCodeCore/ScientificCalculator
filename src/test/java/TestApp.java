import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by andrewwong on 4/28/17.
 */
public class TestApp {

    @Test
    public void testSimpleAdd(){

        //given
        double firstNumber = 2;
        double secondNumber = 2;
        double expectedResult = 4;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult, 1D);
    }

    @Test
    public void testNegativeAdd(){

        //given
        double firstNumber = -35;
        double secondNumber = -36;
        double expectedResult = -71;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult, 1D);
    }

    @Test
    public void testSimpleSubtract(){

        //given
        double firstNumber = 5;
        double secondNumber = 2;
        double expectedResult = 3;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult, 1D);
    }

    @Test
    public void testUnderflowSimpleSubtract(){

        //given
        double firstNumber = 25;
        double secondNumber = 100;
        double expectedResult = -75;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult, 1D);
    }

    @Test
    public void testNegativeSubtract(){

        //given
        double firstNumber = 50;
        double secondNumber = -20;
        double expectedResult = 70;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult, 1D);
    }

    @Test
    public void testSimpleMultiply(){

        //given
        double firstNumber = 3;
        double secondNumber = 2;
        double expectedResult = 6;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.multiply(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult, 1D);
    }

    @Test
    public void testSimpleDivide(){

        //given
        double firstNumber = 10;
        double secondNumber = 5;
        double expectedResult = 2;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.divide(firstNumber, secondNumber);

        //then
        assertEquals(expectedResult, actualResult, 1D);
    }

}
