package Ravikumar.Sujatha.Project1Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sujatharavikumar on 9/12/16.
 */
public class CalculatorTest {

    @Test
    public void sumOfNumbersTest(){
        Calculator calculate = new Calculator();
        double actualOutput = calculate.sumOfNumbers(2.0, 3.0);
        double expectedOutput = 5.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void differenceTest(){
        Calculator calculate = new Calculator();
        double actualOutput = calculate.difference(3.0, 2.0);
        double expectedOutput = 1.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void productOfNumbersTest(){
        Calculator calculate = new Calculator();
        double actualOutput = calculate.productOfNumbers(3.0, 2.0);
        double expectedOutput = 6.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void divideTest(){
        Calculator calculate = new Calculator();
        double actualOutput = calculate.divide(6.0, 2.0);
        double expectedOutput = 3.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }

    @Test
    public void factorialTest(){
        Calculator calculate = new Calculator();
        double actualOutput = calculate.factorial(4.0);
        double expectedOutput = 24.0;
        Assert.assertTrue(expectedOutput == actualOutput);
    }


}
