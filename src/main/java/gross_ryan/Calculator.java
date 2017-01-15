package gross_ryan;

/**
 * Created by ryangross on 1/13/17.
 */
public class Calculator {

    public static void main(String[] args) {
        Display aDisplay = new Display();
        UserInterface aUI = new UserInterface();
        aUI.anArithmetic = new Arithmetic();
        aUI.anExponential = new Exponential();
        aDisplay.setDisplay(aUI.doArithmetic("+", aDisplay.displayedNumber, 4));
        System.out.println(aDisplay.displayedNumber);
        aDisplay.setDisplay(aUI.exponentialFunction("^2", aDisplay.displayedNumber));
        System.out.println(aDisplay.displayedNumber);
    }

    }


