package humphrey.jeriah.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/16/17.
 */
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp(){
        calculator= new Calculator();
    }

    @Test
    public void displayNumberTest(){
        double expected =0.0;
        double actual = calculator.displayNumber();
        assertEquals("I expect the display to be whatever the current number is", expected, actual,0.0);
    }

    @Test
    public void clearDisplaySetsNumberToAndDisplaysZeroTest(){
        double expected =0.0;
        double actual = calculator.clearDisplay();
        assertEquals("I expect the display to read 0 after clearing it", expected, actual,0.0);
    }

    @Test
    public void changeNumberSetsAndDispaysNewNumber(){
        double expected =8.0;
        double actual = calculator.changeNumber(8);
        assertEquals("I expect the display to read 8.0 after changing it", expected, actual,0.0);
    }

    @Test
    public void addNumberAddsAndDispaysNewNumber(){
        double expected =6.0;
        double actual = calculator.add(6);
        assertEquals("I expect the display to read 6.0 after adding it", expected, actual,0.0);
    }

    @Test
    public void subtractNumberSubtractsAndDispaysNewNumber(){
        calculator.changeNumber(5);
        double expected =2.0;
        double actual = calculator.subtract(3);
        assertEquals("I expect the display to read 2.0 after subtracting 3 from 5", expected, actual,0.0);
    }

    @Test
    public void multiplyNumberMultipliesAndDispaysNewNumber(){
        calculator.changeNumber(5);
        double expected =15.0;
        double actual = calculator.multiply(3);
        assertEquals("I expect the display to read 15.0 after multiplying 3 and 5", expected, actual,0.0);
    }

    @Test
    public void divideNumberDividesAndDispaysNewNumber(){
        calculator.changeNumber(15);
        double expected =3.0;
        double actual = calculator.divide(5);
        assertEquals("I expect the display to read 3.0 after dividing 15 by 5", expected, actual,0.0);
    }

    @Test
    public void squareNumberSquaresAndDispaysNewNumber(){
        calculator.changeNumber(16);
        double expected =256.0;
        double actual = calculator.squareNumber();
        assertEquals("I expect the display to read 256.0 after squaring 16", expected, actual,0.0);



    }

    @Test
    public void squareRootNumberTakesSquareRootAndDispaysNewNumber(){
        calculator.changeNumber(16);
        double expected =4.0;
        double actual = calculator.squareRootNumber();
        assertEquals("I expect the display to read 4.0 after taking the sq. root of 16", expected, actual,0.0);
    }

    @Test
    public void inverseTakestheReciprocalAndDispaysNewNumber(){
        calculator.changeNumber(2);
        double expected =0.5;
        double actual = calculator.inverseNumber();
        assertEquals("I expect the display to read 0.5 after inverting the number 2", expected, actual,0.0);
    }

    @Test
    public void switchSignChangesSignAndDispaysNewNumber(){
        calculator.changeNumber(2);
        double expected =-2.0;
        double actual = calculator.switchSign();
        assertEquals("I expect the display to read -2.0 after switching sign on the number 2", expected, actual,0.0);
    }

    @Test
    public void absoluteValueTest(){
        calculator.currentNumber= -5.0;
        double expected = 5.0;
        double actual = calculator.absoluteValue();
        calculator.changeNumber(7.0);
        calculator.absoluteValue();
        assertEquals("I expect the absolut value of -5 to be 5.0", expected, actual, 0.0);
    }

    @Test
    public void percentTest(){
        calculator.currentNumber=9;
        double expected = 50;
        double actual = calculator.percent(18);
        assertEquals("I expect 9 is x percent of 18 to display 50", expected, actual, 0.0);
    }
}