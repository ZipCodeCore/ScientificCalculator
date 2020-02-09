package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Basic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBasic {

    @Test
    public void testAdd1(){
        Basic calculator = new Basic();
        Assert.assertEquals(5, calculator.add(2, 3), 0);
    }

    @Test
    public void testAdd2(){
        Basic calculator = new Basic();
        Assert.assertEquals(15, calculator.add(7, 8), 0);
    }
}
