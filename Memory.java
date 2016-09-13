package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */
public class Memory {
    public void memoryMenu(){
        String commandString = scanner.next();
        if (commandString.equals("1")) {
            valueInMemory += mostRecentValue;
            mostRecentValue = 0;
        }
        else if(commandString.equals("2")){
            valueInMemory = 0;
        }
        else if(commandString.equals("3")){
            mostRecentValue = valueInMemory;
        }
    }
}
