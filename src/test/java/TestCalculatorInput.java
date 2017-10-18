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
        public void testUserInputValidator() {
            //: Given
            String userOperator = "+";
            String expectedUserOperator = "+";

            //: When
            String actualUserOperator = ci.userInputValidator(userOperator);
            //: Then
            Assert.assertEquals("The expected user output should be +", actualUserOperator,expectedUserOperator);
        }


        @Test
        public void testUserValueInputValidator(){
            //: Given
            double userInput = 10.0;
            double expectedInput = userInput;

            //: When
            double actualInput = ci.userValueInputValidator(userInput);
            //: Then
            Assert.assertEquals("The expected result is the number 10.0 ", expectedInput,actualInput,0);
        }

        @Test
        public void TestMathEquationOutput(){
            //: Given
            double x = 10.0;
            double y = 6.0;
            String operator = "+";
            double expectedOutput = 16.0;
            //: When
            double actualOutput = ci.mathEquationOutput(x, y, operator);
            //: Then
            Assert.assertEquals("The expected result of the equation is 16.0", expectedOutput,actualOutput,0);

        }
    }
