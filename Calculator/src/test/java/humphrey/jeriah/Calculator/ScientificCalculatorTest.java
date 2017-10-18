package humphrey.jeriah.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/16/17.
 */
public class ScientificCalculatorTest {

    ScientificCalculator sc;

    @Before
    public void setUp(){
        sc= new ScientificCalculator();
    }

    @Test
    public void displayChangeTest(){
        sc.fullDisplay();
        String expected = "octal";
        String actual = sc.switchDisplayMode();
        assertEquals("I expect the display type to switch from binary to octal", expected, actual);
    }
    @Test
    public void displayChangeChoiceTest(){
        sc.fullDisplay();
        String expected = "hexadecimal";
        String actual = sc.switchDisplayMode("hexadecimal");
        assertEquals("I expect the display type to switch from binary to hexadecimal", expected, actual);
    }
    @Test
    public void memoryValueTest(){
        sc.currentNumber= 6.0;
        double expected = 6.0;
        double actual = sc.storeMemory();
        assertEquals("I expect 6.0 to be stored as the memory value", expected, actual, 0.0);
    }

    @Test
    public void memoryResetTest(){
        sc.currentNumber=5.5;
        sc.storeMemory();
        double expected = 0.0;
        double actual = sc.resetMemory();
        assertEquals("I expect 6.0 to be stored as the memory value", expected, actual, 0.0);
    }
    @Test
    public void memoryRecallTest(){
        sc.currentNumber=5.5;
        sc.storeMemory();
        sc.changeNumber(6);
        double expected = 5.5;
        double actual = sc.recallMemory();
        assertEquals("I expect 5.5 to be displayed", expected, actual, 0.0);
    }

    @Test
    public void trigUnitTest(){
        String expected= "radians";
        String actual = sc.switchUnitsMode();
        assertEquals("I expect the display to read radians", expected, actual);
    }

    @Test
    public void trigUnitTestChoice(){
        String expected= "radians";
        String actual = sc.switchUnitsMode("radians");
        sc.switchUnitsMode("New");
        assertEquals("I expect the display to read radians", expected, actual);
    }

    @Test
    public void sineTest(){
        sc.currentNumber=90;
        sc.switchUnitsMode("degrees");
        double expected = 1.0;
        double actual = sc.sine();
        sc.currentNumber= Math.PI/2;
        sc.switchUnitsMode();
        sc.sine();
        assertEquals("I expect Sine of 90 degrees or pi/2 radians to be 1", expected, actual, 0.0);
    }
    @Test
    public void inversesineTest(){
        sc.currentNumber=1;
        sc.switchUnitsMode("degrees");
        double expected = 90.0;
        double actual = sc.inversesine();
        sc.currentNumber=1;
        sc.switchUnitsMode();
        sc.inversesine();
        assertEquals("I expect the inverse sine of 1 to be 90 degrees or pi/2 radians", expected, actual, 0.0);
    }

        @Test
    public void cosineTest(){
        sc.currentNumber=0;
        sc.switchUnitsMode("degrees");
        double expected = 1.0;
        double actual = sc.cosine();
        sc.currentNumber=0;
        sc.switchUnitsMode();
        sc.cosine();
        assertEquals("I expect cosine of 0 degrees or 0 radians to be 1", expected, actual, 0.000001);
    }

    @Test
    public void inverseCosineTest(){
        sc.currentNumber=1;
        sc.switchUnitsMode("degrees");
        double expected = 0.0;
        double actual = sc.inverseCosine();
        sc.currentNumber=1;
        sc.switchUnitsMode();
        sc.inverseCosine();
        assertEquals("I expect cosine of 1 to be 0 degrees or 0 radians", expected, actual, 0.000001);
    }

    @Test
    public void tangentTest(){
        sc.currentNumber=45;
        sc.switchUnitsMode("degrees");
        double expected = 1.0;
        double actual = sc.tangent();
        sc.currentNumber=Math.PI/4;
        sc.switchUnitsMode();
        sc.tangent();
        assertEquals("I expect tangent of 45 degrees or pi/4 radians to be 1", expected, actual, 0.000001);

    }
    @Test
    public void inverseTangentTest(){
        sc.currentNumber=1;
        sc.switchUnitsMode("degrees");
        double expected = 45.0;
        double actual = sc.inverseTangent();
        sc.currentNumber=1;
        sc.switchUnitsMode();
        sc.inverseTangent();
        assertEquals("I expect inverse tangent of 1 to be 45 degrees or pi/4 radians", expected, actual, 0.000001);
    }
    @Test

    public void logTest(){
        sc.currentNumber= 1000;
        double expected = 3.0;
        double actual = sc.logBase10();
        assertEquals("I expect the log base 10 of 1000 to display 3.0", expected, actual, 0.0);
    }

    @Test
    public void inverseLogTest(){
        sc.currentNumber= 3.0;
        double expected = 1000;
        double actual = sc.inverseLogBase10();
        assertEquals("I expect the inverse log base 10 of 1000 to display 3.0", expected, actual, 0.0);
    }
    @Test

    public void naturallogTest(){
        sc.currentNumber= Math.E;
        double expected = 1.0;
        double actual = sc.natralLog();
        assertEquals("I expect the natural log of 1 to display e", expected, actual, 0.0);
    }

    @Test
    public void natualinverseLogTest(){
        sc.currentNumber= 1.0;
        double expected = Math.E;
        double actual = sc.inverseNaturalLog();
        assertEquals("I expect the inverse natural log of 1 to display e", expected, actual, 0.0);
    }

    @Test
    public void factorialTest(){
        sc.currentNumber= 6.0;
        double expected = 720.0;
        double actual = sc.factorial();
        assertEquals("I expect 6 factorial to display 720", expected, actual, 0.0);
    }


}