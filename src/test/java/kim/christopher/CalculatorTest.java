package kim.christopher;

import junit.framework.Test;
import static junit.framework.Assert.*;
/**
 * Created by christopherkim on 4/28/17.
 */
public class CalculatorTest {

    @Test
    public void testAddition(){
        //: Given
        double firstOperand = 2, secondOperand = 2; // ... two positive values to add
        double expectedSum = firstOperand + secondOperand; // 2 + 2 = 4
        Controller controller = new Controller();


        //: When
        int actualSum = controller.calculator.add(firstOperand, secondOperand);


        //: Then
        // ... The result should be the sum of those two values
        assertEquals("2 + 2 should equal 4", expectedSum, actualSum);

    }
}
