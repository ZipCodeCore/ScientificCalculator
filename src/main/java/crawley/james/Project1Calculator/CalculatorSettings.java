package crawley.james.Project1Calculator;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class CalculatorSettings {

    private double state;
    private double memory;
    private TrigUnits[] unitOrder = {TrigUnits.DEGREES, TrigUnits.RADIANS};
    private CountingBase[] baseOrder = {CountingBase.BINARY, CountingBase.OCTAL,
            CountingBase.DECIMAL, CountingBase.HEXADECIMAL};
    private int currentUnits;
    private int currentBase;

    public CalculatorSettings (int currentUnits, int currentBase) {

        this.currentUnits = currentUnits;
        this.currentBase = currentBase;
    }

    public void setState (double state) {

        this.state = state;
    }

    public double getState () {

        return state;
    }

    public void setTrigUnits (TrigUnits newUnit) {

        if (newUnit == TrigUnits.RADIANS) {

            currentUnits = 1;

        } else if (newUnit == TrigUnits.DEGREES ) {

            currentUnits = 0;
        }
    }

    public void setTrigUnits () {

        if (currentUnits == 1) {

            currentUnits = 0;

        } else {

            currentUnits = 1;
        }
    }

    public TrigUnits getTrigUnits () {

        return unitOrder[currentUnits];
    }

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

    public void setCountingBase () {

        if (currentBase == 3) {

            currentBase = 0;

        } else {

            currentBase++;
        }

    }

    public CountingBase getCountingBase () {

        return baseOrder[currentBase];
    }

    public void setMemory (double memory) {

        this.memory = memory;

    }

    public double getMemory () {

        return memory;
    }

}
