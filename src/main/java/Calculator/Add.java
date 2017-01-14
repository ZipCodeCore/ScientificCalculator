package Calculator;

/**
 * Created by randallcrame on 1/14/17.
 */
public class Add extends Expression {
    public Add(){}

    @Override
    public void calculate() {
        double results = Input.getLeftValue() + Input.getRightValue();
        Input.setResults(results);
    }
}
