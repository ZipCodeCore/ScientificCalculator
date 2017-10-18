package holland.andres;

public class Subtract {
    public double run (double currentNumberOnDisplay) {
        GetNumberInput getNumberInput = new GetNumberInput();
        double firstInput = getNumberInput.getNumber();
        return currentNumberOnDisplay - firstInput;
    }
}
