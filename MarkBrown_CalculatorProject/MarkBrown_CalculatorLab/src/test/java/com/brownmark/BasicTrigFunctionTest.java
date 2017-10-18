package com.brownmark;
import org.junit.Assert;
import org.junit.Test;

public class BasicTrigFunctionTest {

    @Test
    public void testSineFunctionForCorrectOutput() {
        //Given:
        double operandOne = Math.PI;
        BasicTrigFunctionEngine basicTrigFunctionEngine = new BasicTrigFunctionEngine();
        double expectedOutput = 0;

        //When:
        double actualOutput = basicTrigFunctionEngine.sineFunction(operandOne);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput, 0.0001);
    }

    @Test
    public void testCosineFunctionForCorrectOutput() {
        //Given:
        double operandOne = Math.PI;
        BasicTrigFunctionEngine basicTrigFunctionEngine = new BasicTrigFunctionEngine();
        double expectedOutput = -1;

        //When:
        double actualOutput = basicTrigFunctionEngine.cosineFunction(operandOne);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput, 0.0001);

    }

    @Test
    public void testTanFunctionForCorrectOutput() {
        //Given:
        double operandOne = Math.PI / 4;
        BasicTrigFunctionEngine basicTrigFunctionEngine = new BasicTrigFunctionEngine();
        double expectedOutput = 1;

        //When:
        double actualOutput = basicTrigFunctionEngine.tanFunction(operandOne);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput, 0.0001);

    }

}
