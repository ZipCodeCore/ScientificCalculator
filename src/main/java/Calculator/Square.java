package Calculator;

/**
 * Created by randallcrame on 1/14/17.
 */
public class Square {

    static public void calculate() {
        double results = Input.getLeftValue() * Input.getLeftValue();
        Input.setResults(results);
    }


}

