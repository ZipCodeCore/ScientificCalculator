package Calculator;

/**
 * Created by randallcrame on 1/14/17.
 */
public class SquareRoot {
    public SquareRoot(){}

    static public void calculate() {
        double results = Input.getLeftValue() != 0.0d ? Math.sqrt(Input.getLeftValue()) : 0.0d;
        Input.setResults(results);
    }
}
