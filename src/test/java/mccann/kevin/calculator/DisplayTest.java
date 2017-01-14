package mccann.kevin.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class DisplayTest {

    @Test
    public void switchSignTest() throws Exception {
        Display display = new Display();
        double expected = -4;
        double actual = display.switchSign(4);
        assertEquals("-4 expected",expected,actual,0);
    }
}