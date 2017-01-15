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

    public CalculatorController(){}

    public CalculatorController(double number){
        calc.setDisplay(number);
    }

    public CalculatorController(char operator){
        operatorSwitch(operator);
    }

    public CalculatorController(double display, char operator){
        calc.setDisplay(display);
        operatorSwitch(operator);
    }

    public CalculatorController(char operator, double number){
        operatorSwitch(operator, number);
    }

    public CalculatorController(double display, char operator, double number){
        calc.setDisplay(display);
        operatorSwitch(operator, number);
    }

    public CalculatorController(TrigUnit mode){
        if (mode == DEGREES){
            convertToDegrees(calc.getDisplay());
        } else {
            convertToRadians(calc.getDisplay());
        }
    }

    public CalculatorController(Notation mode){
        if (mode == SCIENTIFIC){
            convertToScientificNotation(calc.getDisplay());
        } else {
            convertToStandardNotation(calc.getDisplay());
        }
    }

    public CalculatorController(DisplayMode mode){
        if (mode == HEXADECIMAL){
            convertToHexadecimal();
        } else {
            convertToDecimal();
        }
    }

    public void operatorSwitch(char operator, double number){
        if (calc.getErrorDisplay().equalsIgnoreCase("err")){
            PrintPackage.print(calc.getErrorDisplay());
        }else{
            switch (operator){
                case '+' : calc.add(number); break;
                case '-' : calc.subtract(number); break;
                case '*' : calc.multiply(number); break;
                case '/' : calc.divide(number); break;
                case '^' : calc.exponent(number); break;
            }
        }
    }

    public void operatorSwitch(char operator){
        if (calc.getErrorDisplay().equalsIgnoreCase("err")){
            PrintPackage.print(calc.getErrorDisplay());
        }else {
            switch (operator) {
                case 'c': calc.clearDisplay();
                case '%': calc.percent();
                case '@': calc.square();
                case '|': calc.squareRoot();
                case '`': calc.inverse();
                case '_': calc.invertSignOfDisplay();
                case 'M': calc.addDisplayToMemory();
                case 'C': calc.resetMemory();
                case 'R': calc.recallStoredValueFromMemory();
                case 's': calc.sine();
                case 'n': calc.cosine();
                case 't': calc.tangent();
                case 'S': calc.inverseSine();
                case 'N': calc.inverseCosine();
                case 'T': calc.inverseTangent();
                case 'l': calc.log();
                case 'L': calc.inverseLog();
                case 'e': calc.naturalLog();
                case 'E': calc.inverseNaturalLog();
                case '!': calc.factorial();

            }
        }
    }

    public double convertToDecimal(){
        if (calc.getMode() == DECIMAL){
            return calc.getDisplay();
        }
        return (double) Integer.parseInt(calc.getHexDisplay(), 16);
    }

    public String convertToHexadecimal(){
        if (calc.getMode() == HEXADECIMAL){
            return calc.getHexDisplay();
        }
        return Integer.toHexString((int)calc.getDisplay());
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
        if(calc.getTrigUnit() == RADIANS){
            return number;
        }
        return Math.toRadians(number);
    }

    public double convertToDegrees(double number){
        if(calc.getTrigUnit() == DEGREES){
            return number;
        }
        return Math.toDegrees(number);
    }

    //public void parseInput(String input){}

    //public void translateInput(String[] commands){}
}
