package mccann.kevin.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class DisplayTest {

    @Test
    public void switchSignTest() {
        Display display = new Display();
        double expected = -4;
        double actual = display.switchSign(4);
        assertEquals("-4 expected",expected,actual,0);
    }

    @Test
    public void toDegreesTest() {
        Display display = new Display();
        double expected = 180;
        double actual = display.toDegrees(Math.PI);
        assertEquals("180 expected",expected,actual,0);
    }

    @Test
    public void toRadiansTest() {
        Display display = new Display();
        double expected = Math.PI;
        double actual = display.toRadians(180);
        assertEquals("Pi expected",expected,actual,0);
    }
}