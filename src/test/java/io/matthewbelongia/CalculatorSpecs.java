package io.matthewbelongia;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
//import java.io.InputStream;
//import java.io.SyncFailedException;

import static org.junit.Assert.*;

/**
 * Created by matthewb on 4/30/16.
 */
public class CalculatorSpecs {
    Display display;
    Calculator calculator;
    @Before public void initialize(){
        display = new Display();
        calculator = new Calculator();
    }
    @Test public void changeModeTest(){

        ByteArrayInputStream inDisB = new ByteArrayInputStream("3".getBytes());
        System.setIn(inDisB);
        display.setMode();
        assertEquals("mode should be set to the int the user inputs",3, display.getMode());
    }
    @Test public void incrementModeTest(){

        display.nextMode();
        display.changeMode();
        assertEquals("Expected to be mode 1",1,display.getMode());
        display.nextMode();
        display.changeMode();
        assertEquals("Expected to be mode 2",2,display.getMode());

    }
    @Test public void powerOffTest(){

        //String newLine = System.lineSeparator();
        System.setIn(new ByteArrayInputStream("OFF".getBytes()));
        display.chooseFunction();
        assertFalse("Turn off my Calculator",display.getPower());
    }
    @Test public void unitChangeTest(){

        display.changeUnits();
        assertFalse("Makes Degrees False and Radians Active mode",display.getUnits());
    }
    @Test public void chooseUnitTest(){

        //String newLine = System.lineSeparator();
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        display.chooseUnits();
        assertFalse("Sets Mode to Radians",display.getUnits());
    }

    @Test public void tanFunctionTest(){
        assertEquals("Tan of 45 should be 1",1,calculator.tanFunction(45),0.001);
    }

    @Test public void invTanFunctionTest(){
        assertEquals("Inverse Tan of 1 should be 45",45,calculator.invTanFunction(1),0.001);
    }

    @Test public void sinFunctionTest(){
        assertEquals("Sin of 45 should be sqrt(2)/2",0.7071,calculator.sinFunction(45),0.001);
    }

    @Test public void invSinFunctionTest(){
        assertEquals("Sin of sqrt(2)/2 should be 45 ",45,calculator.invSinFunction(.7071),0.001);
    }

    @Test public void cosFunctionTest(){
        assertEquals("Cos of 45 should be sqrt(2)/2",0.7071,calculator.cosFunction(45),0.001);
    }

    @Test public void invCosFunctionTest(){
        assertEquals("Cos of sqrt(2)/2 should be 45 ",45,calculator.invCosFunction(.7071),0.001);
    }

    @Test public void squareFunctionTest(){
        assertEquals("Square of 5 should be 25",25,calculator.squareFunction(5),0.001);
    }

    @Test public void squareRootFunctionTest(){
        assertEquals("Square root of 25 should be 5",5,calculator.squareRootFunction(25),0.001);
    }

    @Test public void powerOfFunctionTest(){
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        assertEquals("5 to the power of 3 should be 125",125,calculator.powerFunction(5),0.001);
    }

    @Test public void divideFunctionTest(){
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        assertEquals("9 divided by 3 should be 3",3,calculator.divideFunction(9),0.001);
    }

    @Test public void addFunctionTest(){
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        assertEquals("3 added to 3 should be 6",6,calculator.addFunction(3),0.001);
    }

    @Test public void minusFunctionTest(){
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        assertEquals("3 minus 3 should be 0",0,calculator.minusFunction(3),0.001);
    }

    @Test public void multFunctionTest(){
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        assertEquals("3 times 3 should be 9",9,calculator.multFunction(3),0.001);
    }

    @Test public void logFunctionTest(){
        assertEquals("log of 100 should be 2",2,calculator.logFunction(100),0.001);
    }

    @Test public void invLogFunctionTest(){
        assertEquals("inverse log of 2 should be 100",100,calculator.invLogFunction(2),0.001);
    }

    @Test public void natLogFunctionTest(){
        assertEquals("nat log of e should be 1",1,calculator.natLogFunction(Math.E),0.001);
    }

    @Test public void factFunctionTest(){
        assertEquals("factorial of 4 should be 24",24,calculator.factFunction(4),0.001);
    }

    @Test public void StringtoDoubleFunctionTest(){
        System.setIn(new ByteArrayInputStream("3.33".getBytes()));
        assertEquals("Convert input to double",3.33,calculator.stringToDoubleCalc(),0.001);
    }

}

