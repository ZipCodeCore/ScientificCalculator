package kamsheh.adam.project1calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.tools.jconsole.Plotter;

/**
 * Created by adam on 9/12/16.
 */
public class TrigOperationsTest {

    TrigOperations trig;
    @Before
    public void initialize() {
        trig = new TrigOperations();
    }

    @Test
    public void getUnits() {
        TrigOperations.Units expected = TrigOperations.Units.RADIAN;
        TrigOperations.Units actual = trig.getUnits();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitsTest() {
        trig.switchUnits();
        TrigOperations.Units expected = TrigOperations.Units.DEGREE;
        TrigOperations.Units actual = trig.getUnits();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertUnitsTest() {
        double expected = Math.PI;
        double actual = trig.convertUnits(180);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void sineTest() {
        double expected = 1;
        double actual = trig.sine(90);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void cosineTest() {
        double expected = 0;
        double actual = trig.cosine(90);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void tangentTest() {
        double expected = 0;
        double actual = trig.tangent(360);

        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void inverseSineTest() {
        double expected = 0;
        double actual = trig.inverseSine(0);

        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void inverseCosineTest() {
        double expected = 0;
        double actual = trig.inverseCosine(1);

        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void inverseTangentTest() {
        double expected = 0;
        double actual = trig.inverseTangent(1);

        Assert.assertEquals(expected, actual, 0.1);
    }
}
