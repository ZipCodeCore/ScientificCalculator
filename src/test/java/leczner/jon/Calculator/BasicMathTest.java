package leczner.jon.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class BasicMathTest {
    Calculator calc = new Calculator();

    @Test
    public void add0Test() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(50);
        assertEquals("50", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(-50.5);
        assertEquals("-0.5", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(0);
        assertEquals("-0.5", calc.basicMathUnit.getState());
    }

    @Test
    public void subtractTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.subtract(0);
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.subtract(3);
        assertEquals("-3", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(8);
        calc.basicMathUnit.subtract(4);
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.subtract(-4);
        assertEquals("5", calc.basicMathUnit.getState());
        calc.basicMathUnit.subtract(0.1);
        assertEquals("4.9", calc.basicMathUnit.getState());
    }

    @Test
    public void multiplyTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.multiply(3);
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.multiply(0);
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.multiply(1);
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.multiply(2);
        assertEquals("2", calc.basicMathUnit.getState());
        calc.basicMathUnit.multiply(-1);
        assertEquals("-2", calc.basicMathUnit.getState());
        calc.basicMathUnit.multiply(-1);
        assertEquals("2", calc.basicMathUnit.getState());
        calc.basicMathUnit.multiply(1.5);
        assertEquals("3", calc.basicMathUnit.getState());
    }

    @Test
    public void divideTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.divide(0);
        assertEquals("Err", calc.basicMathUnit.getState());
        calc.display.clear();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.divide(1);
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.divide(2);
        assertEquals("0.5", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(38.5);
        calc.basicMathUnit.divide(2);
        assertEquals("19.5", calc.basicMathUnit.getState());

    }

    @Test
    public void squareTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.square();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.square();
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.square();
        assertEquals("4", calc.basicMathUnit.getState());
        calc.basicMathUnit.subtract(5);
        calc.basicMathUnit.square();
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(11);
        calc.basicMathUnit.square();
        assertEquals("144", calc.basicMathUnit.getState());
    }

    @Test
    public void squareRootTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.squareRoot();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.squareRoot();
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.subtract(10.4);
        calc.basicMathUnit.squareRoot();
        assertEquals("Err", calc.basicMathUnit.getState());
    }

    @Test
    public void exponentTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.exponent(0);
        assertEquals("Err", calc.basicMathUnit.getState());
        calc.display.clear();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.exponent(0);
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.exponent(0);
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.exponent(2);
        assertEquals("4", calc.basicMathUnit.getState());
        calc.basicMathUnit.exponent(-2);
        assertEquals("0.0625", calc.basicMathUnit.getState());
    }

    @Test
    public void inverseTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.inverse();
        assertEquals("Err", calc.basicMathUnit.getState());
        calc.display.clear();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.inverse();
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.inverse();
        assertEquals("0.5", calc.basicMathUnit.getState());
        calc.basicMathUnit.inverse();
        assertEquals("2", calc.basicMathUnit.getState());
//        calc.basicMathUnit.subtract(3.2);
//        calc.basicMathUnit.inverse();
//        assertEquals("-0.83333", calc.basicMathUnit.getState()); // need to format with sig digits...
    }

    @Test
    public void switchSignTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.switchSign();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.switchSign();
        assertEquals("-1", calc.basicMathUnit.getState());
    }

    @Test
    public void factorialTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.factorial();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(1);
        calc.basicMathUnit.factorial();
        assertEquals("1", calc.basicMathUnit.getState());
        calc.basicMathUnit.add(4);
        calc.basicMathUnit.factorial();
        assertEquals("120", calc.basicMathUnit.getState());
    }
}
