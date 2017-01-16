package gross_ryan;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/15/17.
 */
public class TrigTest {

    Trig testTrig;

    @Before
    public void setUp() {
        testTrig = new Trig();
    }

    @Test
    public void sinTest() {
        testTrig.trigMode = "RADIANS";
        Assert.assertEquals(-0.95, testTrig.displaySin(5), 0.01);
        testTrig.trigMode = "DEGREES";
        Assert.assertEquals(0.087, testTrig.displaySin(5), 0.01);
    }

    @Test
    public void cosTest() {
        testTrig.trigMode = "RADIANS";
        Assert.assertEquals(0.28, testTrig.displayCos(5), 0.01);
        testTrig.trigMode = "DEGREES";
        Assert.assertEquals(0.99, testTrig.displayCos(5), 0.01);
    }

    @Test
    public void tanTest() {
        testTrig.trigMode = "RADIANS";
        Assert.assertEquals(-3.3805, testTrig.displayTan(5), 0.01);
        testTrig.trigMode = "DEGREES";
        Assert.assertEquals(0.087, testTrig.displayTan(5), 0.01);
    }

    @Test
    public void inverseSinTest() {
        testTrig.trigMode = "RADIANS";
        Assert.assertEquals(-1.042, testTrig.inverseSin(5), 0.01);
        testTrig.trigMode = "DEGREES";
        Assert.assertEquals(11.47, testTrig.inverseSin(5),0.01);
    }

    @Test
    public void inverseCosTest() {
        testTrig.trigMode = "RADIANS";
        Assert.assertEquals(3.525, testTrig.inverseCos(5), 0.01);
        testTrig.trigMode = "DEGREES";
        Assert.assertEquals(1.008, testTrig.inverseCos(5), 0.01);
    }

    @Test
    public void inverseTanTest() {
        testTrig.trigMode = "RADIANS";
        Assert.assertEquals(-0.295, testTrig.inverseTan(5), 0.01);
        testTrig.trigMode = "DEGREES";
        Assert.assertEquals(11.43, testTrig.inverseTan(5), 0.01);
    }

    @Test
    public void factorialTest() {
        Assert.assertEquals(24, testTrig.factorial(4), 0);
    }

}
