import ford.ford.BasicMath;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 4/29/17.
 */
public class TestBasicMath {
    BasicMath bm;

    @Before
    public void setUp() {
        bm = new BasicMath();
    }

    @Test
    public void testAdd() {
        //: Given
        double x = 5.0, y = 2.0;
        double expectedValue = x + y;

        //: When
        double actualValue = bm.add(x, y);

        //: Then
        Assert.assertEquals("The expected result is 7.0 ", expectedValue, actualValue, 0);
    }
}

