package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.BasicCalculator;
import com.zipcodewilmington.scientificcalculator.ScFunction;
import org.junit.Assert;
import org.junit.Test;

public class TestScCalculator {



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

       /* @Test
        public void ChangeSignFromPositive() {
            Double assumed = -5.;
            Double actual = ScFunction.changeSign(5.);
            Assert.assertEquals(assumed, actual);
        }

        @Test
        public void ChangeSignFromNegative() {
            Double assumed = 5.;
            Double actual = ScFunction.changeSign(-5.);
            Assert.assertEquals(assumed, actual);
        }*/

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
    }



