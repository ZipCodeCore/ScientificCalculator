package crawley.james.Project1Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class Project1CalculatorTest {

    MathFunctions mathFunc = new MathFunctions();
    CalculatorMemory settings = new CalculatorMemory(0, 2);

    //Math function tests

    @Test
    public void addTest () {

        Assert.assertEquals("The value should be 10.", 10, mathFunc.add(6, 4), 0);
    }

    @Test
    public void subtractTest () {

        Assert.assertEquals("The value should be 2.", 2, mathFunc.subtract(6, 4), 0);

    }

    @Test
    public void multiplyTest () {

        Assert.assertEquals("The value should be 24.", 24, mathFunc.multiply(6, 4), 0);
    }

    @Test
    public void divideTest () {

        Assert.assertEquals("The value should be 2.", 2, mathFunc.divide(6, 3), 0);

    }

    @Test
    public void squareTest () {

        Assert.assertEquals("The value should be 16.", 16, mathFunc.square(4), 0);
    }

    @Test
    public void squareRootTest () {

        Assert.assertEquals("The value should be 6.", 6, mathFunc.squareRoot(36), 0);

    }

    @Test
    public void cubeTest () {

        Assert.assertEquals("The value should be 64.", 64, mathFunc.square(4), 0);
    }

    @Test
    public void vubeRootTest () {

        Assert.assertEquals("The value should be 2.", 2, mathFunc.cubeRoot(8), 0);

    }

    @Test
    public void exponentTest () {

        Assert.assertEquals("The value should be 8.", 8, mathFunc.exponent(2, 3), 0);

    }

    @Test
    public void inverseTest () {

        Assert.assertEquals("The value should be 1/5.", 0.2, mathFunc.inverse(5), 0);

    }
    @Test
    public void switchSignTest () {

        Assert.assertEquals("The value should be -10.", -10, mathFunc.switchSign(10), 0);

    }

    @Test
    public void sineTest () {

        Assert.assertEquals("The value should be 0.5.", 0.5, mathFunc.sine(Math.toRadians(30)), 0.5);

    }
    @Test
    public void cosineTest () {

        Assert.assertEquals("The value should be 0.5.", 0.5, mathFunc.cosine(Math.toRadians(60)), 0.5);
    }
    @Test
    public void tangentTest () {

        Assert.assertEquals("The value should be 1.", 1, mathFunc.tangent(Math.toRadians(45)), 0.5);

    }

    @Test
    public void inverseSineTest () {

        Assert.assertEquals("The value should be π / 6.", Math.PI/6, mathFunc.inverseSine(0.5), 0.5);

    }
    @Test
    public void inverseCosineTest () {

        Assert.assertEquals("The value should be π / 3.", Math.PI/3, mathFunc.inverseCosine(0.5), 0.5);

    }
    @Test
    public void inverseTangentTest () {

        Assert.assertEquals("The value should be π / 4.", Math.PI/4, mathFunc.inverseTangent(1), 0.5);

    }

    @Test
    public void factorialTest () {

        Assert.assertEquals("The value should be 6.", 6, mathFunc.factorial(3), 0);

    }

    @Test
    public void logarithmTest () {

        Assert.assertEquals("The value should be 1.", 1, mathFunc.logarithm(10), 0);

    }
    @Test
    public void naturalLogarithmTest () {

        Assert.assertEquals("The value should be 1.", 1, mathFunc.naturalLogarithm(Math.E), 0);
    }

    @Test
    public void inverseLogarithmTest () {

        Assert.assertEquals("The value should be 10.", 10, mathFunc.inverseLogarithm(1), 0);

    }
    @Test
    public void inverseNaturalLogarithmTest () {

        Assert.assertEquals("The value should be e (2.71828).", Math.E, mathFunc.inverseNaturalLogarithm(1), 0);

    }

    //Settings tests

    @Test
    public void setStateTest () {

        settings.setState(10);
        Assert.assertEquals("The values should be 10.", 10, settings.getState(), 0);

    }

    @Test
    public void setTrigUnitsEmptyTest () {

        settings.setTrigUnits();
        Assert.assertEquals("The values should be RADIANS.", TrigUnits.RADIANS, settings.getTrigUnits());

    }

    @Test
    public void setTrigUnitsExactTest () {

        settings.setTrigUnits(TrigUnits.DEGREES);
        Assert.assertEquals("The values should be RADIANS.", TrigUnits.DEGREES, settings.getTrigUnits());

    }

    @Test
    public void setCountingBaseEmptyTest () {

        settings.setCountingBase();
        Assert.assertEquals("The values should be 10.", CountingBase.HEXADECIMAL, settings.getCountingBase());

    }

    @Test
    public void setCountingBaseExactTest () {

        settings.setCountingBase(CountingBase.BINARY);
        Assert.assertEquals("The values should be 10.", CountingBase.BINARY, settings.getCountingBase());

    }

    @Test
    public void setMemoryTest () {

        settings.setMemory(15);
        Assert.assertEquals("The values should be 10.", 15, settings.getMemory(), 0);

    }


}
