package holland.andres;

public class Invert {
    public double run (double currentNumberOnDisplay) {
        if (currentNumberOnDisplay > 0) {
            return currentNumberOnDisplay - (currentNumberOnDisplay * 2);
        }
        return currentNumberOnDisplay - currentNumberOnDisplay - currentNumberOnDisplay;
    }
}
