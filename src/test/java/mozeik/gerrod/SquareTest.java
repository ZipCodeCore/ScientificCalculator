package mozeik.gerrod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class SquareTest {
    @Test
    public void getSquare() {
        Square square = new Square();
        Double expected = 25.0;
        Double actual = square.getSquare(5.0);
        assertEquals("I expect the square of 5 to be 25", expected, actual);
    }

}