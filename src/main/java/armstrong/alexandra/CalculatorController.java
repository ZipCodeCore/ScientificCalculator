package armstrong.alexandra;

import java.awt.geom.Arc2D;
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
    public char operator;
    public double operand;

    public CalculatorController(){}

    public void setOperator(char operator){
        this.operator = operator;
    }

    public char getOperator(){
        return operator;
    }

    public void setOperand(double operand){
        this.operand = operand;
    }

    public double getOperand(){
        return operand;
    }

    public void operatorSwitch(/*char operator, double number*/){
        if (calc.getErrorDisplay().equalsIgnoreCase("err")){
            PrintPackage.print(calc.getErrorDisplay());
        }else{
            switch (operator){
                case '+': calc.add(operand); break;
                case '-': calc.subtract(operand); break;
                case '*': calc.multiply(operand); break;
                case '/': calc.divide(operand); break;
                case '^': calc.exponent(operand); break;
                case 'c': calc.clearDisplay(); break;
                case '%': calc.percent(); break;
                case '@': calc.square(); break;
                case '|': calc.squareRoot(); break;
                case '`': calc.inverse(); break;
                case '_': calc.invertSignOfDisplay(); break;
                case 'M': calc.addDisplayToMemory(); break;
                case 'C': calc.resetMemory(); break;
                case 'R': calc.recallStoredValueFromMemory(); break;
                case 's': calc.sine(); break;
                case 'n': calc.cosine(); break;
                case 't': calc.tangent(); break;
                case 'S': calc.inverseSine(); break;
                case 'N': calc.inverseCosine(); break;
                case 'T': calc.inverseTangent(); break;
                case 'l': calc.log(); break;
                case 'L': calc.inverseLog(); break;
                case 'e': calc.naturalLog(); break;
                case 'E': calc.inverseNaturalLog(); break;
                case '!': calc.factorial(); break;
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
