package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */

public class SimpleCalculationsModel {

    private Double result;
    public Controller controller = new Controller();


    public Double addition(Double inputValue, Double displayValue) {
        return displayValue + inputValue;
    }

    public Double subtraction(Double inputValue, Double displayValue) {
        return displayValue - inputValue;
    }

    public Double multiplication(Double inputValue, Double displayValue) {
        return inputValue * displayValue;
    }

public Double division(Double inputValue, Double displayValue) {
    if (inputValue == 0) {
        System.out.print("ERR");
        return inputValue;
        } else {

        return displayValue / inputValue;
        }
    }

}
