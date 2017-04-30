package com.brownmark;
import org.junit.*;

public class BasicAlgebraEngineTest {

    @Test
    public void testCorrectAddition() {

        //Given:
        double operand1 = 5;
        double operand2 = 5;
        BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();
        double expectedOutput = 10;

        //When:
        double actualOutput = basicAlgebraEngine.add(operand1, operand2);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput,0.0001);

    }

    @Test
    public void testCorrectSubtraction() {

        //Given:
        double operand1 = 5;
        double operand2 = 5;
        BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();
        double expectedOutput = 0;

        //When:
        double actualOutput = basicAlgebraEngine.subtract(operand1, operand2);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput,0.0001);

    }

    @Test
    public void testCorrectMultiplication() {

        //Given:
        double operand1 = 5;
        double operand2 = 5;
        BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();
        double expectedOutput = 25;


        //When:
        double actualOutput = basicAlgebraEngine.multiply(operand1, operand2);


        //Then:
        Assert.assertEquals(expectedOutput, actualOutput,0.0001);

    }

    @Test
    public void testCorrectDivision() {

        //Given:
        double operand1 = 10;
        double operand2 = 5;
        BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();
        double expectedOutput = 2;

        //When:
        double actualOutput = basicAlgebraEngine.divide(operand1, operand2);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput,0.0001);

    }

    @Test
    public void testSquaring() {

        //Given:
        double operand1 = 10;
        BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();
        double expectedOutput = 100;

        //When:
        double actualOutput = basicAlgebraEngine.square(operand1);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput,0.0001);

    }

    @Test
    public void testReciprical() {

        //Given:
        double operand1 = 10;
        BasicAlgebraEngine basicAlgebraEngine = new BasicAlgebraEngine();
        double expectedOutput = 0.1;

        //When:
        double actualOutput = basicAlgebraEngine.recipricol(operand1);

        //Then:
        Assert.assertEquals(expectedOutput, actualOutput,0.0001);

    }

}
