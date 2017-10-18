import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stephenpegram on 4/29/17.
 */
public class TestCalculator {

    @Test
    public void testAddFunctionality (){
        //Given
        double firstNumber = 1, secondNumber = 1; // Two parameters to add
        double expectedSum = firstNumber + secondNumber; // The result will be the sum of the parameters
        Calculator testCalculator = new Calculator();

        //When
        double actualSum = testCalculator.add(firstNumber, secondNumber);

        //Then
        assertEquals("Output should be the sum of the given parameters", expectedSum, actualSum, 0);
    }

}
