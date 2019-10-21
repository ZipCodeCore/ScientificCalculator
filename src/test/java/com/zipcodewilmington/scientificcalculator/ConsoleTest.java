package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest {

    private Console result = new Console();

    @Test
    public void additionTest1() {
        // given
        double inputValue1 = 10.0;
        double inputValue2 = 10.0;
        double expected = inputValue1 + inputValue2;
        // when
        double actual = result.add(inputValue1, inputValue2);
        // then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void additionTest2() {
        double inputValue1 = 5.0;
        double inputValue2 = 5.0;
        double expected = inputValue1 + inputValue2;
        double actual = result.add(inputValue1, inputValue2);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void additionTest3() {
        double inputValue1 = 17.9;
        double inputValue2 = 88.5;
        double expected = inputValue1 + inputValue2;
        double actual = result.add(inputValue1, inputValue2);
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void subtractionTest1() {
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = inputValue1 - inputValue2;
        double actual = result.subtract(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void subtractionTest2() {
        double inputValue1 = 3;
        double inputValue2 = 2;
        double expected = inputValue1 - inputValue2;
        double actual = result.subtract(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void subtractionTest3() {
        double inputValue1 = 97.4;
        double inputValue2 = 44.3;
        double expected = inputValue1 - inputValue2;
        double actual = result.subtract(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest1() {
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = inputValue1 * inputValue2;
        double actual = result.multiply(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest2() {
        double inputValue1 = 7;
        double inputValue2 = 3;
        double expected = inputValue1 * inputValue2;
        double actual = result.multiply(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void multiplicationTest3() {
        double inputValue1 = 99.3;
        double inputValue2 = 129.4545;
        double expected = inputValue1 * inputValue2;
        double actual = result.multiply(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void divideTest1() {
        double inputValue1 = 4;
        double inputValue2 = 2;
        double expected = inputValue1 / inputValue2;
        double actual = result.divide(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void divideTest2() {
        double inputValue1 = 15;
        double inputValue2 = 5;
        double expected = inputValue1 / inputValue2;
        double actual = result.divide(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void divideTest3() {
        double inputValue1 = 34736.3463;
        double inputValue2 = 8376346.235;
        double expected = inputValue1 / inputValue2;
        double actual = result.divide(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void exponent1() {
        double inputValue1 = 2;
        double inputValue2 = 3;
        double expected = Math.pow(inputValue1, inputValue2);
        double actual = result.exponent(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void exponent2() {
        double inputValue1 = 7;
        double inputValue2 = 3;
        double expected = Math.pow(inputValue1, inputValue2);
        double actual = result.exponent(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void exponent3() {
        double inputValue1 = 357;
        double inputValue2 = 23;
        double expected = Math.pow(inputValue1, inputValue2);
        double actual = result.exponent(inputValue1, inputValue2);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void cosineTest1() {
        double inputValue = 45;
        double expected;
        expected = Math.cos(inputValue);
        double actual = result.cosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void cosineTest2() {
        double inputValue = 0;
        double expected;
        expected = Math.cos(inputValue);
        double actual = result.cosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void cosineTest3() {
        double inputValue = -180;
        double expected;
        expected = Math.cos(-inputValue);
        double actual = result.cosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void factorialTest1() {
        double inputValue = 5;
        double expected = 1;
        for (int i = 1; i <= inputValue; i++) {
            expected = expected * i;
        }
        Double actual = result.factorial(inputValue);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest2() {
        double inputValue = 10;
        double expected = 1;
        for (int i = 1; i <= inputValue; i++) {
            expected = expected * i;
        }
        double actual = result.factorial(inputValue);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest3() {
        double inputValue = 1;
        double expected = 1;
        for (int i = 1; i <= inputValue; i++) {
            expected = expected * i;
        }
        double actual = result.factorial(inputValue);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseTest1() {
        double inputValue = 4;
        double expected = 1 / inputValue;
        double actual = result.inverse(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseTest2() {
        double inputValue = 15;
        double expected = 1 / inputValue;
        double actual = result.inverse(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseTest3() {
        double inputValue = 76;
        double expected = 1 / inputValue;
        double actual = result.inverse(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseCosineTest1() {
        double inputValue = 1;
        double expected = Math.acos(inputValue);
        double actual = result.inverseCosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseCosineTest2() {
        double inputValue = -1;
        double expected = Math.acos(inputValue);
        double actual = result.inverseCosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseCosineTest3() {
        double inputValue = 0;
        double expected = Math.acos(inputValue);
        double actual = result.inverseCosine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseLogarithmTest1() {
        double inputValue = 1;
        double expected = Math.pow(10, inputValue);
        double actual = result.inverseLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseLogarithmTest2() {
        double inputValue = 45;
        double expected = Math.pow(10, inputValue);
        double actual = result.inverseLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseLogarithmTest3() {
        double inputValue = 180;
        double expected = Math.pow(10, inputValue);
        double actual = result.inverseLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseNaturalLogarithmTest1() {
        double inputValue = 1;
        double expected = Math.exp(inputValue);
        double actual = result.inverseNaturalLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseNaturalLogarithmTest2() {
        double inputValue = 45;
        double expected = Math.exp(inputValue);
        double actual = result.inverseNaturalLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseNaturalLogarithmTest3() {
        double inputValue = -180;
        double expected = Math.exp(inputValue);
        double actual = result.inverseNaturalLogarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void inverseSineTest1() {
        double inputValue = 1;
        double expected = Math.asin(inputValue);
        double actual = result.inverseSine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseSineTest2() {
        Console result = new Console();
        double inputValue = -1;
        double expected = Math.asin(inputValue);
        double actual = result.inverseSine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseSineTest3() {
        double inputValue = 0;
        double expected = Math.asin(inputValue);
        double actual = result.inverseSine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseTangentTest1() {
        double inputValue = 90;
        double expected = Math.atan(inputValue);
        double actual = result.inverseTangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseTangentTest2() {
        double inputValue = 0;
        double expected = Math.atan(inputValue);
        double actual = result.inverseTangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void inverseTangentTest3() {
        double inputValue = -180;
        double expected = Math.atan(inputValue);
        double actual = result.inverseTangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void invertTest1() {
        double inputValue = 2;
        double expected = -1 * inputValue;
        double actual = result.invert(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void invertTest2() {
        double inputValue = 17;
        double expected = -1 * inputValue;
        double actual = result.invert(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void invertTest3() {
        double inputValue = 361.25;
        double expected = -1 * inputValue;
        double actual = result.invert(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void LogarithmTest1() {
        double inputValue = 1;
        double expected = Math.log(inputValue);
        double actual = result.logarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void LogarithmTest2() {
        double inputValue = 45;
        double expected = Math.log(inputValue);
        double actual = result.logarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void LogarithmTest3() {
        double inputValue = 180;
        double expected = Math.log(inputValue);
        double actual = result.logarithm(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void sineTest1() {
        double inputValue = 90;
        double expected = Math.sin(inputValue);
        double actual = result.sine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void sineTest2() {
        double inputValue = 45;
        double expected = Math.sin(inputValue);
        double actual = result.sine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void sineTest3() {
        double inputValue = -180;
        double expected = Math.sin(-inputValue);
        double actual = result.sine(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void sqrt1() {
        double inputValue1 = 2;
        double expected = Math.sqrt(inputValue1);
        double actual = result.sqrt(inputValue1);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void sqrt2() {
        double inputValue1 = 7;
        double expected = Math.sqrt(inputValue1);
        double actual = result.sqrt(inputValue1);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void sqrt3() {
        double inputValue1 = 9;
        double expected = Math.sqrt(inputValue1);
        double actual = result.sqrt(inputValue1);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void squaredTest1() {
        double inputValue = 2;
        double expected = inputValue * inputValue;
        double actual = result.squared(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void squaredTest2() {
        double inputValue = 7;
        double expected = inputValue * inputValue;
        double actual = result.squared(inputValue);
        assertEquals(expected, actual, .00);
    }

    @Test
    public void tangentTest1() {
        double inputValue = 45;
        double expected = Math.tan(inputValue);
        double actual = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void tangentTest2() {
        double inputValue = 90;
        double expected = Math.tan(inputValue);
        double actual = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void tangentTest3() {
        double inputValue = -180;
        double expected = Math.tan(-inputValue);
        double actual = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }
/*unable to figure out ln(x)
    @Test
    public void naturalLogarithmTest1() {
        double inputValue = -180;
        double expected = (-Math.log(1 - inputValue)) / inputValue;
        double actual = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void naturalLogarithmTest2() {
        double inputValue = 0;
        double expected = (-Math.log(1 - inputValue)) / inputValue;
        double actual = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void naturalLogarithmTest3() {
        double inputValue = 1;
        double expected = (-Math.log(1 - inputValue)) / inputValue;
        double actual = result.tangent(inputValue);
        assertEquals(expected, actual, .00000);
    }*/
}