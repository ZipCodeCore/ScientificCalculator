package com.zipcodewilmington.scientificcalculator.Calculator;

import com.zipcodewilmington.scientificcalculator.Utilities.Util;

public class Calculator 
{
	private float displayValue;
	private float storedValue;
	private boolean allowNegative;
	private boolean isError;
	private boolean displayingStoredVal;
	private DisplayMode numMode;
	private TrigDisplayMode trigMode;
	private String display;
	
	public enum DisplayMode {
		BINARY,
		OCTAL,
		DECIMAL,
		HEXADECIMAL
	}
	
	public enum TrigDisplayMode {
		DEGREES,
		RADIANS
	}
	
	public Calculator() {
		this(0, 0, true, DisplayMode.DECIMAL, TrigDisplayMode.DEGREES);
	}
	
	public Calculator(int displayVal, int storedVal, boolean allowNegatives, DisplayMode numMode, TrigDisplayMode trigMode) {
		this.displayValue = displayVal;
		this.storedValue = storedVal;
		this.allowNegative = allowNegatives;
		this.isError = false;
		this.displayingStoredVal = false;
		this.display = "";
		this.trigMode = trigMode;
		this.numMode = numMode;
		updateDisplay();
	}

	@SuppressWarnings("incomplete-switch")
	public void updateDisplay() {
		if (this.isError) {
			this.display = "Err";
			return;
		}
		
		float numToDisplay;
		if (this.displayingStoredVal) {
			numToDisplay = this.storedValue;
		}
		else {
			numToDisplay = this.displayValue;
		}
		
		switch (this.numMode) {
			case BINARY:
				this.display = "" + Integer.toBinaryString((int)numToDisplay);
				return;
			case HEXADECIMAL:
				this.display = "" + Float.toHexString(numToDisplay);
				return;
			case OCTAL:
				this.display = "" + Integer.toOctalString((int)numToDisplay);
				return;
		}
		
		if (!this.allowNegative && numToDisplay < 0) {
			numToDisplay = 0;
		}
		
		this.display = "" + numToDisplay;
	}
	
	
	public void clearDisplay() {
		this.displayValue = 0;
		this.isError = false;
		this.allowNegative = true;
		updateDisplay();
	}
	
	public void clearMemory() {
		this.storedValue = 0;
	}

	
	// MATH ////////////////////////////////////////////////////////////////////////////////////////////////
	public void add(float val) {
		this.displayValue += val;
		updateDisplay();
	}
	
	public void subtract(float val) {
		this.displayValue -= val;
		updateDisplay();
	}
	
	public void mult(float val) {
		this.displayValue *= val;
		updateDisplay();
	}
	
	public void div(float num) {
		this.displayValue /= num;
		updateDisplay();
	}
	
	public void sqRt() {
		this.displayValue = Util.squareRoot(this.displayValue);
		updateDisplay();
	}
	
	public void square() {
		this.displayValue = Util.square(this.displayValue);
		updateDisplay();
	}

	public void pow(float exponent) {
		this.displayValue = (float) Math.pow(this.displayValue, exponent);
		updateDisplay();
	}
	
	public void inverse() {
		this.displayValue = 1.0f / this.displayValue;
		updateDisplay();
	}
	
	public void flipSign() {
		this.displayValue = -this.displayValue;
		updateDisplay();
	}
	
	public void sine() {
		this.displayValue = Util.sine(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}
	}
	
	public void cosine() {
		this.displayValue = Util.cosine(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}
	}
	
	public void tangent() {
		this.displayValue = Util.tangent(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}
	}
	
	public void invSine() {
		this.displayValue = Util.invSine(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}
	}
	
	public void invCosine() {
		this.displayValue = Util.invCosine(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}
	}
	
	public void invTangent() {
		this.displayValue = Util.invTangent(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}
	}
	// END MATH ///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// GETTERS ////////////////////////////////////////////////////////////////////////////////////////////////
	public String getDisplay() {
		return display;
	}
	
	public float getDisplayVal() {
		if (this.displayValue > 0.0f || this.allowNegative) {
			return this.displayValue;
		}
		else {
			return 0.0f;
		}
	}
	
	public float getStoredVal() {
		return this.storedValue;
	}
	
	public boolean isInErrorMode() {
		return this.isError;
	}
	
	public boolean allowingNegative() {
		return this.allowNegative;
	}
	
	public DisplayMode getNumMode() {
		return this.numMode;
	}
	
	public String getNumModeStr() {
		switch (this.numMode) {
			case BINARY:
				return "Binary";
			case DECIMAL:
				return "Decimal";
			case HEXADECIMAL:
				return "Hexadecimal";
			case OCTAL:
				return "Octal";
			default:
				return "Uh.OH.";
		}
	}
	
	public TrigDisplayMode getTrigMode() {
		return this.trigMode;
	}
	
	public String getTrigModeStr() {
		switch (this.trigMode) {
			case DEGREES:
				return "Degrees";
			case RADIANS:
				return "Radians";
			default:
				return "Uh.OH.";		
		}
	}
	// END GETTERS ///////////////////////////////////////////////////////////////////////////////////////////
	
	
	// SETTERS ///////////////////////////////////////////////////////////////////////////////////////////////
	public void setDisplayVal(int val) {
		this.displayValue = val;
		updateDisplay();
	}
	
	public void setAllowNegative(boolean allow) {
		this.allowNegative = allow;
		updateDisplay();
	}
	
	public void setDisplay(String newDisp) {
		this.display = newDisp;
		updateDisplay();
	}
	
	public void setError(boolean isError) {
		this.isError = isError;
		updateDisplay();
	}
	
	public void setStoredVal(int newStoredVal) {
		this.storedValue = newStoredVal;
	}
	
	public void incStoredVal(int incrementAmt) {
		this.storedValue += incrementAmt;
	}
	
	public void setDisplayMode(DisplayMode newMode) {
		this.numMode = newMode;
	}
	
	public void setTrigMode(TrigDisplayMode newMode) {
		this.trigMode = newMode;
	}
	// END SETTERS /////////////////////////////////////////////////////////////////////////////////////////
	
	
}
