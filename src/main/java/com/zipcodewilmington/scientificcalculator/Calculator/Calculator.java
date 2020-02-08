package com.zipcodewilmington.scientificcalculator.Calculator;

import com.zipcodewilmington.scientificcalculator.Utilities.Util;

public class Calculator 
{
	private float trueVal;
	private float storedVal;
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
		this.trueVal = displayVal;
		this.storedVal = storedVal;
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
			numToDisplay = this.storedVal;
		}
		else {
			numToDisplay = this.trueVal;
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
		this.trueVal = 0;
		this.isError = false;
		this.allowNegative = true;
		updateDisplay();
	}
	
	public void clearMemory() {
		this.storedVal = 0;
	}

	
	// MATH ////////////////////////////////////////////////////////////////////////////////////////////////
	public void add(float val) {
		this.trueVal += val;
		updateDisplay();
	}
	
	public void subtract(float val) {
		this.trueVal -= val;
		updateDisplay();
	}
	
	public void mult(float val) {
		this.trueVal *= val;
		updateDisplay();
	}
	
	public void div(float num) {
		this.trueVal /= num;
		updateDisplay();
	}
	
	public void sqRt() {
		this.trueVal = Util.squareRoot(this.trueVal);
		updateDisplay();
	}
	
	public void square() {
		this.trueVal = Util.square(this.trueVal);
		updateDisplay();
	}

	public void pow(float exponent) {
		this.trueVal = (float) Math.pow(this.trueVal, exponent);
		updateDisplay();
	}
	
	public void inverse() {
		this.trueVal = 1.0f / this.trueVal;
		updateDisplay();
	}
	
	public void flipSign() {
		this.trueVal = -this.trueVal;
		updateDisplay();
	}
	
	public void sine() {
		this.trueVal = Util.sine(this.trueVal);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.trueVal = Util.toRadians(this.trueVal);
		}
	}
	
	public void cosine() {
		this.trueVal = Util.cosine(this.trueVal);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.trueVal = Util.toRadians(this.trueVal);
		}
	}
	
	public void tangent() {
		this.trueVal = Util.tangent(this.trueVal);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.trueVal = Util.toRadians(this.trueVal);
		}
	}
	
	public void invSine() {
		this.trueVal = Util.invSine(this.trueVal);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.trueVal = Util.toRadians(this.trueVal);
		}
	}
	
	public void invCosine() {
		this.trueVal = Util.invCosine(this.trueVal);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.trueVal = Util.toRadians(this.trueVal);
		}
	}
	
	public void invTangent() {
		this.trueVal = Util.invTangent(this.trueVal);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.trueVal = Util.toRadians(this.trueVal);
		}
	}
	// END MATH ///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// GETTERS ////////////////////////////////////////////////////////////////////////////////////////////////
	public String getDisplay() {
		return display;
	}
	
	public float getDisplayVal() {
		if (this.trueVal > 0.0f || this.allowNegative) {
			return this.trueVal;
		}
		else {
			return 0.0f;
		}
	}
	
	public float getStoredVal() {
		return this.storedVal;
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
		this.trueVal = val;
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
		this.storedVal = newStoredVal;
	}
	
	public void incStoredVal(int incrementAmt) {
		this.storedVal += incrementAmt;
	}
	
	public void setDisplayMode(DisplayMode newMode) {
		this.numMode = newMode;
	}
	
	public void setTrigMode(TrigDisplayMode newMode) {
		this.trigMode = newMode;
	}
	// END SETTERS /////////////////////////////////////////////////////////////////////////////////////////
	
	
}
