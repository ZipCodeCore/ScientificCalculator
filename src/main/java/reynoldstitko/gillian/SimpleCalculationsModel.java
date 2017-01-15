package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */

public class SimpleCalculationsModel {

    //public Controller controller = new Controller();
    public UserInterface userInterface = new UserInterface();


    public Double addition(Double inputFirstValue, Double inputSecondValue) {
        return inputFirstValue + inputSecondValue;
    }

    public Double subtraction(Double inputFirstValue, Double inputSecondValue) {

        return inputFirstValue - inputSecondValue;
    }

    public Double multiplication(Double inputFirstValue, Double inputSecondValue) {

        return inputFirstValue * inputSecondValue;
    }

    public Double division(Double inputFirstValue, Double inputSecondValue) {
    if (inputSecondValue == 0) {
        return 0.0;
        } else {
        return inputFirstValue/inputSecondValue;
        }
    }


}
