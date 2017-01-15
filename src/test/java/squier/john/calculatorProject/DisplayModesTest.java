package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/14/17.
 */
public class DisplayModesTest {

    @Test
    public void testAdvanceDisplayModeDecimal() {
        DisplayModes expected = DisplayModes.HEXADECIMAL;
        DisplayModes actual = DisplayModes.DECIMAL.advanceDisplayMode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdvanceDispalyModeHexaDecimal() {
        DisplayModes expected = DisplayModes.DECIMAL;
        DisplayModes actual = DisplayModes.HEXADECIMAL.advanceDisplayMode();
        Assert.assertEquals(expected, actual);
    }
}
