package Calculator;

/**
 * Created by randallcrame on 1/14/17.
 */
public class Inverse {
    public Inverse() {}


    static public void calculate() {
        double results = Input.getLeftValue() != 0.0d ? 1.0 / Input.getLeftValue() : 0.0d;
        Input.setResults(results);
    }
}
