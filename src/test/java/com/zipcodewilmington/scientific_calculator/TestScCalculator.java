package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.BasicCalculator;
import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.Fibonacci;
import com.zipcodewilmington.scientificcalculator.ScFunction;
import org.junit.Assert;

import org.junit.Test;

public class TestScCalculator {



        Fibonacci fibo = new Fibonacci();
        ScFunction scientificCal = new ScFunction();
        BasicCalculator basicCalc = new BasicCalculator();
        @Test
        public void positiveintegerAdderTest() {
            Double assumed = 2.;

            Double actual = basicCalc.add(1,1);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void NegativeIntegerAdderTest() {
            Double assumed = -200.;
            Double actual = basicCalc.add(0., -200.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SubtractionTestPositiveReturn() {
            Double assumed = 3.;
            Double actual = basicCalc.subtract(5., 2.);
            Assert.assertEquals(assumed, actual);

        }

        @Test
        public void SubtractionTestZeroReturn() {
            Double assumed = 0.;
            Double actual = basicCalc.subtract(3., 3.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SubtractionTestNegativeReturn() {
            Double assumed = -1.;
            Double actual = basicCalc.subtract(5., 6.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void MultiplicationPositiveReturn() {
            Double assumed = 40.;
            Double actual = basicCalc.multiply(20., 2.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void MultiplicationZeroReturn() {
            Double assumed = 0.;
            Double actual = basicCalc.multiply(0., 5.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void MultiplicationNegativeReturn() {
            Double assumed = -9.;
            Double actual = basicCalc.multiply(-3., 3.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void MultiplicationBothNegativeNumbers() {
            Double assumed = 9.;
            Double actual = basicCalc.multiply(-3., -3.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void DivisionPositiveReturnWholeNumber() {
            Double assumed = 10.;
            Double actual = basicCalc.divide(20., 2.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void DivisionPositiveReturnDecimal() {
            Double assumed = 2.5;
            Double actual = basicCalc.divide(5., 2.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void squareRootReturnPositiveWholeNumber() {
            Double assumed = 4.;
            Double actual = basicCalc.squareRoot(16.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void squareRootReturnPositiveDecimal() {
            Double assumed = 4.358898943540674;
            Double actual = basicCalc.squareRoot(19.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SquareReturnPositiveWholeNumber() {
            Double assumed = 100.;
            Double actual = basicCalc.square(10.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SquareReturnNegativeWholeNumber() {
            Double assumed = 25.;
            Double actual = basicCalc.square(-5.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SquareReturnPositiveDecimal() {
            Double assumed = 42.25;
            Double actual = basicCalc.square(6.5);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SquareReturnNegativeDecimal() {
            Double assumed = 30.25;
            Double actual = basicCalc.square(-5.5);
            Assert.assertEquals(assumed, actual);
        }



        @Test
        public void SinePositiveNumber() {
            Double assumed = 0.9129452507276277;
            Double actual = scientificCal.sin(20.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SineNegativeNumber() {
            Double assumed = 0.5365729180004349;
            Double actual = scientificCal.sin(-12.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void SineZeroNumber() {
            Double assumed = 0.;
            Double actual = scientificCal.sin(0.);
            Assert.assertEquals(assumed, actual);
        }


        @Test
        public void CosineNegativeNumber() {
            Double assumed = -0.7596879128588213;
            Double actual = scientificCal.cosine(-15.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void CosinePositiveNumber() {
            Double assumed = -0.7596879128588213;
            Double actual = scientificCal.cosine(-15.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void CosineZeroNumber() {
            Double assumed = 1.;
            Double actual = scientificCal.cosine(0.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void TangentZeroNumber() {
            Double assumed = 0.;
            Double actual = scientificCal.tangent(0.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void TangentPositiveNumber() {
            Double assumed = -0.8559934009085188;
            Double actual = scientificCal.tangent(15.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void TangentNegativeNumber() {
            Double assumed = 0.8559934009085188;
            Double actual = scientificCal.tangent(-15.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void ExponentPositiveNumbers() {
            Double assumed = 4.;
            Double actual = basicCalc.exponentiation(2., 2.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void ExponentNegativeNumbers() {
            Double assumed = 4.;
            Double actual = basicCalc.exponentiation(-2., 2.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void ExponentNegativeExponentPositiveNumber() {
            Double assumed = 0.0625;
            Double actual = basicCalc.exponentiation(4., -2.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void ExponentNegativeExponentNegativeNumber() {
            Double assumed = 0.0625;
            Double actual = basicCalc.exponentiation(-4., -2.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void ExponentZeroPositiveNumber() {
            Double assumed = 1.;
            Double actual = basicCalc.exponentiation(2., .0);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void ExponentZeroZeroNumber() {
            Double assumed = 1.;
            Double actual = basicCalc.exponentiation(0., .0);
            Assert.assertEquals(assumed, actual);
        }
        @Test
        public void Factorial(){
          Double assumed = 120.;
          Double actual = scientificCal.factorial(5.);
          Assert.assertEquals(assumed, actual);
        }
        @Test
    public void Fibonacci(){
            String assumed = " 0 1 1 2 3";
            String actual = fibo.fibonacci(5.);
            Assert.assertEquals(assumed, actual);

        }
        @Test
    public void Fibonacci2(){
        String assumed = " 0 1 1 2 3 5 8";
        String actual = fibo.fibonacci(7.);
        Assert.assertEquals(assumed, actual);

    }
    @Test
    public void Fibonacci3BigNumber(){
        String assumed = " 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269";
        String actual = fibo.fibonacci(32.);
        Assert.assertEquals(assumed, actual);

    }
  @Test
   public void ConvertToBinary() {
     String assumed = "10100";
     String actual = Console.applyDisplayMode(20, 2);
     Assert.assertEquals(assumed, actual);
   }

   @Test
   public void ConvertToBinary2(){
        String assumed = "11111010000";
        String actual = Console.applyDisplayMode(2000, 2);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ConvertToOctal(){
        String assumed = "12";
        String actual = Console.applyDisplayMode(10, 3);
        Assert.assertEquals(assumed, actual);
    }
    @Test
    public void ConvertToOctal2(){
        String assumed = "764";
        String actual = Console.applyDisplayMode(500, 3);
        Assert.assertEquals(assumed, actual);
    }

    @Test  // Need to Fix this test
    public void ConvertToHex(){
        String assumed = "b";
        String actual = Console.applyDisplayMode(11, 4);
        Assert.assertEquals(assumed, actual);
    }
    @Test
    public void ConvertToHex2(){
        String assumed = "9e";
        String actual = Console.applyDisplayMode(158.0, 4);
        Assert.assertEquals(assumed, actual);
    }
    }


