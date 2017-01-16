package Calculator;

/**
 * Created by randallcrame on 1/14/17.
 */
public class Divide {
    public Divide(){}

    static public void calculate() {
        double results = Input.getRightValue() != 0.0d ? Input.getLeftValue() / Input.getRightValue() : 0.0d;
        Input.setResults(results);
    }
}

