package kamsheh.adam.project1calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by adam on 9/12/16.
 */
public class LogOperationsTest {

    @Test
    public void logTest() {
        double expected = 1;
        double actual = LogOperations.log(10);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseLogTest() {
        double expected = 100;
        double actual = LogOperations.inverseLog(2);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void naturalLogTest() {
        double expected = 1;
        double actual = LogOperations.naturalLog(Math.E);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseNaturalLogTest() {
        double expected = 1;
        double actual = LogOperations.inverseNaturalLog(Math.log(1));

        Assert.assertEquals(expected, actual, 0);
    }
}
