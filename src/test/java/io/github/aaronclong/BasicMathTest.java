package io.github.aaronclong;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 4/29/17.
 */
public class BasicMathTest {
    @Test
    public void testMultiplication() {
        int four = 4;
        Assert.assertEquals("Confirming two ints can be multiplied", 16.0, BasicMath.multiply(four, four), .003);
        double eight = 8.2;
        Assert.assertEquals("Checking doubles being multiplied", 67.24, BasicMath.multiply(eight, eight), .003);
    }

    @Test
    public void testAddition() {

    }
}
