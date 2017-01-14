package gross_ryan;

/**
 * Created by ryangross on 1/13/17.
 */
public class Function {
    double displayedNumber;
    String calculatorCommand;
    double numberToCalculateWith;
    double result;

    public Function(String command, double someNumber) {
        this.calculatorCommand = command;
        this.numberToCalculateWith = someNumber;
    }

    public String getCalculatorCommand() {
        return this.calculatorCommand;
    }

    public double getNumberToCalculateWith() {
        return this.numberToCalculateWith;
    }


    public void setResult(Display aDisplay, Function aFunction) {
        double displNum = aDisplay.displayedNumber;
        double calcNum = aFunction.getNumberToCalculateWith();
        switch(aFunction.getCalculatorCommand()) {
            case "+":
                aDisplay.setDisplay(displNum + calcNum);
                break;
            case "-":
                aDisplay.setDisplay(displNum - calcNum);
                break;
            case "/":
                if (calcNum != 0) {
                    aDisplay.setDisplay(displNum / calcNum);
                    break;
                }
            case "*":
                aDisplay.setDisplay(displNum * calcNum);
                break;
        }
    }

}
