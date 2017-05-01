/**
 * Created by stephenpegram on 4/29/17.
 */


import org.apache.commons.lang3.StringUtils;

import java.lang.String;
import java.util.*;

public class Memory {

    String userInput;
    String functionInput;
    int functionArray1Index;
    int functionArray2Index;
    double currentValue;
    double currentValue2;
    String[] twoArgumentOperation = {"+","-","*","/","^"};
    String[] functions = {"sinx","cosx","tanx","isinx","icosx","itanx","logx","lnx","ilogx","ex","sqrd","sqrt","!","addinv","multinv"};

    Memory(){
        userInput = " ";
        currentValue = 0;
    }

    public void searchTwoArgumentOperations(UserInputReader input, Scanner scanner) {
        int i;
        boolean check = false;
        char atIndex;

        for (i = 0; i < twoArgumentOperation.length; i++) {
            if (functionInput.equals(twoArgumentOperation[i])){
               input.validEntry = true;
               System.out.println("operation = " + twoArgumentOperation[i]);
            }
        }

        System.out.println("validEntry in operations array : " + input.validEntry);
        if (input.validEntry){
            input.resetValidEntryFlag();
            System.out.println("Current index of operation is " + input.currentStringIndex);
            functionArray1Index = i;

            atIndex = userInput.charAt(input.currentStringIndex);

            userInput = userInput.substring(input.currentStringIndex+1, userInput.length());
            userInput = userInput.replaceAll("\\s", "");

            if(StringUtils.isNumeric(userInput)){
                currentValue2 = Double.parseDouble(userInput);
                System.out.println("Good. It passed");
                System.out.println("Value 1 : " + currentValue);
                System.out.println("Operation : " + atIndex);
                System.out.println("Value 1 : " + currentValue2);
            }
            else
            {
                System.out.println("Invalid input. Enter a valid expression");
                return;
            }


        }
        else{
            System.out.println("Checking functions array for match...\n");
            searchFunctions(input, scanner);
        }
    }


    public void searchFunctions(UserInputReader input, Scanner scanner){
        int i;
        boolean check = false;
        functionInput = userInput.substring(input.currentStringIndex, userInput.length());
        for (i = 0; i < functions.length; i++) {
            if (functionInput.equals(functions[i])) {
                input.validEntry = true;
                System.out.println("\nfunction = " + functions[i]);
            }
        }
        System.out.println("validEntry in functions array : " + input.validEntry);
        if(input.validEntry) {
            input.resetValidEntryFlag();
            return;
            //won't return after completing, will instead queue something to call
            // uncreated method to utilize proper function
        }
        else{
            System.out.println("You must enter a valid expression or option");
            resetCurrentValue();
            return;
        }

    }




    public void storeValue(){
        //create readIn class and then write this method
    }

    public void resetCurrentValue(){
        currentValue = 0;
    }
}
