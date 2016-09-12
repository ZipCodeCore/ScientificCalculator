package kamsheh.adam.project1calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by adam on 9/11/16.
 */
public class CalculatorTest {


    Calculator calc;
    @Before
    public void initialize() {
        calc = new Calculator(10);
    }

    @Test
    public void CalculatorTest() {
        double exptectedValue = 10.0;
        double actualValue = calc.getState();

        Assert.assertEquals("Check constructor.", exptectedValue, actualValue, 0);
    }

    @Test
    public void getStateTest() {
        calc.changeState(10);
        double expectedValue = 10;
        double actualValue = calc.getState();

        Assert.assertEquals("Check getState is correct.", expectedValue, actualValue, .00001);
    }

    @Test
    public void changeStateTest() {
        //already completed with "getStateTest"
    }

    @Test
    public void clearDisplayTest() {
        calc.clearDisplay();
        double expectedValue = 0.0;
        double actualValue = calc.getState();

        Assert.assertEquals("clearDisplay shoudl set state to 0.0", expectedValue, actualValue, .00001);
    }

    @Test
    public void addToMemoryTest() {
        calc.addToMemory();
        double expectedValue = 10.0;
        double actualValue = calc.getMemory();

        Assert.assertEquals("Check that state copies to memory.", expectedValue, actualValue, 0);
    }

    @Test
    public void clearMemoryTest() {
        calc.addToMemory();
        calc.clearMemory();
        double expectedValue = 0.0;
        double actualValue = calc.getMemory();

        Assert.assertEquals("Check that memory clears to 0.0.", expectedValue, actualValue, 0);
    }

    @Test
    public void getMemoryTest() {
        //already tested above.
    }

    @Test
    public void setStateToMemory() {
        calc.changeState(55);
        calc.addToMemory();
        calc.changeState(1000);
        calc.setStateToMemory();
        double expectedValue = 55;
        double actualValue = calc.getMemory();

        Assert.assertEquals("Check that state is set to memory.", expectedValue, actualValue, 0);
    }


 /*   @Test
    public void addTest() {
        double expectedValue = 20.0;
        double actualValue = calc.add(10);

        Assert.assertEquals("Make sure add() will add the state plus the argument", expectedValue, actualValue, .00001);
    }*/

/*    @Test
    public void subtractTest() {
        double expectedValue = 0.0;
        double actualValue = calc.subtract(10);

        Assert.assertEquals("Does subtract() work properly?", expectedValue, actualValue, .000001);
    }*/

/*    @Test
    public void multiplyTest() {
        double expectedValue = 20.0;
        double actualValue = calc.multiply(2.0);

        Assert.assertEquals("Does subtract() work properly?", expectedValue, actualValue, .000001);
    }*/

/*    @Test
    public void divideTest() {
        double expectedValue = 5.0;
        double actualValue = calc.divide(2.0);

        Assert.assertEquals("Does subtract() work properly?", expectedValue, actualValue, .000001);
    }*/

/*    @Test
    public void squareTest() {
        double expectedValue = 100.0;
        double actualValue = calc.square();

        Assert.assertEquals("Does subtract() work properly?", expectedValue, actualValue, .000001);
    }*/

/*    @Test
    public void squareRootTest() {
        calc.changeState(100.0);
        double expectedValue = 10.0;
        double actualValue = calc.squareRoot();

        Assert.assertEquals("Does subtract() work properly?", expectedValue, actualValue, .000001);
    }*/

/*    @Test
    public void toThePowerTest() {
        double expectedValue = 1000.0;
        double actualValue = calc.toThePower(3.0);

        Assert.assertEquals("Test to make sure it raises the state to the value.", expectedValue, actualValue, .000001);
    }*/

/*    @Test
    public void inverseTest() {
        double expectedValue = 0.1;
        double actualValue = calc.inverse();

        Assert.assertEquals("Test to make sure it raises the state to the value.", expectedValue, actualValue, .000001);
    }*/

/*    @Test
    public void cubedRootTest() {
        calc.changeState(8);
        double expectedValue = 2;
        double actualValue = calc.cubedRoot();

        Assert.assertEquals("Test should return cubed root.", expectedValue, actualValue, 0);
    }*/

/*    @Test
    public void cubedTest() {
        calc.changeState(2);
        double expectedValue = 8;
        double actualValue = calc.cubed();

        Assert.assertEquals("Check cube function.", expectedValue, actualValue, 0);
    }*/

/*    @Test
    public void changeSignTest() {
        double expectedValue = -10.0;
        double actualValue = calc.changeSign();

        Assert.assertEquals("Does the state change sign?", expectedValue, actualValue, .00001);
    }*/

