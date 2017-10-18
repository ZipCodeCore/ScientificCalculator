import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denniskalaygian on 4/30/17.
 */
public class testScientificCalculator extends testCoreCalculator {

    @Test
    public void testGetMemoryValueReturnType() {
        //Given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //When
        double methodReturnValue = scientificCalculator.getMemoryValue();
        //Then
        Assert.assertFalse("Memory value must be a number", Double.isNaN(methodReturnValue));
    }

    @Test
    public void testGetMemoryValue() {
        //Given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        double expectedAnswer = 5.00;
        //When
        double returnValue = scientificCalculator.getMemoryValue();
        //Then
        Assert.assertTrue("getValue() method is returning the wrong number", expectedAnswer == returnValue);
    }

    @Test
    public void testSetMemoryValueReturnType() {
        //Given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //When
        scientificCalculator.setMemoryValue();
        //Then
        Assert.assertFalse("Memory value must be a number", Double.isNaN(scientificCalculator.getMemoryValue()));
    }

    @Test
    public void testSetMemoryValue() {
        //Given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        double expectedAnswer = 5.00;
        //When
        scientificCalculator.setMemoryValue();
        //Then
        Assert.assertTrue("setMemoryValue() method is returning the wrong number", expectedAnswer == scientificCalculator.getMemoryValue());
    }

    @Test
    public void testDisplayMemoryValue() {
        //Given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        double expectedAnswer = 5.00;
        //When
        double returnValue = scientificCalculator.getMemoryValue();
        //Then
        Assert.assertTrue("displayMemoryValue() method is displaying the wrong number", expectedAnswer == returnValue);
    }

    @Test
    public void testClearMemoryValueReturnType() {
        //Given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //When
        scientificCalculator.clearMemoryValue();
        //Then
        Assert.assertFalse("Clearing the memory value must return a number", Double.isNaN(scientificCalculator.getMemoryValue()));
    }

    @Test
    public void testClearMemoryValue() {
        //Given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        double expectedAnswer = 0.00;
        //When
        scientificCalculator.clearMemoryValue();
        //Then
        Assert.assertTrue("clearMemoryValue() method is returning the wrong number", expectedAnswer == scientificCalculator.getMemoryValue());
    }


}
