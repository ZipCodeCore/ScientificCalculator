package io.github.aaronclong;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 4/29/17.
 */
public class BasicMathTest {

    @Test
    public void testAddition() {
        int seven = 7;
        Assert.assertEquals("Confirming int addition", 14.0, BasicMath.addition(seven, seven),.003);
        double fifteen = 15.0;
        Assert.assertEquals("Confirming double addition", 30.0, BasicMath.addition(fifteen, fifteen),.003);
    }

    @Test
    public void division() {
        int twenty = 20;
        int five = 4;
        Assert.assertEquals("Confirm int division", 5.0, BasicMath.division(twenty, five),.003);
        double fifteen = 15.0;
        double three = 3.0;
        Assert.assertEquals("Confirm double division", 5.0, BasicMath.division(fifteen, three),.003);
    }

    @Test
    public void testMultiplication() {
        int four = 4;
        Assert.assertEquals("Confirming two ints can be multiplied", 16.0, BasicMath.multiply(four, four), .003);
        double eight = 8.2;
        Assert.assertEquals("Checking doubles being multiplied", 67.24, BasicMath.multiply(eight, eight), .003);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals("Confirming two ints can be subtracted", 3.0, BasicMath.subtract(4, 1), .003);
        Assert.assertEquals("Confirming two doubles can be subtracted", 3.0, BasicMath.subtract(4.0, 1.0), .003);
    }

}
