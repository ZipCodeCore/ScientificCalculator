package gross_ryan;

/**
 * Created by ryangross on 1/13/17.
 */
public class Calculator {
    Display aDisplay;
    UserInterface aUI = new UserInterface();
    Arithmetic anArithmetic = new Arithmetic();
    Exponential anExponential = new Exponential();
    Logarithmic aLogarithmic = new Logarithmic();
    Trig aTrig = new Trig();
    ErrorCheck anEC = new ErrorCheck();
    Custom userCustom = new Custom();


    public static void main(String[] args) {
        Calculator runCalculator = new Calculator();

        runCalculator.aDisplay.setEntireDisplay(runCalculator.aUI.doArithmetic("+", runCalculator.aDisplay.displayedNumber, 4));
        System.out.println(runCalculator.aDisplay.displayedNumberAsString);
        runCalculator.aUI.setMode(runCalculator.aDisplay,"BINARY");
        System.out.println(runCalculator.aDisplay.displayedNumberAsString);
    }

}


