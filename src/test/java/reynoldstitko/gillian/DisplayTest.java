package reynoldstitko.gillian;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class DisplayTest {

    Display displayTest;

    @Before
    public  void  setUp(){

        displayTest = new Display();
    }


    @Test
    public void clearDisplayTest(){
        displayTest.clearDisplay();
        assertTrue((displayTest.getCurrentDisplayValue() == 0.0));
    }

    @Test
    public void getCurrentDisplayValueTest(){
        Double expected = 1.0;
        displayTest.setCurrentDisplayValue(1.0);
        Double actual = displayTest.getCurrentDisplayValue();
        assertEquals("I expected the value to be 1.0", expected, actual);
    }

    @Test
    public void setCurrentDisplayValueTest(){
        Double expected = 1.0;
        displayTest.setCurrentDisplayValue(1.0);
        Double actual = displayTest.getCurrentDisplayValue();
        assertEquals("I expected the value to be 1.0", expected, actual);
    }

}
