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
    public void changeSignTest() {
        Assert.assertEquals(-1, testUI.changeSign(1),0);
        Assert.assertEquals(1,testUI.changeSign(-1),0);
    }

    @Test
    public void changeMemoryTest() {
        Assert.assertEquals(1, testUI.memoryFunction("M+", 1), 1);
    }
}
