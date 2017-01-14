package mccann.kevin.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void add() throws Exception {
        double expected = 5;
        double actual = calculator.add(2,3);
        assertEquals("5 expected",expected,actual, 0);
    }

    @Test
    public void subtract() throws Exception {
        double expected = 1;
        double actual = calculator.subtract(3,2);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void multiply() throws Exception {
        double expected = 6;
        double actual = calculator.multiply(2,3);
        assertEquals("6 expected",expected,actual, 0);
    }

    @Test
    public void divide() throws Exception {
        double expected = 2;
        double actual = calculator.divide(6,3);
        assertEquals("2 expected",expected,actual, 0);
    }

    @Test
    public void square() throws Exception {
        double expected = 4;
        double actual = calculator.square(2);
        assertEquals("4 expected",expected,actual, 0);
    }

    @Test
    public void squareroot() throws Exception {
        double expected = 2;
        double actual = calculator.squareroot(4);
        assertEquals("2 expected",expected,actual, 0);
    }

    @Test
    public void power() throws Exception {
        double expected = 8;
        double actual = calculator.power(2,3);
        assertEquals("8 expected",expected,actual, 0);
    }

    @Test
    public void inverse() throws Exception {
        double expected = 1;
        double actual = calculator.inverse(1);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void sin() throws Exception {

    }

    @Test
    public void cos() throws Exception {

    }

    @Test
    public void tan() throws Exception {

    }

    @Test
    public void sininverse() throws Exception {

    }

    @Test
    public void cosinverse() throws Exception {

    }

    @Test
    public void taninverse() throws Exception {

    }

    @Test
    public void log() throws Exception {

    }

    @Test
    public void ln() throws Exception {

    }

    @Test
    public void inverselog() throws Exception {

    }

    @Test
    public void inversenaturallog() throws Exception {

    }

    @Test
    public void factorial() throws Exception {
        double expected = 24;
        double actual = calculator.factorial(4);
        assertEquals("24 expected",expected,actual, 0);
    }
}