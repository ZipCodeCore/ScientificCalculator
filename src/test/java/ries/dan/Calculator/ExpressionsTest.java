package ries.dan.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danries on 1/13/17.
 */
public class ExpressionsTest {
    @Test
    public void addTEST(){
        double actual = Expressions.add(10,10);
        double expected = 20.0;
        assertEquals("We expect to get 20", expected, actual, 0);
    }

    @Test
    public void multiplyTEST(){
        double actual = Expressions.multiply(10, 10);
        double expected = 100;
        assertEquals("We expect to get 100.0", expected, actual, 0);
    }

    @Test
    public void divideTEST(){
        double actual = Expressions.divide(10, 10);
        double expected = 1;
        assertEquals("We expect to get 1",expected,actual,0);
    }

    @Test
    public void subtractTEST(){
        double actual = Expressions.subtract(10,5);
        double expected = 5;
        assertEquals("We expect to get 5",expected,actual,0);
    }

    @Test
    public void squareTEST(){
        double actual = Expressions.square(10);
        double expected = 100;
        assertEquals("We expect to get 100", expected, actual, 0);
    }

    @Test
    public void powerTEST(){
        double actual = Expressions.power(2,2);
        double expected = 4;
        assertEquals("We expect to get 4", expected, actual, 0);
    }

    @Test
    public void inverseTEST(){
        double actual = Expressions.inverse(2);
        double expected = 0.5;
        assertEquals("We expect to get 0.5", expected, actual, 0);
    }

    @Test
    public void logTEST(){
        double actual = Expressions.log(10);
        double expected = 1;
        assertEquals("We expect to get 1", expected, actual, 0);
    }

    @Test
    public void naturalLogTEST(){
        double actual = Expressions.ln(1);
        double expected = 0;
        assertEquals("We expect to get 1", expected, actual, 0);
    }

    @Test
    public void inverseNaturalLogTEST(){
        double actual = Expressions.exp(1);
        double expected = 2.718281828459045;
        assertEquals("We expect to get 2.718281828459045", expected, actual, 0);
    }

    @Test
    public void factorialTEST(){
        double actual = Expressions.factorial(3);
        double expected = 6;
        assertEquals("We expect to get 6", actual, expected, 0);
    }

    @Test
    public void base10TEST(){
        double actual = Expressions.base10(2);
        double expected = 100;
        assertEquals("We expect to get 100", expected, actual, 0);
    }

    @Test
    public void sineTEST(){
        double actual = Expressions.sine(90);
        double expected = 1;
        assertEquals("We expect to get 1", expected, actual, 0);
    }

    @Test
    public void sineInversionTEST(){
        double actual = Expressions.sineInverse(1);
        double expected = .01745417873758517;
        assertEquals("We expect to get .01745417873758517", expected, actual, 0);
    }

    @Test
    public void cosineTEST(){
        double actual = Expressions.cosine(1);
        double expected = 0.9998476951563913;
        assertEquals("We expect to get .9998476951563913", expected, actual, 0);
    }

    @Test
    public void cosineInversion(){
        double actual = Expressions.cosineInverse(1);
        double expected = 1.5533421480573115;
        assertEquals("We expect to get 1.5533421480573115", expected, actual, 0);
    }

    @Test
    public void tangentTEST(){
        double actual = Expressions.tangent(1);
        double expected = 0.017455064928217585;
        assertEquals("We expect to get 0.017455064928", expected, actual, 0);
    }

    @Test
    public void tangentInverseTEST(){
        double actual = Expressions.tangentInverse(1);
        double expected = .017451520651465824;
        assertEquals("We expect to get .017451520651465824",expected , actual, 0);
    }


}
