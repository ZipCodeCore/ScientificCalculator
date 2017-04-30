package io.github.aaronclong.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 4/28/17.
 */
public class InputBufferTest {
    @Test
    public void testFactoryMethod(){
        Assert.assertTrue("Asserts factory method returns", InputBuffer.makeInputBuffer("10") instanceof InputBuffer);
    }
    @Test
    public void testGetValue() {
        InputBuffer buffer = InputBuffer.makeInputBuffer("10 * 9");
        Assert.assertEquals("Confirming proper value return for buffer",90.0, buffer.getValue(), .003);
    }
}
