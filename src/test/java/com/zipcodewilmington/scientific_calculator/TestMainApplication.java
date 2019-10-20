package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Arithmetic;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    @Test
    public void additionTest1()
    {
        Double num1  = 5.0;
        Double num2 = 10.50;
        Double expected = 15.5;
        Double actual = Arithmetic.addition(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void additionTest2()
    {
        Double num1  = 555.6;
        Double num2 = 105748.50;
        Double expected = 106304.1;
        Double actual = Arithmetic.addition(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void additionTest3()
    {
        Double num1  = 5465.65;
        Double num2 = 14522.58;
        Double expected = 19988.23;
        Double actual = Arithmetic.addition(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subTest1()
    {
        Double num1  = 5465.65;
        Double num2 = 14522.58;
        Double expected = -9056.93;
        Double actual = Arithmetic.sub(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subTest2()
    {
        Double num1  = 10.00;
        Double num2 = 2.00;
        Double expected = 8.00;
        Double actual = Arithmetic.sub(num1, num2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void subTest3()
    {
        Double num1  = 5465.65;
        Double num2 = 45.58;
        Double expected = 5420.07;
        Double actual = Arithmetic.sub(num1, num2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void multiplicationTest1()
    {
        Double num1  = 5.00;
        Double num2 = 5.00;
        Double expected = 25.00;
        Double actual = Arithmetic.multiplication(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest2()
    {
        Double num1  = 45.65;
        Double num2 = 22.9;
        Double expected =1045.385 ;
        Double actual = Arithmetic.multiplication(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest3()
    {
        Double num1  = 567.87;
        Double num2 = 45.58;
        Double expected = 25883.5146;
        Double actual = Arithmetic.multiplication(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisionTest1()
    {
        Double num1  = 10.00;
        Double num2 = 2.00;
        Double expected = 5.00;
        Double actual = Arithmetic.division(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisionTest2()
    {
        Double num1  = 9545.3;
        Double num2 = 325.3;
        Double expected = 29.34306793728865;
        Double actual = Arithmetic.division(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisionTest3()
    {
        Double num1  = 567.5;
        Double num2 = 45.5;
        Double expected = 12.472527472527473;
        Double actual = Arithmetic.division(num1, num2);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void sqrtTest1() {
//        ScientificFunctions testScientific = new ScientificFunctions();
        //given square root of num1
        double num1 = 25;
        //expected result
        double expectedResult = 5;
        //if (expected - actual) > delta = fail
        double delta = 1e-8;
        double result = Math.sqrt(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void sqrtTest2() {
        //ScientificFunctions testScientific = new ScientificFunctions();
        //given square root of num1
        double num1 = 64;
        //expected result
        double expectedResult = 8;
        //if (expected - actual) > delta = fail
        double delta = 1e-8;
        double result = Math.sqrt(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void sqrtTest3() {
        //ScientificFunctions testScientific = new ScientificFunctions();
        //given square root of num1
        double num1 = 100;
        //expected result
        double expectedResult = 10;
        //if (expected - actual) > delta = fail
        double delta = 1e-8;
        double result = Math.sqrt(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }

    @Test
    public void cbrtTest1() {
        //ScientificFunctions testScientific = new ScientificFunctions();
        //given cube root of num1
        double num1 = 27;
        //expected result
        double expectedResult = 3;
        //if (expected - actual) > delta = fail
        double delta = 1e-8;
        double result = Math.cbrt(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void cbrtTest2() {
        //ScientificFunctions testScientific = new ScientificFunctions();
        //given cube root of num1
        double num1 = 64;
        //expected result
        double expectedResult = 4;
        //if (expected - actual) > delta = fail
        double delta = 1e-8;
        double result = Math.cbrt(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void cbrtTest3() {
      //  ScientificFunctions testScientific = new ScientificFunctions();
        //given cube root of num1
        double num1 = 125;
        //expected result
        double expectedResult = 5;
        //if (expected - actual) > delta = fail
        double delta = 1e-8;
        double result = Math.cbrt(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }

    @Test
    public void expTest1() {
        //ScientificFunctions testScientific = new ScientificFunctions();
        double num1 = 2;
        double num2 = 3;
        double expectedResult = 8;
        double delta = 1e-8;
        double result = Math.pow(num1, num2);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void expTest2() {
        //ScientificFunctions testScientific = new ScientificFunctions();
        double num1 = 6;
        double num2 = 3;
        double expectedResult = 216;
        double delta = 1e-8;
        double result = Math.pow(num1, num2);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void expTest3() {
        //ScientificFunctions testScientific = new ScientificFunctions();
        double num1 = 5;
        double num2 = 5;
        double expectedResult = 3125;
        double delta = 1e-8;
        double result = Math.pow(num1, num2);
        Assert.assertEquals(expectedResult, result, delta);
    }

    @Test
    public void logTest1() {
       // ScientificFunctions testScientific = new ScientificFunctions();
        double num1 = 100;
        double expectedResult = 2;
        double delta = 1e-8;
        double result = Math.log10(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void logTest2() {
      //  ScientificFunctions testScientific = new ScientificFunctions();
        double num1 = 50;
        double expectedResult = 1.6989700043;
        double delta = 1e-8;
        double result = Math.log10(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }
    @Test
    public void logTest3() {
      //  ScientificFunctions testScientific = new ScientificFunctions();
        double num1 = 150;
        double expectedResult = 2.1760912591;
        double delta = 1e-8;
        double result = Math.log10(num1);
        Assert.assertEquals(expectedResult, result, delta);
    }




}