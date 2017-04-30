import org.junit.Test;
import org.junit.Assert;


public class TestDisplay {

    @Test
    public void testGetValue() {

        Display display = new Display();

        String output = display.getCurrentValue();

        Assert.assertNotNull(output);
    }

    @Test
    public void testSetValue() {

        Display display = new Display();

        display.setCurrentValue("5.0");

        String expectedValue = "5.0";
        String actualValue = display.getCurrentValue();

        Assert.assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testClear() {

        Display display = new Display();

        display.setCurrentValue("6.3");
        display.clear();

        String actualValue = display.getCurrentValue();
        String expectedValue = "0";

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSendErr() {

        Display display = new Display();
        String expectedValue = "Err";
        display.sendErr();

        Assert.assertEquals(expectedValue, display.getCurrentValue());
    }

    @Test
    public void testValidateDoubleTrue() {

        Display display = new Display();
        Boolean expectedValue = true;
        Boolean actualValue = display.validateDouble("5.0");

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testValidateDoubleFalse() {

        Display display = new Display();

        Boolean expectedValue = false;
        Boolean actualValue = display.validateDouble("Five point oh");

        Assert.assertEquals(expectedValue, actualValue);
    }

}
