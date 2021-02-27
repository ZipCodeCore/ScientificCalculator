package com.zipcodewilmington.scientific_calculator;
import static org.junit.Assert.assertEquals;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

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
