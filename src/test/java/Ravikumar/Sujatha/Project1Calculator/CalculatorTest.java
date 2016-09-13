package Ravikumar.Sujatha.Project1Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sujatharavikumar on 9/12/16.
 */
public class CalculatorTest {

    Calculator calculate = new Calculator();

    @Test
    public void sumOfNumbersTest(){
        double actualOutput = calculate.sumOfNumbers(2.0, 3.0);
        double expectedOutput = 5.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void differenceTest(){
        double actualOutput = calculate.difference(3.0, 2.0);
        double expectedOutput = 1.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void productOfNumbersTest(){
        double actualOutput = calculate.productOfNumbers(3.0, 2.0);
        double expectedOutput = 6.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void divideTest(){
        double actualOutput = calculate.divide(6.0, 2.0);
        double expectedOutput = 3.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void factorialTest(){
        double actualOutput = calculate.factorial(4.0);
        double expectedOutput = 24.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void switchToHexTest(){
        String actualOutput = calculate.switchToHex(24.0);
        String expectedOutput = "18";
        Assert.assertTrue(expectedOutput.equals(actualOutput));
    }

    @Test
    public void switchToBinaryTest(){
        String actualOutput = calculate.switchToBinary(12.0);
        String expectedOutput = "1100";
        Assert.assertTrue(expectedOutput.equals(actualOutput));
    }

    @Test
    public void switchToOctalTest(){
        String actualOutput = calculate.switchToOctal(12.0);
        String expectedOutput = "14";
        Assert.assertTrue(expectedOutput.equals(actualOutput));
    }

}
