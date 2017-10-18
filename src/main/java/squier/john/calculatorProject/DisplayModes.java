package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/14/17.
 */
public enum DisplayModes { DECIMAL, HEXADECIMAL;
    public DisplayModes advanceDisplayMode() {
        if ( this.name().equalsIgnoreCase("HEXADECIMAL") ) {
            return DECIMAL;
        }
        else {
            return HEXADECIMAL;
        }
    }
}
