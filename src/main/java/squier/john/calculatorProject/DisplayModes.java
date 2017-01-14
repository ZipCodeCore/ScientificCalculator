package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/14/17.
 */
public enum DisplayModes { BINARY, DECIMAL, HEXADECIMAL;
    public DisplayModes advanceDisplayMode() {
        if ( this.name().equalsIgnoreCase("BINARY") ) {
            return DECIMAL;
        }
        else if ( this.name().equalsIgnoreCase("DECIMAL") ) {
            return HEXADECIMAL;
        }
        else {
            return BINARY;
        }
    }
}
