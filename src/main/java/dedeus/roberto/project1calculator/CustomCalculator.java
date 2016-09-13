package dedeus.roberto.project1calculator;

import java.util.Random;

/**
 * Created by robertodedeus on 9/13/16.
 */
public class CustomCalculator {

    double createRandomNumber(){
        Random rand = new Random();
        return rand.nextDouble() * 1000 + 1;
    }

    String getGreatestTribe(){
        return "DE Beard Squad";
    }
}
