package prahl.daniel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danielprahl on 4/29/17.
 */
public class CalculatorTest {

    Calculator ulator;
    float delta = 0.00001f;// margin for error when comparing float values
    float sample = -9.999f;

    @Test
    public void testClearDisplay(){
        //given;
        ulator = new Calculator();
        ulator.setDisplay(sample);
        float expected = 0.0f;

        //then;
        ulator.clearDisplay();

        //when;
        float actual = Float.parseFloat(ulator.getDisplay());
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testClearDisplayErr(){
        //given;
        ulator = new Calculator();
        ulator.setError();
        float expected = 0.0f;

        //then;
        ulator.clearDisplay();

        //when;
        float actual = Float.parseFloat(ulator.getDisplay());
        Assert.assertTrue(expected == actual);

    }

    @Test
    public void testSetDisplay(){
        //given;
        ulator = new Calculator();
        float expected = sample;

        //when;
        ulator.setDisplay(sample);
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testSetDisplayErr(){
        //given;
        ulator = new Calculator();
        float expected = sample;
        ulator.setError();// set the display to be in error mode

        //when;
        ulator.setDisplay(sample); // attempt to clear error with replacement value
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testGetDisplay(){
        //given;
        ulator = new Calculator();
        ulator.setDisplay(sample);
        float expected = sample;

        //when;
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testGetDisplayErr(){
        //given;
        ulator = new Calculator();
        String expected = "Err";

        //when;
        ulator.setError();
        String actual = ulator.getDisplay();

        //then;
        Assert.assertTrue(expected == actual);


    }

    @Test
    public void testSetError(){
        //given;
        ulator = new Calculator();

        //when;
        ulator.setError();

        //then;
        Assert.assertTrue(ulator.isError());

    }

    @Test
    public void testIsError(){
        //given;
        ulator = new Calculator();
        boolean expected = false;

        //when;
        boolean actual = ulator.isError();

        //then;
        Assert.assertTrue(expected == actual);

    }

    //testing basic math functions
    float a = 5;
    float b = 10;

    @Test
    public void testAdd(){
        //given;
        ulator = new Calculator();
        ulator.setDisplay(a);
        float expected = 15f; // 5 + 10 = 15

        //when;
        ulator.add(b);
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testSubtract(){
        //given;
        ulator = new Calculator();
        ulator.setDisplay(a);
        float expected = -5f; // 5 - 10 = -5

        //when;
        ulator.subtract(b);
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testMultiply(){
        //given;
        ulator = new Calculator();
        ulator.setDisplay(a);
        float expected = 50f; // 5 * 10 = 50

        //when;
        ulator.multiply(b);
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testDivide(){
        //given;
        ulator = new Calculator();
        ulator.setDisplay(a);
        float expected = 0.5f; // 5 / 10 = 0.5

        //when;
        ulator.divide(b);
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testDivideByZero(){
        //given;
        ulator = new Calculator();
        ulator.setDisplay(a);
        String expected = "Err";

        //when;
        ulator.divide(0.0f);
        String actual = ulator.getDisplay();

        //then;
        Assert.assertTrue(expected == actual);

    }




}// end of test class
