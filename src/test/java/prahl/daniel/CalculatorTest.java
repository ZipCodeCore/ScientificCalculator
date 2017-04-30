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
    float a = 5.0f; // sample value for display
    float b = 10.0f; // sample value for operand

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

    @Test
    public void testSquare(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set display to 5 - also works with 0.0
        float expected = 25.0f; // the product 5 times 5

        //when;
        ulator.square(); // should turn 5 into 25 on display
        float actual = Float.parseFloat(ulator.getDisplay()); // get the current value in the display

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testSquareRoot(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(100.0f); // set display to 100
        float expected = 10.0f; // 10 is the square root of 100

        //when;
        ulator.squareRoot(); // should return the square root of display
        float actual = Float.parseFloat(ulator.getDisplay()); // get what display is now

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testRaiseTo(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set to 5
        float expected = 9765625f; // 5 to the 10th

        //when;
        ulator.raiseTo(b); // raise current display to the 10th power
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testInverse(){
        //given:
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set the display to 5
        float expected = 0.2f; // 1 / 5 = .2

        //when:
        ulator.inverse(); // should return 1 divided by 5
        float actual = Float.parseFloat(ulator.getDisplay());

        //then:
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testSwitchSign(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set to 5
        float expected = -5.0f; // only the sign will be flipped

        //when;
        ulator.switchSign(); // attempt to change only the sign of the value in display
        float actual = Float.parseFloat(ulator.getDisplay());

        //then;
        Assert.assertEquals(expected, actual, delta);

    }
    


    // testing scientific functions
    @Test
    public void testMemoryAdd(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set display to 5
        float expected = 5.0f; // value that should be added into memory

        //when;
        ulator.memoryAdd(); // should set memory to 5
        ulator.clearDisplay(); // set display back to 0
        ulator.memoryRecall(); // send current value in memory into display
        float actual = Float.parseFloat(ulator.getDisplay()); //  get the current value in display

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testMemoryAddErr(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set display to 5
        ulator.memoryAdd(); // set memory to 5
        ulator.setError(); // set display to "Err"
        float expected = 5.0f;// should not add 5 a second time

        //when;
        ulator.memoryAdd(); // attempt to add "Err" into memory, should remain 5
        ulator.memoryRecall(); // move 5 in memory into display, clearing "Err"
        float actual = Float.parseFloat(ulator.getDisplay()); // 5 from the display, sent from memory

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testMemoryClear(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set displayed value to 5
        ulator.memoryAdd(); // add that same 5 to 0 already in memory
        float expected = 0.0f; // what should return from memory after clearing


        //when;
        ulator.memoryClear(); // clear the memory
        ulator.memoryRecall(); //  set display to whats currently in memory
        float actual = Float.parseFloat(ulator.getDisplay()); // get current value in display

        //then;
        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void testMemoryRecall(){
        //given;
        ulator = new Calculator(); // create fresh instance
        ulator.setDisplay(a); // set display to 5
        ulator.memoryAdd(); // add 5 to memory
        ulator.memoryAdd(); // add same 5 to memory again
        float expected = 10.0f; // what should return from memory after adding display twice


        //when;
        ulator.memoryRecall(); // should send value in memory into display
        float actual = Float.parseFloat(ulator.getDisplay()); // get current value in display

        //then;
        Assert.assertEquals(expected, actual, delta);

    }




}// end of test class
