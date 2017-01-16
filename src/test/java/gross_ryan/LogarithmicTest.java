package gross_ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/16/17.
 */
public class LogarithmicTest {

    Logarithmic aLog;

    @Before
    public void setUp() {
        aLog = new Logarithmic();
    }

    @Test
    public void naturalLogTest() {
        Assert.assertEquals(1.609, aLog.naturalLog(5), 0.01);
    }

    @Test
    public void inverseNaturalLogTest() {
        Assert.assertEquals(0.621, aLog.inverseNaturalLog(5),0.01);
    }

    @Test
    public void baseTenLogTest() {
        Assert.assertEquals(0.69, aLog.baseTenLog(5), 0.01);
    }

    public void inverseBaseTenLogTest() {
        Assert.assertEquals(1.431, aLog.inverseBaseTenLog(5), 0.01);
    }
}
