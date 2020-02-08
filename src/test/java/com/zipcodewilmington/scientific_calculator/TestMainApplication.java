package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void test1()
    {
        Calculator c1 = new Calculator();
        assertEquals(55.0 ,c1.add(10.0, 45.0), 0.01);
    }
}