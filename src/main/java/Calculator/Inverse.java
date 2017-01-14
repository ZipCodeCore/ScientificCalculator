package Calculator;

/**
 * Created by randallcrame on 1/14/17.
 */
public class Inverse extends Expression {
    public Inverse() {}


    @Override
    public void calculate() {
        double results = Input.getLeftValue() != 0.0d ? 1.0 / Input.getLeftValue() : 0.0d;
        Input.setResults(results);
    }
}
