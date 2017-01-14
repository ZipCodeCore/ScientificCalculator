package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class Display {

    public Controller controller = new Controller();
    private Double currentDisplayValue;

    public void setCurrentDisplayValue(Double currentDisplayValue) {
        this.currentDisplayValue = currentDisplayValue;
    }

    public Double getCurrentDisplayValue() {
        return currentDisplayValue;
    }

    public void clearDisplay(){
        currentDisplayValue = 0.0;
        System.out.print(currentDisplayValue);
    }

    public void displayErrorMessage(){
        System.out.print("ERR");
    }
}
