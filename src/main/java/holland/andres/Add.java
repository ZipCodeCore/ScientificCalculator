package holland.andres;

public class Add {
    public double run (double currentNumberOnDisplay) {
        GetNumberInput getNumberInput = new GetNumberInput();
        double firstInput = getNumberInput.getNumber();
        return firstInput + currentNumberOnDisplay;
    }
}