    @Test
    public void mainMenuTest() {
        //Need to finish this
    }

    @Test
    public void switchTrigUnitsTest() {
        calc.switchTrigUnits();
        String expectedValue = "radian";
        String actualValue = calc.getTrigUnits();

        Assert.assertEquals("Check switch trig function.", expectedValue, actualValue);
    }

    @Test
    public void switchTrigUnitsTest2() {
        calc.switchTrigUnits();
        String expectedValue2 = "degree";
        calc.switchTrigUnits("degree");
        String actualValue2 = calc.getTrigUnits();

        Assert.assertEquals("Check switch trig function.", expectedValue2, actualValue2);
    }

    @Test
    public void convertTrigUnitsTest() {
        calc.changeState(Math.PI);
        double expectedValue = 180;
        double actualValue = calc.convertTrigUnits();

        Assert.assertEquals("Make sure Trig value can be converted.", expectedValue, actualValue, .01);
    }

    @Test
    public void sineTest() {
        calc.changeState(90);
        double expectedValue = 1;
        double actualValue = calc.sine();

        Assert.assertEquals("Trig function sin.", expectedValue, actualValue, 1);
    }

    @Test
    public void cosineTest() {
        calc.changeState(90);
        double expectedValue = 0;
        double actualValue = calc.cosine();

        Assert.assertEquals("Trig function cosin", expectedValue, actualValue, 1);
    }

    @Test
    public void tangent() {
        calc.changeState(180);
        double expectedValue = 0;
        double actualValue = calc.tangent();

        Assert.assertEquals("Trig function tangent", expectedValue, actualValue, 2);
    }

    @Test
    public void inverseSineTest() {
        calc.changeState(1);
        double expectedValue = Math.PI / 2;
        double actualValue = calc.tangent();

        Assert.assertEquals("Trig function tangent", expectedValue, actualValue, .1);
    }

    @Test
    public void inverseCosineTest() {
        calc.changeState(Math.toRadians(1));
        double expectedValue = 0;
        double actualValue = calc.tangent();

        Assert.assertEquals("Trig function tangent", expectedValue, actualValue, .1);
    }

    @Test
    public void inverseTangentTest() {
        calc.changeState(Math.toRadians(1));
        double expectedValue = Math.PI / 4;
        double actualValue = calc.tangent();

        Assert.assertEquals("Trig function tangent", expectedValue, actualValue, 1);
    }

    @Test
    public void logTest() {
        calc.changeState(1);
        double expectedValue = 0;
        double actualValue = calc.log();

        Assert.assertEquals("Check that log function works.", expectedValue, actualValue, .001);
    }

    @Test
    public void inverseLogTest() {
        calc.changeState(2);
        double expectedValue = 100;
        double actualValue = calc.inverseLog();

        Assert.assertEquals("Check that inverse log works.", expectedValue, actualValue, .001);
    }

    @Test
    public void naturalLogTest() {
        calc.changeState(1);
        double expectedValue = 0;
        double actualValue = calc.naturalLog();

        Assert.assertEquals("Check that inverse log works.", expectedValue, actualValue, 1);
    }

    @Test
    public void inverseNaturalLog() {
        calc.changeState(1);
        double expectedValue = 2.718281828;
        double actualValue = calc.inverseNaturalLog();

        Assert.assertEquals("Inverse natural log of number is just the number.", expectedValue, actualValue, .001);
    }

    @Test
    public void factorialTest() {
        double expectedValue = 3628800;
        double actualValue = calc.factorial();

        Assert.assertEquals("Does factorial work? Hope so.", expectedValue, actualValue, 0);
    }
}

