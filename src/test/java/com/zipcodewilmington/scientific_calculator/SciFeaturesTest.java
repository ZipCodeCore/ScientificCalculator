package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.SciFeatures;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SciFeaturesTest {
    SciFeatures test = new SciFeatures();

    @Test
    public void switchTest(){
        test.setDisplayMode("decimal");
        test.switchDisplayMode();
        assertEquals("hexadecimal", test.getDisplayMode());
    }
    @Test
    public void switchTest1(){
        test.setDisplayMode("binary");
        test.switchDisplayMode();
        assertEquals("octal", test.getDisplayMode());
    }
    @Test
    public void switchTest2(){
        test.setDisplayMode("hexadecimal");
        test.switchDisplayMode();
        assertEquals("binary", test.getDisplayMode());
    }
    @Test
    public void switchTest3(){
        test.setDisplayMode("octal");
        test.switchDisplayMode();
        assertEquals("decimal", test.getDisplayMode());
    }
    @Test
    public void switchTest4(){
        test.setDisplayMode("decimal");
        test.switchDisplayMode("hexadecimal");
        assertEquals("hexadecimal", test.getDisplayMode());
    }

    @Test
    public void memoryTest(){
        test.storeMemory(2);
        assertEquals(2, test.memoryRecall(), 0.01);
    }

}
