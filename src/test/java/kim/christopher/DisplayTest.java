package kim.christopher;

import static org.junit.Assert.*;
import org.junit.Test;

public class DisplayTest {

    @Test
    public void testClearDisplay(){

        //: Given
        Display myDisplay = new Display();

        //: When
        myDisplay.clearDisplay();

        //: Then
        assertEquals("0", myDisplay.currentDisplay);
    }
}
