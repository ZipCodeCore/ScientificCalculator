package kamsheh.adam.project1calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by adam on 9/11/16.
 */
public class DisplayTest {

    Display display;
    @Before
    public void initialize() {
        display = new Display();
    }

    @Test
    public void toBinaryTest() {
        String expectedValue = "1111101000";
        String actualValue = display.toBinary(1000);

        Assert.assertEquals("Decimal to binary.", expectedValue, actualValue);
    }

    @Test
    public void toOctalTest() {
        String expectedValue = "1750";
        String actualValue = display.toOctal(1000);

        Assert.assertEquals("Decimal to octal.", expectedValue, actualValue);
    }

    @Test
    public void toHexadecimalTest() {
        String expectedValue = "3e8";
        String actualValue = display.toHexadecimal(1000);

        Assert.assertEquals("Decimal to octal.", expectedValue, actualValue);
    }

    @Test
    public void displayNumericTest() {
        String expectedValue = "1000.0";
        String actualValue = display.displayNumeric(1000);

        Assert.assertEquals("Make sure function displays proper numerical type.", expectedValue, actualValue);
    }
}
