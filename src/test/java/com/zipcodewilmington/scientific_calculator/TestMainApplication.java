package com.zipcodewilmington.scientific_calculator;

/**
 * Created by leon on 2/9/18.
 */

import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.MathMethods;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMainApplication {
    MathMethods test = new MathMethods();
    @Test
    public void addTest1() {
        assertEquals(10, test.add(5, 5), 0.01);
    }
    @Test
    public void addTest2() {
        assertEquals(10.5, test.add(7, 3.5), 0.01);
    }
    @Test
    public void subtractTest1() {
        assertEquals(2, test.subtract(7, 5), 0.01);
    }
    @Test
    public void subtractTest2() {
        assertEquals(10, test.subtract(20.5, 10.5), 0.01);
    }
    @Test
    public void multiplicationTest1() {
        assertEquals(56, test.multiplication(7, 8), 0.01);
    }
    @Test
    public void multiplicationTest2() {
        assertEquals(8.05, test.multiplication(2.3, 3.5), 0.01);
    }
    @Test
    public void divisionTest1() {
        assertEquals(3, test.division(15, 5), 0.01);
    }
    @Test
    public void divisionTest2() {
        assertEquals(6.0, test.division(36.0, 6.0), 0.01);
    }
    @Test
    public void remainderTest1() {
        assertEquals(2.0, test.remainder(5.00, 3.00), 0.01);
        ;
    }
    @Test
    public void remainderTest2() {
        assertEquals(0.00, test.remainder(6.00, 3.00), 0.01);
        ;
    }
}