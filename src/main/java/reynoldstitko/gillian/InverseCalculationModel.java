package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/16/17.
 */
public class InverseCalculationModel {

    public Double inverse(Double displayValue) {
        if(displayValue == 0){
            String errorMessage = "ERR";
            System.out.print(errorMessage);
            return 0.0;
        } else
            return 1 / displayValue;
    }
}
