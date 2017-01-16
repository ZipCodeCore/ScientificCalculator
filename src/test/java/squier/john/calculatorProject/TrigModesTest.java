package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by johnsquier on 1/15/17.
 */
public class TrigModesTest {

    @Test
    public void testAdvanceTrigModeFromDegrees() {
        TrigModes expected = TrigModes.RADIANS;
        TrigModes actual = TrigModes.DEGREES.advanceTrigMode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdvanceTrigModeFromRadians() {
        TrigModes expected = TrigModes.DEGREES;
        TrigModes actual = TrigModes.RADIANS.advanceTrigMode();
        Assert.assertEquals(expected, actual);
    }
}
