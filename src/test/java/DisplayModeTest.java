/**
 * Created by danzygmund-felt on 4/29/17.
 */
import org.junit.*;

public class DisplayModeTest {

    @Test
    public void toDisplayDecimalTest() {
        //Given
        DisplayMode displayMode = new DisplayMode();
        String expected = "1234";
        //When
        String actual = displayMode.toDisplay(1234);
        //Then
        Assert.assertEquals("1234.0 is 1234.0 in base 10", expected, actual);
    }

    @Test
    public void toDisplayHexadecimalTest() {
        //Given
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode(1);
        String expected = Double.toHexString(81.81);
        //When
        String actual = displayMode.toDisplay(81.81);
        //Then
        Assert.assertEquals("these are equivalent hexadecimal values", expected, actual);
    }
/*
Need to work out representation of doubles before I can do these.

    @Test
    public void toDisplayBinaryTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void toDisplayOctalTest() {
        //Given
        //When
        //Then
    }
*/
}
