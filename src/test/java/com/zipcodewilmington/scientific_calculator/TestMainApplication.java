package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {

    /* //Used to make sure test class worked.
    @Test
    public void getSum() {
        MainApplication sum = new MainApplication(2,2);
        assertEquals(6, sum.addNum(3,3), 0.0000001);
    }
     */

    @Test //Log base 10 method test
    public void getLog10() {
        MainApplication newLog = new MainApplication(0.0,10.0);
        assertEquals(1.0, newLog.logarithm((Math.log10(0.0)),10.0), 0.0000001);
    }
    @Test //Log base 10 method Err test
    public void getLog101() {
        MainApplication newLog = new MainApplication(0.0,10.0);
        assertEquals(1.0, newLog.logarithm((Math.log10(0.0)),10.0), 0.0000001);
    }
    @Test //Inverted log 
    public void getInvLog10() {
        MainApplication newLog = new MainApplication(0.0,5.0);
        assertEquals(100000.0, newLog.invLog((Math.log10(0.0)),5.0), 0.0000001);
    }
    @Test
    public void getNetLog() {
        MainApplication newLog = new MainApplication(0.0, 5.0);
        assertEquals(1.609437912, newLog.natLog((Math.log(0.0)), 5.0), 0.0000001);
    }
    @Test
    public void getInvNetLog() {
        MainApplication newLog = new MainApplication(0.0, 5.0);
        assertEquals(148.4131591, newLog.invNatLog((Math.log(0.0)), 5.0), 0.0000001);
    }

}
