/**
 * Created by danzygmund-felt on 4/29/17.
 * Note 4.29: Not sure how I'm going to test output, since
 * this class is only responsible for printing to the console at this point.
 */
import org.junit.*;

public class CalculatorDisplayModeTest {

    @Test
    public void toDisplayDecimalTest() {
        //Given
        CalculatorDisplayMode calculatorDisplayMode = new CalculatorDisplayMode();
        String expected = Double.toString(12.34);
        //When
        String actual = calculatorDisplayMode.toDisplayMode(12.34);
        //Then
        Assert.assertEquals("12.34 should read like 12.34", expected, actual);
    }

    @Test
    public void toDisplayHexadecimalTest() {
        //Given
        CalculatorDisplayMode calculatorDisplayMode = new CalculatorDisplayMode();
        calculatorDisplayMode.setMode();
        String expected = Double.toHexString(-81.81);
        //When
        String actual = calculatorDisplayMode.toDisplayMode(-81.81);
        //Then
        Assert.assertEquals("-81.81 should read like -81.81", expected, actual);
    }

    @Test
    public void toDisplayBinaryTest() {
        //Given
        CalculatorDisplayMode calculatorDisplayMode = new CalculatorDisplayMode();
        calculatorDisplayMode.setMode(2);
        String expected = "1000.001";
        //When
        String actual = calculatorDisplayMode.toDisplayMode(8.125);
        //Then
        Assert.assertEquals("binary conversion test", expected, actual);
    }

    @Test
    public void toDisplayOctalTest() {
        //Given
        CalculatorDisplayMode calculatorDisplayMode = new CalculatorDisplayMode();
        calculatorDisplayMode.setMode(3);
        String expected = "100.5";
        //When
        String actual = calculatorDisplayMode.toDisplayMode(64.625);
        //Then
        Assert.assertEquals("octal conversion test", expected, actual);
    }

}
