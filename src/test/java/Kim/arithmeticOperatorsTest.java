/**
 * Created by andykim on 1/14/17.
 */
package Kim;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class arithmeticOperatorsTest {
    ArithmeticOperators firstTest;
    @Before
    public void setUp(){

        firstTest = new ArithmeticOperators();

    }

@Test
    public void add(){
        double expected = 10;
        double actual = firstTest.add(4, 6);

    assertEquals(expected, actual, 0);

    }
 @Test
    public void subtract(){
        double expected = 7;
        double actual = firstTest.subtract(17, 10);

        assertEquals(actual, expected, 0);
 }
 @Test
    public void multiply(){
        double expected = 48;
        double actual = firstTest.multiply(12, 4);

        assertEquals(expected, actual, 0);
 }
@Test
    public void divide(){
        double expected = 4;
        double actual = firstTest.divide(8,2);

        assertEquals(expected, actual, 0);
}



}
