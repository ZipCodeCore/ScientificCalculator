package Calculator;

/**
 * Created by randallcrame on 1/14/17.
 */
public class SquareRoot extends Expression{
    public SquareRoot(){}
    public SquareRoot(double leftValue){
   //     super(leftValue);
    }

    @Override
  public void calculate() {
        double results = Input.getLeftValue() != 0.0d ? Math.sqrt(Input.getLeftValue()) : 0.0d;
        Input.setResults(results);
    }
}
