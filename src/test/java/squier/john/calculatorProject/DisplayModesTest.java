package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/14/17.
 */
public class DisplayModesTest {

    @Test
    public void testAdvanceDisplayModeBinary() {
        DisplayModes expected = DisplayModes.DECIMAL;
        DisplayModes actual = DisplayModes.BINARY.advanceDisplayMode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdvanceDisplayModeDecimal() {
        DisplayModes expected = DisplayModes.HEXADECIMAL;
        DisplayModes actual = DisplayModes.DECIMAL.advanceDisplayMode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdvanceDispalyModeHexaDecimal() {
        DisplayModes expected = DisplayModes.BINARY;
        DisplayModes actual = DisplayModes.HEXADECIMAL.advanceDisplayMode();
        Assert.assertEquals(expected, actual);
    }
}
