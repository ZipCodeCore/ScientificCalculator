package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrigFunctionsTest {

    private TrigFunctions trig;

    @Before
    public void setUp() throws Exception {
        trig = new TrigFunctions();
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void changeMode() {
        trig.radianMode();
        assertEquals(false, trig.inDegreeMode());

        trig.changeMode();
        assertEquals(true, trig.inDegreeMode());

        trig.changeMode();
        assertNotEquals(true, trig.inDegreeMode());
    }

    @Test
    public void radianMode() {
        trig.radianMode();
        assertEquals(false, trig.inDegreeMode());

        trig.degreeMode();
        trig.radianMode();
        assertEquals(false, trig.inDegreeMode());

        Double testVal = Math.random() * 2 * Math.PI;
        assertEquals( Math.sin( testVal ), trig.sin( testVal ), 0);
    }

    @Test
    public void degreeMode() {
        trig.degreeMode();
        assertEquals(true, trig.inDegreeMode());

        trig.radianMode();
        trig.degreeMode();
        assertEquals(true, trig.inDegreeMode());

        Double testVal = Math.random() * 2 * Math.PI;
        assertEquals( Math.sin(Math.toDegrees(testVal)), trig.sin( testVal ), 0);
    }

    @Test
    public void sinTest() {
        trig.radianMode();
        assertEquals(0.0, trig.sin(0.0).doubleValue(), 0);
        assertEquals(1.0, trig.sin(.5 * Math.PI).doubleValue(), 0);

        Double testVal = Math.random() * 2 * Math.PI;
        assertEquals( Math.sin( testVal ), trig.sin( testVal ), 0);
    }

    @Test
    public void cosTest() {
        trig.radianMode();
        assertEquals(1.0, trig.cos(0.0).doubleValue(), 0);
        assertEquals(-1.0, trig.cos( Math.PI ).doubleValue(), 0);

        Double testVal = Math.random() * 2 * Math.PI;
        assertEquals( Math.cos( testVal ), trig.cos( testVal ), 0);
    }

    @Test
    public void tanTest() {
        trig.radianMode();
        assertEquals(0.0, trig.tan(0.0).doubleValue(), 0.0000000001);
        assertEquals(0.0, trig.tan( Math.PI ).doubleValue(), 0.0000000001);

        Double testVal = Math.random() * 2 * Math.PI;
        assertEquals( Math.tan( testVal ), trig.tan( testVal ), 0.0000000001);
    }

    @Test
    public void arcSinTest() {
        trig.radianMode();
        assertEquals(0.0, trig.arcSin(0.0).doubleValue(), 0.0000000001);

        Double testVal = (Math.random() * 2.0) - 1;
        assertEquals( Math.asin( testVal ), trig.arcSin( testVal ), 0.0000000001);

        Double testVal2 = (Math.random() * 2.0) - 1;
        assertEquals( Math.asin( testVal2 ), trig.arcSin( testVal2 ), 0.0000000001);
    }

    @Test
    public void arcCosTest() {
        trig.radianMode();
        assertEquals(0.0, trig.arcCos(1.0).doubleValue(), 0.0000000001);

        Double testVal = (Math.random() * 2.0) - 1;
        assertEquals( Math.acos( testVal ), trig.arcCos( testVal ), 0.0000000001);

        Double testVal2 = (Math.random() * 2.0) - 1;
        assertEquals( Math.acos( testVal2 ), trig.arcCos( testVal2 ), 0.0000000001);
    }

    @Test
    public void arcTanTest() {
        trig.radianMode();
        assertEquals(0.0, trig.arcTan(0.0).doubleValue(), 0.0000000001);

        Double testVal = (Math.random() * 2.0) - 1;
        assertEquals( Math.atan( testVal ), trig.arcTan( testVal ), 0.0000000001);

        Double testVal2 = (Math.random() * 2.0) - 1;
        assertEquals( Math.atan( testVal2 ), trig.arcTan( testVal2 ), 0.0000000001);
    }
}