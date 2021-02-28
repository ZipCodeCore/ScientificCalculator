package com.zipcodewilmington.scientific_calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {


    //Log base 10 method tests
    @Test
    public void getLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(3.0, newLog.logarithm(1000.0), 0.0000001);
        assertEquals(1.0, newLog.logarithm(10.0), 0.0000001);
        assertEquals(-0.3010299957, newLog.logarithm(0.5), 0.0000001);
        assertEquals(-1.0, newLog.logarithm(0.1), 0.0000001);
        assertEquals(Double. NEGATIVE_INFINITY, newLog.logarithm(0.0), 0.0000001);
        assertEquals(Double.NaN, newLog.logarithm(-1.0), 0.0000001);
    }


    @Test //Inverted log base 10 test
    public void getInvLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(100000.0, newLog.invLog(5.0), 0.0000001);
        assertEquals(10.0, newLog.invLog(1.0), 0.0000001);
        assertEquals(3.16227766, newLog.invLog(0.5), 0.0000001);
        assertEquals(1.258925412, newLog.invLog(0.1), 0.0000001);
        assertEquals(0.1, newLog.invLog(-1.0), 0.0000001);
    }


    @Test //Natural Log tests
    public void getNatLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.609437912, newLog.natLog(5.0), 0.0000001);
        assertEquals(0.0, newLog.natLog(1.0), 0.0000001);
        assertEquals(Double.NEGATIVE_INFINITY, newLog.natLog(0.0), 0.0000001);
        assertEquals(Double.NaN, newLog.natLog(-1), 0.0000001);
        assertEquals(-2.302585093, newLog.natLog(0.1), 0.0000001);
    }

    @Test //Inverted Natural Log tests
    public void getInvNatLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(148.4131591, newLog.invNatLog(5.0), 0.0000001);
        assertEquals(1.0, newLog.invNatLog(0.0), 0.0000001);
        assertEquals(0.3678794412, newLog.invNatLog(-1.0), 0.0000001);
        assertEquals(1.105170918, newLog.invNatLog(0.1), 0.0000001);
        assertEquals(0.904837418, newLog.invNatLog(-0.1), 0.0000001);


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


    @Test
    public void findFactorial() {
        MainApplication findFactorialTest = new MainApplication();

        assertEquals(120.0, findFactorialTest.findFactorial(5.0), 1e-15);
        assertEquals(362880, findFactorialTest.findFactorial(9), 1e-15);
        assertEquals(6.0, findFactorialTest.findFactorial(3.0), 1e-15);
    }

    @Test
    public void setCurrentValue() {
        MainApplication setCurrentValueTest = new MainApplication();

        assertEquals(10, setCurrentValueTest.setCurrentValue(10), 1e-15);
        assertEquals(21.1, setCurrentValueTest.setCurrentValue(21.1), 1e-15);
        assertNotEquals(5.0, setCurrentValueTest.setCurrentValue(5.1), 1e-15);
    }

    @Test
    public void clearMemory() {
        MainApplication clearMemoryTest = new MainApplication();

        assertEquals(0, clearMemoryTest.clearMemory(), 1e-15);
        assertEquals(0, clearMemoryTest.clearMemory(), 1e-15);
        assertNotEquals(5.0, clearMemoryTest.clearMemory(), 1e-15);
    }






}
