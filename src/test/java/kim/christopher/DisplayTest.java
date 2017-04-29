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
        // ... The result should be the sum of those two values
        assertEquals("0", myDisplay.currentDisplay);

    }

}
