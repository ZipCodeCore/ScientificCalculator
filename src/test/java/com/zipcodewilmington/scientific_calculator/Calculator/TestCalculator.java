package com.zipcodewilmington.scientific_calculator.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.zipcodewilmington.scientificcalculator.Calculator.Calculator;
import com.zipcodewilmington.scientificcalculator.Calculator.Calculator.*;

public class TestCalculator 
{
	@Test
	public void TestCalculatorInit() {
		Calculator calc = new Calculator();
		assertEquals(0, (int)calc.getDisplayVal());
	}
	
	@Test
	public void TestClearDisplay() {
		Calculator calc = new Calculator();
		calc.add(10);
		assertEquals(10, (int)calc.getDisplayVal());
		
		calc.clearDisplay();
		assertEquals(0, (int)calc.getDisplayVal());
	}
	
	@Test
	public void TestStoringMemory() {
		Calculator calc = new Calculator();		
		calc.setStoredVal(10);
		assertEquals(10, (int)calc.getStoredVal());		
		calc.clearMemory();
		assertEquals(0, (int)calc.getStoredVal());	
	}
	
	@Test
	public void TestReset() {
		Calculator calc = new Calculator();		
		calc.add(15);
		calc.setStoredVal(10);
		assertEquals(10, (int)calc.getStoredVal());		
		assertEquals(15, (int)calc.getDisplayVal());		
		calc.totalReset();
		assertEquals(0, (int)calc.getDisplayVal());
		assertEquals(0, (int)calc.getStoredVal());
		assertEquals(DisplayMode.DECIMAL, calc.getNumMode());
		assertEquals(TrigDisplayMode.DEGREES, calc.getTrigMode());
	}
	
	@Test
	public void TestAllowNegatives() {
		Calculator calc = new Calculator();		
		calc.toggleAllowNegatives();
		assertEquals(false, calc.allowingNegative());
		calc.add(-100);
		assertEquals("0.0", calc.getDisplay());
		assertEquals(0, (int)calc.getDisplayVal());
		calc.toggleAllowNegatives();
		assertEquals("-100.0", calc.getDisplay());
		assertEquals(-100, (int)calc.getDisplayVal());
	}
	
	

}
