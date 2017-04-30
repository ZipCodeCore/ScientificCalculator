package com.brownmark;
import org.junit.Assert;
import org.junit.Test;

public class ErrorChecksTest {

    @Test
    public void testErrIsThrownForDivideByZero() {
        //Given:
        double operand1 = 5;
        double operand2 = 0;
        CalculationFeed calculationFeed = new CalculationFeed();

        //When:
        boolean actualResults = calculationFeed.errorChecks(operand1, "/", operand2);

        //Then:
        Assert.assertTrue(actualResults);
    }

    @Test
    public void testErrIsThrownForReciprocalDivideByZero() {
        //Given:
        double operand1 = 0;
        CalculationFeed calculationFeed = new CalculationFeed();

        //When:
        boolean actualResults = calculationFeed.errorChecks(operand1, "1/");

        //Then:
        Assert.assertTrue(actualResults);
    }

    @Test
    public void testErrIsThrownForSquareRootOfNegative() {
        //Given:
        double operand1 = -1;
        CalculationFeed calculationFeed = new CalculationFeed();

        //When:
        boolean actualResults = calculationFeed.errorChecks(operand1, "sqrt");

        //Then:
        Assert.assertTrue(actualResults);
    }

    @Test
    public void testErrIsThrownForLogarithmOfNegative() {
        //Given:
        double operand1 = -1;
        CalculationFeed calculationFeed = new CalculationFeed();

        //When:
        boolean actualResults = calculationFeed.errorChecks(operand1, "log");

        //Then:
        Assert.assertTrue(actualResults);
    }

    @Test
    public void testErrIsThrownForNaturalLogarithmOfNegative() {
        //Given:
        double operand1 = -1;
        CalculationFeed calculationFeed = new CalculationFeed();

        //When:
        boolean actualResults = calculationFeed.errorChecks(operand1, "ln");

        //Then:
        Assert.assertTrue(actualResults);
    }

}
