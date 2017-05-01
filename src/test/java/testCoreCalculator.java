/**
 * Created by denniskalaygian on 4/29/17.
 */

import org.junit.Test;
import org.junit.Assert;

public class testCoreCalculator {

    @Test
    public void testGetValueReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        double returnValue = coreCalculator.getValue();
        //Then
        Assert.assertFalse("Current value must be a number", Double.isNaN(returnValue));
    }

    @Test
    public void testGetValue() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 2.00;
        //When
        double returnValue = coreCalculator.getValue();
        //Then
        Assert.assertTrue("getValue() method is returning the wrong number", expectedAnswer == returnValue);
    }

    @Test
    public void testDisplayValue() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 2.00;
        //When
        double returnValue = coreCalculator.getValue();
        //Then
        Assert.assertTrue("displayValue() method is displaying the wrong number", expectedAnswer == returnValue);
    }

    @Test
    public void testSetGivenNumberReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.setGivenNumber();
        //Then
        Assert.assertFalse("Input value must be a number", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testSetGivenNumber() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 3.00;
        //When
        double methodReturnValue = coreCalculator.setGivenNumber();
        //Then
        Assert.assertTrue("setGivenNumber() method is returning the wrong number", expectedAnswer == methodReturnValue);
    }

    @Test
    public void testAddReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.add();
        //Then
        Assert.assertFalse("add() method is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testAdd() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 5.00;
        //When
        coreCalculator.add();
        //Then
        Assert.assertTrue("add() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testSubtractReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.subtract();
        //Then
        Assert.assertFalse("subtract() method is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testSubtract() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = -1.00;
        //When
        coreCalculator.subtract();
        //Then
        Assert.assertTrue("subtract() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testMultiplyReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.multiply();
        //Then
        Assert.assertFalse("multiply() method is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testMultiply() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 6.00;
        //When
        coreCalculator.multiply();
        //Then
        Assert.assertTrue("multiply() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testDivideReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.divide();
        //Then
        Assert.assertFalse("divide() method is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testDivideByZero() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.divide();
        //Then
        Assert.assertFalse("Error: Cannot divide by zero", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testDivide() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 2.00/3.00;
        //When
        coreCalculator.divide();
        //Then
        Assert.assertTrue("divide() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testSquareReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.square();
        //Then
        Assert.assertFalse("square() method is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testSquare() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 4.00;
        //When
        coreCalculator.square();
        //Then
        Assert.assertTrue("square() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testSquareRootReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.squareRoot();
        //Then
        Assert.assertFalse("squareRoot() method is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testSquareRootNegative() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.squareRoot();
        //Then
        Assert.assertFalse("Error: Cannot take the square root of a negative number", coreCalculator.getValue() < 0);
    }

    @Test
    public void testSquareRoot() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = Math.sqrt(2);
        //When
        coreCalculator.squareRoot();
        //Then
        Assert.assertTrue("squareRoot() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testRaisePowerReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.raisePower();
        //Then
        Assert.assertFalse("raisePower() method is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testRaisePowerVariableType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.raisePower();
        //Then
        Assert.assertFalse("raisePower() method is accepting an invalid value", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testRaisePower() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 8.00;
        //When
        coreCalculator.raisePower();
        //Then
        Assert.assertTrue("raisePower() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testInverseReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.inverse();
        //Then
        Assert.assertFalse("inverse() is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testInverse() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 1.00/2.00;
        //When
        coreCalculator.inverse();
        //Then
        Assert.assertTrue("inverse() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testInvertSignReturnType() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.invertSign();
        //Then
        Assert.assertFalse("invertSign() is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testInvertSign() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = -2.00;
        //When
        coreCalculator.invertSign();
        //Then
        Assert.assertTrue("invertSign() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }

    @Test
    public void testClearDisplayReturnType(){
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        //When
        coreCalculator.clearDisplay();
        //Then
        Assert.assertFalse("clearDisplay() is converting the value to an invalid type", Double.isNaN(coreCalculator.getValue()));
    }

    @Test
    public void testClearDisplay() {
        //Given
        CoreCalculator coreCalculator = new CoreCalculator();
        double expectedAnswer = 0.00;
        //When
        coreCalculator.clearDisplay();
        //Then
        Assert.assertTrue("clearDisplay() method is returning the wrong number", expectedAnswer == coreCalculator.getValue());
    }


}
