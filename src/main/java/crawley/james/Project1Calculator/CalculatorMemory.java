package crawley.james.Project1Calculator;

/**
 * Created by jamescrawley on 9/10/16.
 *
 *
 */
public class CalculatorMemory {

    private double state;
    private double memory;
    private TrigUnits[] unitOrder = {TrigUnits.DEGREES, TrigUnits.RADIANS};
    private CountingBase[] baseOrder = {CountingBase.BINARY, CountingBase.OCTAL,
            CountingBase.DECIMAL, CountingBase.HEXADECIMAL};
    private int currentUnits;
    private int currentBase;


    /**
     *
     * Stores values relating to the calculator's state, trig units and counting base.
     *
     * @param currentUnits index used to determine trig units 0: degrees 1: radians
     * @param currentBase index used to determine counting base 0: binary 1: octal 2: decimal 3: hexadecimal
     */
    public CalculatorMemory(int currentUnits, int currentBase) {

        this.currentUnits = currentUnits;
        this.currentBase = currentBase;
    }

    /**
     *
     * Changes the value of the calculator's state
     *
     * @param state the new value of the calculator's state
     */
    public void setState (double state) {

        this.state = state;
    }

    /**
     *
     * Returns the value of the calculator's state
     *
     * @return the value of the calculator's state
     */
    public double getState () {

        return state;
    }

    /**
     *
     * Sets the trig unit to the input value
     *
     * @param newUnit the trig unit to be used
     */
    public void setTrigUnits (TrigUnits newUnit) {

        if (newUnit == TrigUnits.RADIANS) {

            currentUnits = 1;

        } else if (newUnit == TrigUnits.DEGREES ) {

            currentUnits = 0;
        }
    }

    /**
     *
     * toggles trig units
     *
     */
    public void setTrigUnits () {

        if (currentUnits == 1) {

            currentUnits = 0;

        } else {

            currentUnits = 1;
        }
    }

    /**
     *
     * Returns the currently used trig units
     *
     * @return the value of the currently used trig units
     */
    public TrigUnits getTrigUnits () {

        return unitOrder[currentUnits];
    }


    /**
     *
     * Sets the counting base to the input value
     *
     * @param newBase the counting base to be used
     */
    public void setCountingBase (CountingBase newBase) {

        if (newBase == CountingBase.BINARY) {

            currentBase = 0;

        } else if (newBase == CountingBase.OCTAL) {

            currentBase = 1;

        } else if (newBase == CountingBase.DECIMAL) {

            currentBase = 2;

        } else if (newBase == CountingBase.HEXADECIMAL) {

            currentBase = 3;

        }

    }

    /**
     *
     * Toggles counting base
     *
     */
    public void setCountingBase () {

        if (currentBase == 3) {

            currentBase = 0;

        } else {

            currentBase++;
        }

    }


    /**
     *
     * Returns the current counting base
     *
     * @return the current counting base
     */
    public CountingBase getCountingBase () {

        return baseOrder[currentBase];
    }


    /**
     *
     * Sets the stored memory value to the input
     *
     * @param memory the value that will be saved in memory
     */
    public void setMemory (double memory) {

        this.memory = memory;

    }

    /**
     *
     * Recalls the value stored in memory
     *
     * @return the value stored in memory
     */
    public double getMemory () {

        return memory;
    }

}
