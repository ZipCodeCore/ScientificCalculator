package com.zipcodewilmington.scientific_calculator;
import static org.junit.Assert.assertEquals;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {


    @Test //Log base 10 method test
    public void getLog10() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.0, newLog.logarithm(10.0), 0.0000001);
    }
    @Test //Log base 10 method Err test
    public void getLog101() {
        MainApplication newLog = new MainApplication();
        assertEquals(Double. NEGATIVE_INFINITY, newLog.logarithm(0.0), 0.0000001);
    }


    @Test //Inverted log test
    public void getInvLog10() {
        MainApplication newLog = new MainApplication();
        assertEquals(100000.0, newLog.invLog(5.0), 0.0000001);
    }
    @Test //Natural Log test
    public void getNetLog() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.609437912, newLog.natLog(5.0), 0.0000001);
    }
    @Test //Inverted Natural Log test
    public void getInvNetLog() {
        MainApplication newLog = new MainApplication();
        assertEquals(148.4131591, newLog.invNatLog(5.0), 0.0000001);
    }


    @Test
    public void displayTest() {
        MainApplication displaytester = new MainApplication();

        assertEquals("octal", displaytester.switchDisplayMode());
        assertEquals("decimal", displaytester.switchDisplayMode());
        assertEquals("hexadecimal", displaytester.switchDisplayMode());
    }

    @Test
    public void modeChange() {
        MainApplication modeChanger = new MainApplication();

        assertEquals("binary", modeChanger.switchDisplayMode("binary"));
        assertEquals("hexadecimal", modeChanger.switchDisplayMode("hexadecimal"));
        assertEquals("Err", modeChanger.switchDisplayMode("hello!"));
    }

    @Test
    public void unitChangeButton() {
        MainApplication unitChanger = new MainApplication();

        assertEquals("radians", unitChanger.switchUnitsMode());
        assertEquals("degrees", unitChanger.switchUnitsMode());
        assertEquals("radians", unitChanger.switchUnitsMode());
    }

    @Test
    public void unitChange() {
        MainApplication unitChanger1 = new MainApplication();

        assertEquals("radians", unitChanger1.switchUnitsMode("radians"));
        assertEquals("Err", unitChanger1.switchUnitsMode("Break me"));
        assertEquals("degrees", unitChanger1.switchUnitsMode("degrees"));
    }






}
