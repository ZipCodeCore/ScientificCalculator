package io.github.aaronclong.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 4/30/17.
 */
public class TrigFunctionsTest {
    @Test
    public void testSin() {
        Assert.assertEquals("Testing Sin function", 0.5139784559875352, TrigFunctions.process("sin", 78.0), .003);
    }

    @Test
    public void testCosine() {
        Assert.assertEquals("Testing Cosine function", -0.85780309324, TrigFunctions.process("cos", 78.0), .003);
    }

    @Test
    public void testTangent() {
        Assert.assertEquals("Testing Trig function", -0.59917999834, TrigFunctions.process("tan", 78.0), .003);
    }

    @Test
    public void testInverseSin() {
        Assert.assertEquals("Testing Inverse sin function",
                0.5235987755982989,
                TrigFunctions.process("in-sin", 0.5), .003);
    }

    @Test
    public void testInverseTan() {
        Assert.assertEquals("Testing Inverse tan function",
                0.4636476090008061,
                TrigFunctions.process("in-tan", 0.5), .003);
    }

    @Test
    public void testInverseCos() {
        Assert.assertEquals("Testing Inverse cos function",
                1.0471975511965979,
                TrigFunctions.process("in-cos", 0.5), .003);
    }
}
