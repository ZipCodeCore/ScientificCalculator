/**
 * Created by danzygmund-felt on 4/29/17.
 * Note 4.29: Not sure how I'm going to test output, since
 * this class is only responsible for printing to the console at this point.
 */
import org.junit.*;

public class DisplayModeTest {

    @Test
    public void toDisplayDecimalTest() {
        //Given
        DisplayMode displayMode = new DisplayMode();
        String expected = Double.toString(12.34);
        //When
        String actual = displayMode.toDisplayMode(12.34);
        //Then
        Assert.assertEquals("12.34 should read like 12.34", expected, actual);
    }

    @Test
    public void toDisplayHexadecimalTest() {
        //Given
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode();
        String expected = Double.toHexString(-81.81);
        //When
        String actual = displayMode.toDisplayMode(-81.81);
        //Then
        Assert.assertEquals("-81.81 should read like -81.81", expected, actual);
    }

}
