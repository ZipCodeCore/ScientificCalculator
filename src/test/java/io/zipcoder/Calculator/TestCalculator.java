package io.zipcoder.Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mollyarant on 4/28/17.
 */

public class TestCalculator {

    @Test
    public void testAdd() {
        //: Given:  given that two numbers are added together
        int a = 5;
        int b= 4;
        int expectedResult=9;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.add(a, b);

        //: Then


        Assert.assertEquals("should return sum of a+b", expectedResult, actualResult);


    }

    @Test
    public void testAddWithNegative() {
        //: Given:  given that two numbers are added together
        int a = 5;
        int b= -10;
        int expectedResult=-5;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.add(a, b);

        //: Then


        Assert.assertEquals("should return sum of a+b", expectedResult, actualResult);


    }

    @Test
    public void testAddTwoNegativeNumbers() {
        //: Given:  given that two numbers are added together
        int a = -5;
        int b= -4;
        int expectedResult=-9;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.add(a, b);

        //: Then


        Assert.assertEquals("should return sum of a+b", expectedResult, actualResult);


    }

    @Test
    public void testSubtract() {
        //: Given:  given that a number is being taken away from another
        int a = 6;
        int b= 4;
        int expectedResult=2;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.subtract(a, b);

        //: Then

        Assert.assertEquals("should return a-b", expectedResult, actualResult);


    }

    @Test
    public void testSubtractWithNegative() {
        //: Given:  given that a number is being taken away from another
        int a = -6;
        int b= 4;
        int expectedResult=-10;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.subtract(a, b);

        //: Then

        Assert.assertEquals("should return a-b", expectedResult, actualResult);


    }

    @Test
    public void testSubtractWithTwoNegatives() {
        //: Given:  given that a number is being taken away from another
        int a = -6;
        int b= -4;
        int expectedResult=-2;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.subtract(a, b);

        //: Then

        Assert.assertEquals("should return a-b", expectedResult, actualResult);


    }

    @Test
    public void testMultiply() {
        //: Given:  given that two numbers are being multiplied together
        int a = 11;
        int b= 2;
        int expectedResult=22;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.multiply(a, b);

        //: Then

        Assert.assertEquals("should return the product of a and b", expectedResult, actualResult);


    }

    @Test
    public void testDivide() {
        //: Given:  given that a number is being divided by another
        int a = 9;
        int b= 2;
        double expectedResult=4.5;
        Calculator calculator = new Calculator();


        //: When
        double actualResult= calculator.divide(a, b);

        //: Then
        Assert.assertEquals("should divide a by b", expectedResult, actualResult, 0);


    }

    @Test
    public void testDivideByZero(){
        //Given
        int a=12;
        int b =0;
        Double expectedResult= Double.NaN;
        Calculator calculator = new Calculator();

        //when
        double actualResult= calculator.divide(a,b);

        //then
        Assert.assertEquals("You cannot divide a number by zero", expectedResult, actualResult, 0);

    }

    @Test
    public void testSquareRoot() {
        //: Given:
        int a = 16;
        int expectedResult=4;
        Calculator calculator = new Calculator();


        //: When
        double actualResult= calculator.calculateSquareRoot(a);

        //: Then
        Assert.assertEquals("should return the square root of number", expectedResult, actualResult, 0);


    }

    @Test
    public void testSquareNumber() {
        //: Given:  given that you are multiplying a number by itself
        int a = 3;
        int expectedResult=9;
        Calculator calculator = new Calculator();


        //: When
        double actualResult= calculator.calculateSquareNumber(a);

        //: Then
        Assert.assertEquals("should return the square of a number", expectedResult, actualResult, 0);


    }
    @Test
    public void testVariableExponentiation() {
        //: Given:  given that you have two numbers and are raising the first to the power of the second
        int a = 2;
        int b=4;
        int expectedResult=16;
        Calculator calculator = new Calculator();


        //: When
        double actualResult= calculator.calculateVariableExponentiation(a, b);

        //: Then
        Assert.assertEquals("should return a number raised to the power of another", expectedResult, actualResult, 0);


    }
    @Test
    public void calculateInverse() {
        //: Given:  given that you are raising a number to the -1 power
        double a = 14;
        double expectedResult=.0714;
        Calculator calculator = new Calculator();


        //: When
        double actualResult= calculator.calculateInverse(a);

        //: Then

        // ... The result should be the inputted number raised to the -1 power
        Assert.assertEquals("should return the inverse of the number", expectedResult, actualResult, 0.01);


    }

    @Test
    public void calculateInverseWithZero() {
        //: Given:  given that you are raising a number to the -1 power
        double a = 0;
        double expectedResult=Double.NaN;
        Calculator calculator = new Calculator();


        //: When
        double actualResult= calculator.calculateInverse(a);

        //: Then

        // ... The result should be the inputted number raised to the -1 power
        Assert.assertEquals("should return 'not a number'", expectedResult, actualResult, 0.01);


    }

    @Test
    public void calculateAdditiveInverse() {
        //: Given:  given that you are raising a number to the -1 power
        int a = 12;
        int expectedResult=-12;
        Calculator calculator = new Calculator();


        //: When
        int actualResult= calculator.calculateAdditiveInverse(a);

        //: Then

        // ... The result should be the the same number, but the inverse
        Assert.assertEquals("should return the additive inverse of a number", expectedResult, actualResult);


    }











}