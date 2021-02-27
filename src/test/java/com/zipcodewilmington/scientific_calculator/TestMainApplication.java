package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {

    @Test //Log base 10 method test
    public void getLog10() {
        MainApplication newLog = new MainApplication(10.0);
        assertEquals(1.0, newLog.logarithm(10.0), 0.0000001);
    }
    @Test //Log base 10 method Err test
    public void getLog101() {
        MainApplication newLog = new MainApplication(0.0);
        assertEquals(Double. NEGATIVE_INFINITY, newLog.logarithm(0.0), 0.0000001);
    }


    @Test //Inverted log test
    public void getInvLog10() {
        MainApplication newLog = new MainApplication(5.0);
        assertEquals(100000.0, newLog.invLog(5.0), 0.0000001);
    }
    @Test //Natural Log test
    public void getNetLog() {
        MainApplication newLog = new MainApplication(5.0);
        assertEquals(1.609437912, newLog.natLog(5.0), 0.0000001);
    }
    @Test //Inverted Natural Log test
    public void getInvNetLog() {
        MainApplication newLog = new MainApplication(5.0);
        assertEquals(148.4131591, newLog.invNatLog(5.0), 0.0000001);
    }

}
