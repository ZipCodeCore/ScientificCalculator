package gross_ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/16/17.
 */
public class DisplayTest {
    Display testDisplay;

    @Before
    public void setUp() {
        testDisplay = new Display();
        testDisplay.displayedNumber = 400;
    }

    @Test
    public void toBinaryTest() {
        Assert.assertEquals("110010000", testDisplay.convertToBinary(testDisplay.displayedNumber));
    }

    @Test
    public void toHexTest() {
        Assert.assertEquals("190", testDisplay.convertToHex(testDisplay.displayedNumber));
    }

    @Test
    public void toOctalTest() {
        Assert.assertEquals("620", testDisplay.convertToOctal(testDisplay.displayedNumber));
    }

    @Test
    public void convertModeTest() {
        testDisplay.displayMode = "octal";
        Assert.assertEquals("620", testDisplay.convertDisplayedNumberString(testDisplay.displayedNumber));
        testDisplay.displayMode = "binary";
        Assert.assertEquals("110010000", testDisplay.convertDisplayedNumberString(testDisplay.displayedNumber));
        testDisplay.displayMode = "hex";
        Assert.assertEquals("190", testDisplay.convertDisplayedNumberString(testDisplay.displayedNumber));
    }

}
