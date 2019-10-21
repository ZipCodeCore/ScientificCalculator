package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest extends Console {

    private Console result = new Console();

    @Test
    public void additionTest1() {
        // given
        double inputValue1 = 10.0;
        double inputValue2 = 10.0;
        double actual = inputValue1 + inputValue2;
        // when
        double expected = result.add(inputValue1, inputValue2);
        // then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void additionTest2() {
        double inputValue1 = 5.0;
        double inputValue2 = 5.0;
        double actual = inputValue1 + inputValue2;
        double expected = result.add(inputValue1, inputValue2);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void additionTest3() {
        double inputValue1 = 17.9;
        double inputValue2 = 88.5;
        double actual = inputValue1 + inputValue2;
        double expected = result.add(inputValue1, inputValue2);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void subtractionTest1() {
        double inputValue1 = 2;
        double inputValue2 = 3;
        double actual = inputValue1 - inputValue2;
        double expected = result.subtract(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void subtractionTest2() {
        double inputValue1 = 3;
        double inputValue2 = 2;
        double actual = inputValue1 - inputValue2;
        double expected = result.subtract(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void subtractionTest3() {
        double inputValue1 = 97.4;
        double inputValue2 = 44.3;
        double actual = inputValue1 - inputValue2;
        double expected = result.subtract(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest1() {
        double inputValue1 = 2;
        double inputValue2 = 3;
        double actual = inputValue1 * inputValue2;
        double expected = result.multiply(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest2() {
        double inputValue1 = 7;
        double inputValue2 = 3;
        double actual = inputValue1 * inputValue2;
        double expected = result.multiply(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest3() {
        double inputValue1 = 99.3;
        double inputValue2 = 129.4545;
        double actual = inputValue1 * inputValue2;
        double expected = result.multiply(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void divideTest1() {
        double inputValue1 = 4;
        double inputValue2 = 2;
        double actual = inputValue1 / inputValue2;
        double expected = result.divide(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void divideTest2() {
        double inputValue1 = 15;
        double inputValue2 = 5;
        double actual = inputValue1 / inputValue2;
        double expected = result.divide(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void divideTest3() {
        double inputValue1 = 34736.3463;
        double inputValue2 = 8376346.235;
        double actual = inputValue1 / inputValue2;
        double expected = result.divide(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void exponent1() {
        double inputValue1 = 2;
        double inputValue2 = 3;
        double actual = Math.pow(inputValue1, inputValue2);
        double expected = result.exponent(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void exponent2() {
        double inputValue1 = 7;
        double inputValue2 = 3;
        double actual = Math.pow(inputValue1, inputValue2);
        double expected = result.exponent(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void exponent3() {
        double inputValue1 = 357;
        double inputValue2 = 23;
        double actual = Math.pow(inputValue1, inputValue2);
        double expected = result.exponent(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void cosineTest1() {
        double inputValue = 45;
        double actual = Math.cos(inputValue);
        double expected = result.cosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void cosineTest2() {
        double inputValue = 0;
        double actual = Math.cos(inputValue);
        double expected = result.cosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void cosineTest3() {
        double inputValue = -180;
        double actual = Math.cos(-inputValue);
        double expected = result.cosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void factorialTest1() {
        double inputValue = 5;
        double actual = 1;
        for (int i = 1; i <= inputValue; i++) {
            actual = actual * i;
        }
        double expected = result.factorial(inputValue);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest2() {
        double inputValue = 10;
        double actual = 1;
        for (int i = 1; i <= inputValue; i++) {
            actual = actual * i;
        }
        double expected = result.factorial(inputValue);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest3() {
        double inputValue = 1;
        double actual = 1;
        for (int i = 1; i <= inputValue; i++) {
            actual = actual * i;
        }
        double expected = result.factorial(inputValue);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseTest1() {
        double inputValue = 4;
        double actual = 1 / inputValue;
        double expected = result.inverse(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseTest2() {
        double inputValue = 15;
        double actual = 1 / inputValue;
        double expected = result.inverse(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseTest3() {
        double inputValue = 76;
        double actual = 1 / inputValue;
        double expected = result.inverse(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseCosineTest1() {
        double inputValue = 1;
        double actual = Math.acos(inputValue);
        double expected = result.inverseCosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseCosineTest2() {
        double inputValue = -1;
        double actual = Math.acos(inputValue);
        double expected = result.inverseCosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseCosineTest3() {
        double inputValue = 0;
        double actual = Math.acos(inputValue);
        double expected = result.inverseCosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseLogarithmTest1() {
        double inputValue = 1;
        double actual = Math.pow(10, inputValue);
        double expected = result.inverseLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseLogarithmTest2() {
        double inputValue = 45;
        double actual = Math.pow(10, inputValue);
        double expected = result.inverseLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseLogarithmTest3() {
        double inputValue = 180;
        double actual = Math.pow(10, inputValue);
        double expected = result.inverseLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseNaturalLogarithmTest1() {
        double inputValue = 1;
        double actual = Math.exp(inputValue);
        double expected = result.inverseNaturalLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseNaturalLogarithmTest2() {
        double inputValue = 45;
        double actual = Math.exp(inputValue);
        double expected = result.inverseNaturalLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseNaturalLogarithmTest3() {
        double inputValue = -180;
        double actual = Math.exp(inputValue);
        double expected = result.inverseNaturalLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseSineTest1() {
        double inputValue = 1;
        double actual = Math.asin(inputValue);
        double expected = result.inverseSine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseSineTest2() {
        Console result = new Console();
        double inputValue = -1;
        double actual = Math.asin(inputValue);
        double expected = result.inverseSine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseSineTest3() {
        double inputValue = 0;
        double actual = Math.asin(inputValue);
        double expected = result.inverseSine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseTangentTest1() {
        double inputValue = 90;
        double actual = Math.atan(inputValue);
        double expected = result.inverseTangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseTangentTest2() {
        double inputValue = 0;
        double actual = Math.atan(inputValue);
        double expected = result.inverseTangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseTangentTest3() {
        double inputValue = -180;
        double actual = Math.atan(inputValue);
        double expected = result.inverseTangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void invertTest1() {
        double inputValue = 2;
        double actual = -1 * inputValue;
        double expected = result.invert(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void invertTest2() {
        double inputValue = 17;
        double actual = -1 * inputValue;
        double expected = result.invert(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void invertTest3() {
        double inputValue = 361.25;
        double actual = -1 * inputValue;
        double expected = result.invert(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void LogarithmTest1() {
        double inputValue = 1;
        double actual = Math.log10(inputValue);
        double expected = result.logarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void LogarithmTest2() {
        double inputValue = 45;
        double actual = Math.log10(inputValue);
        double expected = result.logarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void LogarithmTest3() {
        double inputValue = 180;
        double actual = Math.log10(inputValue);
        double expected = result.logarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void sineTest1() {
        double inputValue = 90;
        double actual = Math.sin(inputValue);
        double expected = result.sine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void sineTest2() {
        double inputValue = 45;
        double actual = Math.sin(inputValue);
        double expected = result.sine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void sineTest3() {
        double inputValue = -180;
        double actual = Math.sin(-inputValue);
        double expected = result.sine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void sqrt1() {
        double inputValue1 = 2;
        double actual = Math.sqrt(inputValue1);
        double expected = result.sqrt(inputValue1);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void sqrt2() {
        double inputValue1 = 7;
        double actual = Math.sqrt(inputValue1);
        double expected = result.sqrt(inputValue1);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void sqrt3() {
        double inputValue1 = 9;
        double actual = Math.sqrt(inputValue1);
        double expected = result.sqrt(inputValue1);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void squaredTest1() {
        double inputValue = 2;
        double actual = inputValue * inputValue;
        double expected = result.squared(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void squaredTest2() {
        double inputValue = 7;
        double actual = inputValue * inputValue;
        double expected = result.squared(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void tangentTest1() {
        double inputValue = 45;
        double actual = Math.tan(inputValue);
        double expected = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void tangentTest2() {
        double inputValue = 90;
        double actual = Math.tan(inputValue);
        double expected = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void tangentTest3() {
        double inputValue = -180;
        double actual = Math.tan(-inputValue);
        double expected = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }
    @Test
    public void naturalLogarithmTest1() {
        double inputValue = 7;
        double actual = Math.log(inputValue);
        double expected = result.naturalLogarithm(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void naturalLogarithmTest2() {
        double inputValue = 3;
        double actual = Math.log(inputValue);
        double expected = result.naturalLogarithm(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void naturalLogarithmTest3() {
        double inputValue = 1;
        double actual = Math.log(inputValue);
        double expected = result.naturalLogarithm(inputValue);
        assertEquals(expected, actual, .00000);
    }
}