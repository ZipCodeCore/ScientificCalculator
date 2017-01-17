package Kim;

/**
 * Created by andykim on 1/14/17.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TrigOperatorsTest {
    TrigOperators thirdTest;
    @Before
    public void setUp(){
        thirdTest = new TrigOperators();
    }
    @Test
    public void sin(){
        double expected = 0.8414709848078965;
        double actual = thirdTest.sin(1);
        assertEquals(expected, actual, 0);

    }
    @Test
    public void asin(){
        double expected = 1.5707963267948966;
        double actual = thirdTest.inverseSin(1);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void cos(){
        double expected = 0.5403023058681398;
        double actual = thirdTest.cos(1);
        assertEquals(expected,actual, 0);

    }
    @Test
    public void inverseCos(){
        double expected = 0;
        double actual = thirdTest.inverseCos(1);
        assertEquals(expected, actual, 0);

    }
    @Test
    public void tan(){
        double expected = 1.5574077246549023;
        double actual = thirdTest.tan(1);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void atan(){
        double expected = 0.7853981633974483;
        double actual = thirdTest.inverseTan(1);
        assertEquals(expected, actual, 0);
    }
}
