package gross_ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/15/17.
 */
public class UITest {
    UserInterface testUI;

    @Before
    public void setUp() {
        testUI = new UserInterface();
        testUI.anArithmetic = new Arithmetic();
        testUI.anExponential = new Exponential();
        testUI.aMemory = new Memory();
        testUI.aTrig = new Trig();
        testUI.aLog = new Logarithmic();
        testUI.aCustom = new Custom();
    }

    @Test
    public void doArithmeticTest() {
        Assert.assertEquals(2.0, testUI.doArithmetic("+", 1, 1), 0);
        Assert.assertEquals(0.0, testUI.doArithmetic("-", 1, 1), 0);
        Assert.assertEquals(1.0, testUI.doArithmetic("*", 1, 1),0);
        Assert.assertEquals(0.5,testUI.doArithmetic("/",1,2),0);
        Assert.assertEquals(4.0, testUI.doArithmetic("^",2,2), 0);
    }

    @Test
    public void doExponentialTest() {
        Assert.assertEquals(4, testUI.exponentialFunction("^2",2), 0);
        Assert.assertEquals(2, testUI.exponentialFunction("√",4),0);
        Assert.assertEquals(0.2, testUI.exponentialFunction("1/X",5),0);
    }

    @Test
    public void doTrigTest() {
        Assert.assertEquals(-0.95, testUI.trigFunction("sin", 5), 0.01);
        Assert.assertEquals(0.28, testUI.trigFunction("cos", 5), 0.01);
        Assert.assertEquals(-3.38, testUI.trigFunction("tan", 5), 0.01);
        Assert.assertEquals(-1.04, testUI.trigFunction("inverse-sin", 5), 0.01);
        Assert.assertEquals(3.525, testUI.trigFunction("inverse-cos", 5), 0.01);
        Assert.assertEquals(-0.295, testUI.trigFunction("inverse-tan", 5), 0.01);
    }

    @Test
    public void changeSignTest() {
        Assert.assertEquals(-1, testUI.changeSign(1),0);
        Assert.assertEquals(1,testUI.changeSign(-1),0);
    }

    @Test
    public void changeMemoryTest() {
        Assert.assertEquals(1, testUI.memoryFunction("M+", 1), 1);
    }

    @Test
    public void logFunctionTest() {
        Assert.assertEquals(0.69, testUI.logFunction("log", 5), 0.01);
        Assert.assertEquals(1.431, testUI.logFunction("10^x", 5), 0.01);
        Assert.assertEquals(1.609, testUI.logFunction("ln", 5), 0.01);
        Assert.assertEquals(0.621, testUI.logFunction("e^x", 5), 0.01);
    }

    @Test
    public void customTest() {
        Assert.assertEquals(55, testUI.customFunction("sum!", 10), 0);
        Assert.assertEquals(-1, testUI.customFunction("odd/even", 3), 0);
    }
}
