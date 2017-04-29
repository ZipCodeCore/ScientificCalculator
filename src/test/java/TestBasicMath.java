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

    @Test
    public void testDivide() {
        //: Given
        double x = 4.0, y = 2.0;
        double expectedValue = 2.0;

        //: When
        double actualValue = bm.divide(x, y);

        //: Then
        Assert.assertEquals("The expected value is 2.0", actualValue, expectedValue, 0);
    }
                     //Come back using try/catch statement in method
//   @Test
//   public void testDivideByZero(){
//      double x = 4.0, y = 0;
//      double expectedValue =4/0;
//    }


    @Test
    public void testSubtract() {
        //: Given
        double x = 7.0, y = 2.0;
        double expectedValue = 5.0;

        //: When
        double actualValue = bm.subtract(x, y);

        //: Then
        Assert.assertEquals("The expected value is 5.0", actualValue, expectedValue, 0);
    }

    @Test
    public void testMultiply() {
        double x = 7.0, y = 2.0;
        double expectedValue = 14.0;

        double actualValue = bm.multiply(x, y);

        Assert.assertEquals("The expected value is 14.0", actualValue, expectedValue, 0);
    }

    @Test
    public void testFindSquare() {

        //: Given
        double x = 3.0;
        double expectedValue = 9.0;
        //: When
        double actualValue = bm.findSquare(x);
        //: Then
        Assert.assertEquals("The expected value of the square is 9.0", expectedValue, actualValue, 0);
    }

    @Test
    public void testFindSquareRoot(){
        //:Given
        double x = 9;
        double expectedValue = 3.0;
        //: When
        double actualValue = bm.findSquareRoot(x);
        //: Then
        Assert.assertEquals("The expected value of the square root is 3.0", expectedValue,actualValue,0);
    }

}

