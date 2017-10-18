package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/15/17.
 */
public enum TrigModes { DEGREES, RADIANS;
    public TrigModes advanceTrigMode() {
        if ( this.name().equalsIgnoreCase("RADIANS") ) {
            return DEGREES;
        }
        else {
            return RADIANS;
        }
    }
}
