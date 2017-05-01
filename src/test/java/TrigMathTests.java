import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by andrewwong on 4/30/17.
 */
public class TrigMathTests {

    @Test
    public void calculateSin_SimpleInput_ReturnsResult(){
        //Arrange
        double angle = Math.PI;
        double expectedCalculationResult = 0;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateSin(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateSin_NegativeInput_ReturnsResult(){
        //Arrange
        double angle = - Math.PI / 2;
        double expectedCalculationResult = 0;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateSin(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateCos_SimpleInput_ReturnsResult(){
        //Arrange
        double angle = Math.PI;
        double expectedCalculationResult = -1;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateCos(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateCos_NegativeInput_ReturnsResult(){
        //Arrange
        double angle = 0;
        double expectedCalculationResult = 1;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateCos(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateTan_SimpleInput_ReturnsResult(){
        //Arrange
        double angle = Math.PI / 4;
        double expectedCalculationResult = 1;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateTan(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateTan_NegativeInput_ReturnsResult(){
        //Arrange
        double angle = - Math.PI / 4;;
        double expectedCalculationResult = - 1;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateTan(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .1D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateInvSin_SimpleInput_ReturnsResult(){
        //Arrange
        double angle = Math.PI / 6;
        double expectedCalculationResult = 2;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateInvSin(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .01D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateInvCos_SimpleInput_ReturnsResult(){
        //Arrange
        double angle = Math.PI / 3;
        double expectedCalculationResult = 2;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateInvCos(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .01D);
        assertFalse(actualCalculationResult.hasError());
    }

    @Test
    public void calculateInvTan_SimpleInput_ReturnsResult(){
        //Arrange
        double angle = Math.PI / 4;
        double expectedCalculationResult = 1;

        //Act
        CalculationResult actualCalculationResult = TrigMath.calculateInvTan(angle);

        //Assert
        assertEquals(expectedCalculationResult, actualCalculationResult.getValue(), .01D);
        assertFalse(actualCalculationResult.hasError());
    }




}
