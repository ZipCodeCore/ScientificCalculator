package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {

    //Log base 10 method tests
    @Test
    public void getLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(3.0, newLog.logarithm(1000.0), 0.0000001);
    }
    @Test
    public void getLog1() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.0, newLog.logarithm(10.0), 0.0000001);
    }
    @Test
    public void getLog2() {
        MainApplication newLog = new MainApplication();
        assertEquals(-0.3010299957, newLog.logarithm(0.5), 0.0000001);
    }
    @Test
    public void getLog3() {
        MainApplication newLog = new MainApplication();
        assertEquals(-1.0, newLog.logarithm(0.1), 0.0000001);
    }
    @Test
    public void getLog4() {
        MainApplication newLog = new MainApplication();
        assertEquals(Double. NEGATIVE_INFINITY, newLog.logarithm(0.0), 0.0000001);
    }
    @Test
    public void getLog5() {
        MainApplication newLog = new MainApplication();
        assertEquals(Double.NaN, newLog.logarithm(-1.0), 0.0000001);
    }


    @Test //Inverted log base 10 test
    public void getInvLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(100000.0, newLog.invLog(5.0), 0.0000001);
    }
    @Test
    public void getInvLog1() {
        MainApplication newLog = new MainApplication();
        assertEquals(10.0, newLog.invLog(1.0), 0.0000001);
    }
    @Test
    public void getInvLog2() {
        MainApplication newLog = new MainApplication();
        assertEquals(3.16227766, newLog.invLog(0.5), 0.0000001);
    }
    @Test
    public void getInvLog3() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.258925412, newLog.invLog(0.1), 0.0000001);
    }
    @Test
    public void getInvLog4() {
        MainApplication newLog = new MainApplication();
        assertEquals(0.1, newLog.invLog(-1.0), 0.0000001);
    }


    @Test //Natural Log tests
    public void getNetLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.609437912, newLog.natLog(5.0), 0.0000001);
    }
    @Test
    public void getNetLog1() {
        MainApplication newLog = new MainApplication();
        assertEquals(0.0, newLog.natLog(1.0), 0.0000001);
    }
    @Test
    public void getNetLog2() {
        MainApplication newLog = new MainApplication();
        assertEquals(Double.NEGATIVE_INFINITY, newLog.natLog(0.0), 0.0000001);
    }
    @Test
    public void getNetLog3() {
        MainApplication newLog = new MainApplication();
        assertEquals(Double.NaN, newLog.natLog(-1), 0.0000001);
    }
    @Test
    public void getNetLog4() {
        MainApplication newLog = new MainApplication();
        assertEquals(-2.302585093, newLog.natLog(0.1), 0.0000001);
    }

    @Test //Inverted Natural Log tests
    public void getInvNetLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(148.4131591, newLog.invNatLog(5.0), 0.0000001);
    }
    @Test
    public void getInvNetLog1() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.0, newLog.invNatLog(0.0), 0.0000001);
    }
    @Test
    public void getInvNetLog2() {
        MainApplication newLog = new MainApplication();
        assertEquals(0.3678794412, newLog.invNatLog(-1.0), 0.0000001);
    }
    @Test
    public void getInvNetLog3() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.105170918, newLog.invNatLog(0.1), 0.0000001);
    }
    @Test
    public void getInvNetLog4() {
        MainApplication newLog = new MainApplication();
        assertEquals(0.904837418, newLog.invNatLog(-0.1), 0.0000001);
    }

}
