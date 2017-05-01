/**
 * Created by danzygmund-felt on 4/30/17.
 */
public class Memory {
    private double stored;

    Memory() {
        this.stored = 0.0;
    }

    double getMemory() {
        return this.stored;
    }

    void setMemory(double x) {
        this.stored = x;
    }

    void resetMemory() {
        this.stored = 0.0;
    }
}
