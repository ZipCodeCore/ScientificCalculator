package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/16/17.
 */
public class InverseCalculationModel {

    public Double inverse(Double displayValue) {
        if(displayValue == 0){
            System.out.print("ERR");
            return displayValue;
        } else
            return 1 / displayValue;
    }
}
