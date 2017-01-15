package armstrong.alexandra;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static armstrong.alexandra.DisplayMode.*;
import static armstrong.alexandra.Notation.*;
import static armstrong.alexandra.TrigUnit.*;
/**
 * Created by alexandraarmstrong on 1/14/17.
 */
public class CalculatorController {
    ScientificCalculator calc = new ScientificCalculator();
    String input;
    String[] commands = new String[3];
    String output;

    CalculatorController(char operator){}
    CalculatorController(double number){}
    CalculatorController(char operator, double operand){}
    CalculatorController(double display, char operator, double operand){}

    /*public void checkDisplayMode(object number){
        if (calc.getMode() == DECIMAL){
            convertToHexadecimal(number);
        }
        if (calc.getMode() == HEXADECIMAL){
            convertToDecimal(number);
        }
    }
    public void checkNotation(Notation notation){}
    public void checkTrigUnits(TrigUnit trigUnit){}*/

    public double convertToDecimal(String string){
        return (double) Integer.parseInt(string, 16);
    }

    public String convertToHexadecimal(double number){
        return Integer.toHexString((int)number);
    }

    public double convertToStandardNotation(double number){
        NumberFormat formatter = new DecimalFormat("#0.0#");
        return Double.parseDouble(formatter.format(number));
    }

    public double convertToScientificNotation(double number){
        NumberFormat formatter = new DecimalFormat("0.###E0");
        return Double.parseDouble(formatter.format(number));
    }

    public double convertToRadians(double number){
        return Math.toRadians(number);
    }

    public double convertToDegrees(double number){
        return Math.toDegrees(number);
    }

    public void parseInput(String input){}

    public void translateInput(String[] commands){}
}
