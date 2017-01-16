package gross_ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/15/17.
 */
public class ExponentialTest {

    Exponential testExponential;

    @Before
    public void setUp() {
        testExponential = new Exponential();
    }

   @Test
    public void squareNumberTest() {
       Assert.assertEquals(4.0, testExponential.squareNumber(2), 0);
   }

   @Test
   public void inverseTest() {
       Assert.assertEquals(0.2, testExponential.inverseOfNumber(5),0);
   }

   @Test
    public void squareRootTest() {
       Assert.assertEquals(10.0, testExponential.squaredRoot(100),0);
   }

}
