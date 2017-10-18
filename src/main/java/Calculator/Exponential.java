package Calculator;

/**
 * Created by randallcrame on 1/16/17.
 */
public class Exponential {
    static public void calculate() {
        double results = Math.pow(Input.getLeftValue(), Input.getRightValue());
        Input.setResults(results);
    }

}
