package gross_ryan;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ryangross on 1/15/17.
 */
public class ArithmeticTest {

    Arithmetic arithmeticTest = new Arithmetic();

    @Test
    public void addNumbersTest() {
        Assert.assertEquals(4, arithmeticTest.addNumbers("1", 3 ), 0);
    }

    @Test
    public void subtractNumbersTest() {
        Assert.assertEquals(-1, arithmeticTest.subtractNumbers("1", 2), 0);
        Assert.assertEquals(5, arithmeticTest.subtractNumbers("10", 5),0);
    }

    @Test
    public void multiplyNumbersTest() {
        Assert.assertEquals(2, arithmeticTest.multiplyNumbers("1", 2), 0);
    }

    @Test
    public void divideNumbersTest() {
        Assert.assertEquals(1.5, arithmeticTest.divideNumbers("3", 2), 0);
    }

}
