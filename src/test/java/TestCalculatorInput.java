import ford.ford.CalculatorInput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 4/29/17.
 */
public class TestCalculatorInput {

    public class TestBasicMath {
        CalculatorInput ci;

        @Before
        public void setUp() {
            ci = new CalculatorInput();
        }

        @Test
        public void testUserInput(){

            //: Given
            double userInput = 10.0;
            double expectedInput = 10.0;
            //: When
            double actualInput = userInput;
            //: Then
            Assert.assertEquals("the expected input value is 10.0", expectedInput, actualInput,0);
        }

        @Test
        public void testUserOperator() {
            //: Given
            char userOperator = + ;
        }
    }
}