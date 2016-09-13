package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */

public class Mode {


    public void modeMenu(){
        String commandString = scanner.next();
        if (commandString.equals("1")) {
            display.displayMode();
            switchDisplayMode();
        }
        else if(commandString.equals("2")){
            display.trigUnitsMode();
            switchUnitsMode();
        }

    }
    public void switchDisplayMode(){
        String commandString = scanner.next();
        if(commandString.equals("b")){
            switchDisplayMode("b");
        }
        else if(commandString.equals("o")){
            switchDisplayMode("o");
        }
        else if(commandString.equals("d")){
            switchDisplayMode("d");
        }
        else if(commandString.equals("h")){
            switchDisplayMode("h");
        }
        else{
            switchDisplayMode("b");
        }
    }
    public void switchDisplayMode(String mode){
        String typeString;
        if(mode.equals("b")){
            typeString = Integer.toBinaryString((int) mostRecentValue);
            System.out.println("Most recent value in binary is: " + typeString);
        }
        if(mode.equals("o")){
            typeString = Integer.toOctalString((int) mostRecentValue);
            System.out.println("Most recent value in octal is: " + typeString);
        }
        if(mode.equals("d")){
            System.out.println("Most recent value in decimal is: " + mostRecentValue);
        }
        if(mode.equals("h")){
            typeString = Integer.toHexString((int) mostRecentValue);
            System.out.println("Most recent value in hexadecimal is: " + typeString);
        }
    }
    public void switchUnitsMode(){
        String commandString = scanner.next();
        if(commandString.equals("1")){
            if(mostRecentValue > (2*Math.PI)){
                mostRecentValue = toRadians(mostRecentValue);
            }
            else{
                mostRecentValue = toDegrees(mostRecentValue);
            }
        }
        else if(commandString.equals("d")){
            switchUnitsMode("degrees");
        }
        else if(commandString.equals("r")){
            switchUnitsMode("radians");
        }
    }
    public void switchUnitsMode(String mode){
        if(mode.equals("degrees")){
            mostRecentValue = toDegrees(mostRecentValue);
        }
        else if(mode.equals("radians")){
            mostRecentValue = toRadians(mostRecentValue);
        }
    }
    public double toDegrees(double angrad){
        return Math.toDegrees(angrad);
    }
    public double toRadians(double angdeg){
        return Math.toRadians(angdeg);
    }

}
