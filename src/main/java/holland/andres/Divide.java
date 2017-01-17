package holland.andres;

public class Divide {
    public double run (double currentNumberOnDisplay) {
        GetNumberInput getNumberInput = new GetNumberInput();
        double firstInput = getNumberInput.getNumber();
        return currentNumberOnDisplay / firstInput;
    }
}
