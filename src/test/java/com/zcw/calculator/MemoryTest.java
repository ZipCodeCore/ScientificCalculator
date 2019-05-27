package com.zcw.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemoryTest {

    @Test
    public void store() {
    Memory m = new Memory();
        m.store("1");
        Assert.assertEquals("1",m.recallCurrentValue());
    }

    @Test
    public void resetMemory() {
    Memory m = new Memory();
        m.resetMemory();
        Assert.assertEquals("0",m.recallCurrentValue());
    }

    @Test
    public void recallCurrentValue() {

    }
}