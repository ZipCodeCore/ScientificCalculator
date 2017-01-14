package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/13/17.
 */
public class SquareTest {
    @Test
    public void getSquare() {
        Square square = new Square();
        Double expected  = 25.0;
        Double actual = square.getSquare(5.0);
        assertEquals("I expect 5.0 to return 25.0", expected, actual);
    }

}