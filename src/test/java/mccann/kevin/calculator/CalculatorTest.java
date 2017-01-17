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
    public void add() {
        double expected = 5;
        double actual = calculator.add(2,3);
        assertEquals("5 expected",expected,actual, 0);
    }

    @Test
    public void subtract() {
        double expected = 1;
        double actual = calculator.subtract(3,2);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void multiply() {
        double expected = 6;
        double actual = calculator.multiply(2,3);
        assertEquals("6 expected",expected,actual, 0);
    }

    @Test
    public void divide() {
        double expected = 2;
        double actual = calculator.divide(6,3);
        assertEquals("2 expected",expected,actual, 0);
    }

    @Test
    public void square() {
        double expected = 4;
        double actual = calculator.square(2);
        assertEquals("4 expected",expected,actual, 0);
    }

    @Test
    public void squareroot() {
        double expected = 2;
        double actual = calculator.squareroot(4);
        assertEquals("2 expected",expected,actual, 0);
    }

    @Test
    public void power() {
        double expected = 8;
        double actual = calculator.power(2,3);
        assertEquals("8 expected",expected,actual, 0);
    }

    @Test
    public void inverse() {
        double expected = 1;
        double actual = calculator.inverse(1);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void sin() {
        double expected = 0.8414;
        double actual = calculator.sin(1);
        assertEquals(".8414 expected",expected,actual, .001);
    }

    @Test
    public void cos() {
        double expected = 0.5403;
        double actual = calculator.cos(1);
        assertEquals(".5403 expected",expected,actual, .001);
    }

    @Test
    public void tan() {
        double expected = 1.5574;
        double actual = calculator.tan(1);
        assertEquals("1.5574 expected",expected,actual, .001);
    }

    @Test
    public void sininverse() {
        double expected = 1.1883;
        double actual = calculator.sininverse(1);
        assertEquals("1.1883 expected",expected,actual, .001);
    }

    @Test
    public void cosinverse() {
        double expected = 1.8505;
        double actual = calculator.cosinverse(1);
        assertEquals("1.8505 expected",expected,actual, .001);
    }

    @Test
    public void taninverse() {
        double expected = 0.6421;
        double actual = calculator.taninverse(1);
        assertEquals(".6421 expected",expected,actual, .001);
    }

    @Test
    public void log() {
        double expected = 1;
        double actual = calculator.log(10);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void ln() {
        double expected = 1;
        double actual = calculator.ln(Math.E);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void inverselog() {
        double expected = 1;
        double actual = calculator.inverselog(10);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void inversenaturallog() {
        double expected = 1;
        double actual = calculator.inversenaturallog(Math.E);
        assertEquals("1 expected",expected,actual, 0);
    }

    @Test
    public void factorial() {
        double expected = 24;
        double actual = calculator.factorial(4);
        assertEquals("24 expected",expected,actual, 0);
    }
}