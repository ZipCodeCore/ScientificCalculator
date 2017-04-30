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
    public void testSetCurrentOperator() {

        Display display = new Display();

        display.setCurrentOperator("+");

        String expectedValue = "+";
        String actualValue = display.getCurrentOperator();

        Assert.assertEquals(expectedValue, actualValue);
    }

}
