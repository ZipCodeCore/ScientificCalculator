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

	@Test
	public void TestTrigModes() {
		Calculator calc = new Calculator();
		calc.add(180);
		calc.setTrigMode(TrigDisplayMode.RADIANS);
		assertEquals("3.141592653589793", calc.getDisplay());
		calc.setDisplayVal(27);
		calc.setTrigMode(TrigDisplayMode.RADIANS);
		assertEquals("0.47123889803846897", calc.getDisplay());		
		calc.setTrigMode(TrigDisplayMode.DEGREES);
		assertEquals(27.0, calc.getDisplayVal(), 0.001);	
	}

	@Test
	public void TestSqrt() {
		Calculator calc = new Calculator();
		calc.add(9);
		calc.sqRt();
		assertEquals(3, (int)calc.getDisplayVal());
	}

	@Test
	public void TestSquare() {
		Calculator calc = new Calculator();
		calc.add(9);
		calc.square();
		assertEquals(81, (int)calc.getDisplayVal());
	}

	@Test
	public void TestPow() {
		Calculator calc = new Calculator();
		calc.add(3);
		calc.pow(3);
		assertEquals(27, (int)calc.getDisplayVal());
	}

	@Test
	public void TestFlipSign() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.flipSign();
		assertEquals(-5, (int)calc.getDisplayVal());
	}
	
	@Test
	public void TestFactorial() {
		Calculator calc = new Calculator();
		calc.setDisplayVal(1);
		calc.factorial();
		assertEquals(1, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(2);
		calc.factorial();
		assertEquals(2, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(3);
		calc.factorial();
		assertEquals(6, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(4);
		calc.factorial();
		assertEquals(24, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(5);
		calc.factorial();
		assertEquals(120, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(6);
		calc.factorial();
		assertEquals(720, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(7);
		calc.factorial();
		assertEquals(5040, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(8);
		calc.factorial();
		assertEquals(40320, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(9);
		calc.factorial();
		assertEquals(362880, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(10);
		calc.factorial();
		assertEquals(3628800, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(11);
		calc.factorial();
		assertEquals(39916800, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(12);
		calc.factorial();
		assertEquals(479001600, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(13);
		calc.factorial();
		assertEquals((int)Float.MAX_VALUE, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(14);
		calc.factorial();
		assertEquals((int)Float.MAX_VALUE, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(15);
		calc.factorial();
		assertEquals((int)Float.MAX_VALUE, (int)calc.getDisplayVal());
		
		calc.setDisplayVal(9999);
		calc.factorial();
		assertEquals((int)Float.MAX_VALUE, (int)calc.getDisplayVal());
	}
	
	@Test
	public void TestSine() {
		Calculator calc = new Calculator();
		calc.add(10.0f);
		calc.sin();
		assertEquals(-0.544021, calc.getDisplayVal(), 0.001);
	}
	
	
	@Test
	public void TestCosine() {
		Calculator calc = new Calculator();
		calc.add(10.0f);
		calc.cosine();
		assertEquals(-0.839072, calc.getDisplayVal(), 0.001);
	}
	
	@Test
	public void TestTangent() {
		Calculator calc = new Calculator();
		calc.add(10.0f);
		calc.tangent();
		assertEquals(0.648361, calc.getDisplayVal(), 0.001);
	}

	@Test
	public void TestInvSin() {
		Calculator calc = new Calculator();
		calc.add(0.33f);
		calc.invSin();
		assertEquals(0.336304, calc.getDisplayVal(), 0.001);
	}
	
	@Test
	public void TestInvCosine() {
		Calculator calc = new Calculator();
		calc.add(0.33f);
		calc.invCosine();
		assertEquals(1.234493, calc.getDisplayVal(), 0.001);
	}
	
	@Test
	public void TestInvTan() {
		Calculator calc = new Calculator();
		calc.add(0.33f);
		calc.invTangent();
		assertEquals(0.318748, calc.getDisplayVal(), 0.001);
	}
	
	@Test
	public void TestLog() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.log();
		assertEquals(2.302585092994045684, calc.getDisplayVal(), 0.001);
	}
	
	@Test
	public void TestInvNatLog() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.invNatLog();
		assertEquals(22026.465, calc.getDisplayVal(), 0.001);
		
		calc.setDisplayVal(7);
		calc.invNatLog();
		assertEquals(1096.633, calc.getDisplayVal(), 0.001);
	}
	
	@Test
	public void TestBinaryMode() {
		Calculator calc = new Calculator();
		calc.add(4);
		calc.setDisplayMode(DisplayMode.BINARY);
		assertEquals("100", calc.getDisplay());		
		calc.setDisplayMode(DisplayMode.DECIMAL);
		assertEquals("4.0", calc.getDisplay());		
	}
	
	@Test
	public void TestOctalMode() {
		Calculator calc = new Calculator();
		calc.add(12);
		calc.setDisplayMode(DisplayMode.OCTAL);
		assertEquals("14", calc.getDisplay());		
		calc.setDisplayMode(DisplayMode.DECIMAL);
		assertEquals("12.0", calc.getDisplay());	
	}
	
	@Test
	public void TestHexMode() {
		Calculator calc = new Calculator();
		calc.add(22);
		calc.setDisplayMode(DisplayMode.HEXADECIMAL);
		assertEquals(Integer.toHexString(22), calc.getDisplay());		
		calc.setDisplayMode(DisplayMode.DECIMAL);
		assertEquals("22.0", calc.getDisplay());	
	}

}
