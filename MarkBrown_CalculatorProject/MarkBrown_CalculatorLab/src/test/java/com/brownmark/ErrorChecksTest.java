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

}
