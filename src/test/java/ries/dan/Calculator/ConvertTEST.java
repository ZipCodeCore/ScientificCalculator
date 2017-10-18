package ries.dan.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by danries on 1/14/17.
 */
public class ConvertTEST {

    @Test
    public void invertNumberTEST(){
        double actual = Convert.invertNumber(23);
        double expected = -23;
        assertEquals("We expect -23", expected, actual, 0);
    }

}
