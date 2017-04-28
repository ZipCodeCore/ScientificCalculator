package io.github.aaronclong;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by aaronlong on 4/28/17.
 */
public class DisplayTest {
    private Display display;

    @Before
    public void setUp() {
        display = new Display();
    }

    @Test
    public void testAddToScreen() {
        Assert.assertTrue("Confirm value added to Screen", display.addToScreen("97 * 7"));
    }
}
