package gross_ryan;

/**
 * Created by ryangross on 1/15/17.
 */
public class Memory {
    double memoryNumber;

    public void resetNumber() {
        memoryNumber = 0;
    }

    public double addMemory(double aNumber) {
        memoryNumber += aNumber;
        return memoryNumber;
    }

    public double reCallMemory() {
        return memoryNumber;
    }
}
