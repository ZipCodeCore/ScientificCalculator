package gross_ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/16/17.
 */
public class CustomTest {

    Custom customTest;

    @Before
    public void setUp() {
        customTest = new Custom();
    }

    @Test
    public void customSumTest() {
        Assert.assertEquals(6, customTest.customSum(3), 0);
        Assert.assertEquals(55, customTest.customSum(10),0);
    }

    @Test
    public void oddOrEvenTest() {
        Assert.assertEquals(1, customTest.oddOrEven(4),0);
    }

}
