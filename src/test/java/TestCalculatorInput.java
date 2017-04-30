import ford.ford.CalculatorInput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 4/29/17.
 */
public class TestCalculatorInput {


        CalculatorInput ci;

        @Before
        public void setUp() {
            ci = new CalculatorInput();
        }

//        @Test
//        public void testUserInput(){
//
//            //: Given
//            double x = 10.0;
//            double expectedInput = 10.0;
//            //: When
//            double actualInput = ci.userInput();
//            //: Then
//            Assert.assertEquals("the expected input value is 10.0", expectedInput, actualInput,0);
//        }

        @Test
        public void testUserOperator() {
            //: Given
            String userOperator = "";
            String expectedOperator = "+";
            //: When
            String actualOperator = ci.acceptUserOperator();
            //: Then
            Assert.assertEquals("The expected user input is \"+\" ", actualOperator,expectedOperator);
        }
        @Test
        public void testUserInputValidator(){
            //: Given
            String userInput = "+";
            double expectedInput = 43.0;

            //: When
            double actualInput = ci.userInputValidator(userInput);
            //: Then
            Assert.assertEquals("The expected result is the number '+' ", expectedInput,actualInput,0);
        }

    }
