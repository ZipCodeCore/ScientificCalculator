package Kim;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Created by andykim on 1/15/17.
 */
public class LogFunctionsTest {
    LogFunctions fourthTest;
    @Before
    public void setUp(){
        fourthTest = new LogFunctions();
    }

    @Test
    public void log() {
        double expected = 1;
        double actual = fourthTest.log(10);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void inverseLog(){
        double expected = 1000.0;
        double actual = fourthTest.inverseLog(3);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void naturalLog(){
        double expected = 1.3862943611198906;
        double actual = fourthTest.naturalLog(4);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void inverseNaturalLog(){
        double expected = 7.38905690893065;
        double actual = fourthTest.inverseNaturalLog(2);
        assertEquals(expected, actual, 0);

    }

}
