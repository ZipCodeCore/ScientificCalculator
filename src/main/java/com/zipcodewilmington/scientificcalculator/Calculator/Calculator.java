package com.zipcodewilmington.scientificcalculator.Calculator;

import com.zipcodewilmington.scientificcalculator.Utilities.Util;

public class Calculator 
{
	private float displayValue;
	private float storedValue;
	private boolean allowNegative;
	private boolean isError;
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
	
	public Calculator(int displayVal) {
		this(displayVal, 0, true, DisplayMode.DECIMAL, TrigDisplayMode.DEGREES);
	}
	
	public Calculator(int displayVal, int storedVal, boolean allowNegatives, DisplayMode numMode, TrigDisplayMode trigMode) {
		this.displayValue = displayVal;
		this.storedValue = storedVal;
		this.allowNegative = allowNegatives;
		this.isError = false;
		this.display = "";
		this.trigMode = trigMode;
		this.numMode = numMode;		
	}

	@SuppressWarnings("incomplete-switch")
	public void updateDisplay() {
		if (this.isError) {
			this.display = "Err";
			return;
		}
		
		float numToDisplay = this.displayValue;
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
		
		if (!this.allowNegative && numToDisplay < 0.0f) {
			numToDisplay = 0.0f;
		}
		
		this.display = "" + (float)numToDisplay;
	}
	
	
	public void clearDisplay() {
		this.displayValue = 0;
		this.isError = false;
		this.allowNegative = true;		
	}
	
	public void clearMemory() {
		this.storedValue = 0;	
	}
	
	public void totalReset() {
		this.displayValue = 0;
		this.storedValue = 0;
		this.allowNegative = true;
		this.isError = false;
		this.numMode = DisplayMode.DECIMAL;
		this.trigMode = TrigDisplayMode.DEGREES;
	}

	
	// MATH ////////////////////////////////////////////////////////////////////////////////////////////////
	public void add(float val) {
		this.displayValue += val;		
	}
	
	public void subtract(float val) {
		this.displayValue -= val;		
	}
	
	public void mult(float val) {
		this.displayValue *= val;		
	}
	
	public void div(float num) {
		if (num == 0) {
			this.isError = true;
			updateDisplay();
			return;
		}
		this.displayValue /= num;		
	}
	
	public void sqRt() {
		this.displayValue = Util.squareRoot(this.displayValue);		
	}
	
	public void square() {
		this.displayValue = Util.square(this.displayValue);		
	}

	public void pow(float exponent) {
		this.displayValue = (float) Math.pow(this.displayValue, exponent);		
	}
	
	public void inverse() {
		if (this.displayValue == 0.0f) {
			this.isError = true;
			updateDisplay();
			return;
		}
		this.displayValue = 1.0f / this.displayValue;		
	}
	
	public void flipSign() {
		this.displayValue = -this.displayValue;		
	}
	
	public void factorial() {
		this.displayValue = Util.factorial((int) this.displayValue);
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
	
	public void log() {
		this.displayValue = Util.log(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}	
	}
	
	public void invNatLog() {
		this.displayValue = Util.inverseNaturalLog(this.displayValue);
		if (this.trigMode == TrigDisplayMode.RADIANS) {
			this.displayValue = Util.toRadians(this.displayValue);
		}
	}
	// END MATH ///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// GETTERS ////////////////////////////////////////////////////////////////////////////////////////////////
	public String getDisplay() {
		updateDisplay();
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
	}
	
	public void setAllowNegative(boolean allow) {
		this.allowNegative = allow;		
	}
	
	public void setDisplay(String newDisp) {
		this.display = newDisp;		
	}
	
	public void setError(boolean isError) {
		this.isError = isError;		
	}
	
	public void setStoredVal(int newStoredVal) {
		this.storedValue = newStoredVal;		
	}
	
	public void incStoredVal(float inc) {
		this.storedValue += inc;		
	}
	
	public void setDisplayMode(DisplayMode newMode) {
		this.numMode = newMode;		
	}
	
	public void setTrigMode(TrigDisplayMode newMode) {
		this.trigMode = newMode;		
	}
	
	public void toggleAllowNegatives() {
		this.allowNegative = !this.allowNegative;
	}
	
	public void toggleTrigMode() {
		if (this.trigMode.equals(TrigDisplayMode.DEGREES)) {
			this.trigMode = TrigDisplayMode.RADIANS;
		}
		else {
			this.trigMode = TrigDisplayMode.DEGREES;
		}
	}
	// END SETTERS /////////////////////////////////////////////////////////////////////////////////////////
	
	
}
