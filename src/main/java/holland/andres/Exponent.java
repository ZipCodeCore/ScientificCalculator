package holland.andres;

public class Exponent {
    public double run (double currentNumberOnDisplay) {
        GetNumberInput getNumberInput = new GetNumberInput();
        double firstInput = getNumberInput.getNumber();
        return Math.pow(currentNumberOnDisplay, firstInput);
    }
}
