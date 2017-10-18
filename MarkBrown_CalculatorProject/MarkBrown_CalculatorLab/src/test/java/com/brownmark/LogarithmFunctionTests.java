package com.brownmark;
import org.junit.Assert;
import org.junit.Test;

public class LogarithmFunctionTests {

    @Test
    public void testLogarithmFunction() {
        //Given:
        double operand1 = 100;
        LogarithmFunctionEngine logarithmFunctionEngine = new LogarithmFunctionEngine();
        double expectedResult = 2;

        //When:
        double actualResult = logarithmFunctionEngine.logFunction(operand1);

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0.0001);

    }

    @Test
    public void testInverseLogarithmFunction() {
        //Given:
        double operand1 = 2;
        LogarithmFunctionEngine logarithmFunctionEngine = new LogarithmFunctionEngine();
        double expectedResult = 100;

        //When:
        double actualResult = logarithmFunctionEngine.inverseLogFunction(operand1);

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0.0001);

    }

    @Test
    public void testNaturalLogarithmFunction() {
        //Given:
        double operand1 = 5;
        LogarithmFunctionEngine logarithmFunctionEngine = new LogarithmFunctionEngine();
        double expectedResult = 1.6094;

        //When:
        double actualResult = logarithmFunctionEngine.naturalLogFunction(operand1);

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0.0001);

    }

    @Test
    public void testInverseNaturalLogarithmFunction() {
        //Given:
        double operand1 = 3;
        LogarithmFunctionEngine logarithmFunctionEngine = new LogarithmFunctionEngine();
        double expectedResult = 20.08554;

        //When:
        double actualResult = logarithmFunctionEngine.inverseNaturalLogFunction(operand1);

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0.0001);

    }

}
