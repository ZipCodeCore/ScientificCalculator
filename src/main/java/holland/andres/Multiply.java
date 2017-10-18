package holland.andres;

public class Multiply {
    public double run (double currentNumberOnDisplay) {
        GetNumberInput getNumberInput = new GetNumberInput();
        double firstInput = getNumberInput.getNumber();
        return firstInput * currentNumberOnDisplay;
    }
}
