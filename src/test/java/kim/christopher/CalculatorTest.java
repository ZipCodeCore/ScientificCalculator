package kim.christopher;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by christopherkim on 4/28/17.
 */
public class CalculatorTest {

    @Test
    public void testAddition(){
        //: Given
        double firstOperand = 2.0, secondOperand = 2.0; // ... two positive values to add
        double expectedSum = 4.0;
        Controller controller = new Controller();


        //: When
        double actualSum = controller.calculator.add(firstOperand, secondOperand);


        //: Then
        // ... The result should be the sum of those two values
        assertEquals("2 + 2 should equal 4", expectedSum, actualSum, 0);

    }


}
