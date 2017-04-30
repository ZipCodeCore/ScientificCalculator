package weisser.sarah;

import org.junit.Test;
import org.junit.Assert;



/**
 * Created by sarahweisser on 4/29/17.
 */
public class TestCalculator {

    @Test
    public void testAdd() {

        //given
        double value1 = 5;
        double value2 = 6;
        double expectedResult = 11.0;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.add(value1, value2);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testAddWithNegativeNumbers() {

        //given
        double value1 = -2;
        double value2 = 6;
        double expectedResult = 4;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.add(value1, value2);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testSubtraction() {

        //given
        double value1 = 6;
        double value2 = 5;
        double expectedResult = 1;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.subtract(value1, value2);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testSubtractionWithBiggerSecondNumber() {

        // given
        double value1 = 4;
        double value2 = 6;
        double expectedResult = -2;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.subtract(value1, value2);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testSubtractionWithNegativeNumber() {

        //given
        double value1 = -6;
        double value2 = -12;
        double expectedResult = 6;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.subtract(value1, value2);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testMultiplication() {

        //given
        double value1 = 5;
        double value2 = 6;
        double expectedResult = 30;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.multiply(value1, value2);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testNegativeMultiplication() {

        //given
        double value1 = -5;
        double value2 = -6;
        double expectedResult = 30;
        Calculator calculator = new Calculator();

        //when
        double actualResult = calculator.multiply(value1, value2);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }





}
