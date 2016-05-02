package io.matthewbelongia;

import java.util.Scanner;

/**
 * Created by matthewb on 4/29/16.
 */


/**
 * Runs a Calculator App that takes input and outputs to the screen
 * Allows Storage of one value to memory
 * Allows several Operations on the Value on Display
 * Allows 4 different types of Display Types
 * Has Some secret functions just for fun
 *
 *
 *
 *
 *
 */
public class Display extends Calculator {

    public enum FunctionEnum {
        TAN, COS, SIN, CLEAR, MPLUS, MCLEAR, PLUS, MINUS, MULT, SWITCHMODE, POWEROF, MCALL, SQUARE, SQUAREROOT,
        INVSIN, INVCOS, INVTAN, LOG, INVLOG, NATLOG, INVNAT, FACTORIAL, SWITCHCHOOSEMODE, INVERSE, DIVIDE, ART, SB,
        SQ, WATER, NC, UNIT, UNITCHOOSE, OFF

    }

    boolean displayOn = true;
    boolean errorOn = false;
    int mode = 0;
    double inputValue = 0.0;
    double memoryValue = 0.0;
    double actualValue = 0.0;
    String displayValue = "0.0";
    String errorDisplay = "";
    boolean deci = true;
    boolean hexa = false;
    boolean octa = false;
    boolean bin = false;
    boolean degrees = true;
    private FunctionEnum functionEnum;
    //Calculator calculator = new Calculator();

    public boolean powerOff(){
        return displayOn = false;
    }
    public boolean getPower(){
        return displayOn;
    }

    public int getMode(){
        return this.mode;
    }

    public boolean getErrorOn(){
        return this.errorOn;
    }

    public void displayOutput() {

        if(deci) {
            displayValue = Double.toString(actualValue);
        }
        else if(hexa){
            displayValue = Double.toHexString(actualValue);
        }
        else if(octa){
            int tempval = (int)actualValue;
            displayValue = Integer.toString(tempval,8);
        }
        else if(bin){
            int tempval = (int)actualValue;
            displayValue = Integer.toString(tempval,2);
        }
        while(displayOn) {

            //System.out.println(actualValue);
            printNC();
            chooseFunction();


        }
    }
    public void nextMode(){
        mode++;
    }

    public boolean changeMode(){
        if(mode > 3){
            mode = 0;
        }
        if(mode == 0){
            hexa = false;
            bin = false;
            octa = false;
            return deci = true;
        }
        if(mode == 1){
            deci = false;
            bin = false;
            octa = false;
            return hexa = true;
        }
        if(mode == 2){
            hexa = false;
            deci = false;
            octa = false;
            return bin = true;
        }
        else{
            hexa = false;
            bin = false;
            deci = false;
            return octa = true;
        }
    }

    public void setMode(){
        System.out.println("Type 0 for decimal / 1 for hexadecimal / 2 for binary/ 3 for octal");
        Scanner modeSelect = new Scanner(System.in);
        String input = modeSelect.next();
        if(input.matches("\\d+")) {
            if(input.length() > 10){
                setMode();
            }
            else {
                mode = Integer.parseInt(input);
            }
        }
        else{
            setMode();
        }
    }

    public void changeUnits(){
        if(degrees){
            actualValue = Math.round(Math.toRadians(actualValue)*10000.0)/10000.0;
        }
        else {
            actualValue = Math.round(Math.toDegrees(actualValue)*10000.0)/10000.0;
        }
        degrees = !degrees;

    }

    public boolean getUnits(){
        return this.degrees;
    }
    public void chooseUnits(){
        int unit = 0;
        System.out.println("Type 0 for degrees / 1 for radians");
        Scanner unitSelect = new Scanner(System.in);
        String input = unitSelect.next();
        if(input.matches("\\d+")) {
            if(input.length() > 10){
                setMode();
            }
            else {
                unit = Integer.parseInt(input);
                if(unit == 1){
                    if(!degrees){
                        return;
                    }
                    else {
                        degrees = false;
                        actualValue = Math.round(Math.toRadians(actualValue) * 10000.0) / 10000.0;
                    }
                }
                else{
                    if(degrees){
                        return;
                    }
                    else {
                        degrees = true;
                        actualValue = Math.round(Math.toDegrees(actualValue) * 10000.0) / 10000.0;
                    }
                }
            }
        }
        else{
            chooseUnits();
        }
    }

    public void chooseFunction(){
        if(!getPower()){
            return;
        }
        Scanner inputDouble = new Scanner(System.in);
        System.out.println(displayValue +":");
        String input = inputDouble.next();

        input = checkFunctionSelection(input);
        System.out.println(input);
        try {
            functionEnum = FunctionEnum.valueOf(input);
        } catch ( IllegalArgumentException e ) {
            errorDisplay = "ERROR: 'clear'";
            errorOn = true;
            errorScreen();
            printNC();
            chooseFunction();
        }
        runFunction();
        displayOutput();
    }

    public String checkFunctionSelection(String input){

        try {
            functionEnum = FunctionEnum.valueOf(input);
        } catch ( IllegalArgumentException e ) {
            if(input.equals("^2")){
                return "SQUARE";
            }
            if(input.equals("^?")){
                return "POWEROF";
            }
            if(input.equals("CLR")){
                return "CLEAR";
            }
            if(input.equals("M+")){
                return "MPLUS";
            }
            if(input.equals("SQT")){
                return "SQUAREROOT";
            }
            if(input.equals("1/T")){
                return "INVTAN";
            }
            if(input.equals("INV")){
                return "INVERSE";
            }
            if(input.equals("M-")){
                return "MCLEAR";
            }
            if(input.equals("+")){
                return "PLUS";
            }
            if(input.equals("-")){
                return "MINUS";
            }
            if(input.equals("*")){
                return "MULT";
            }
            if(input.equals("1/S")){
                return "INVSIN";
            }
            if(input.equals("1/C")){
                return "INVCOS";
            }
            if(input.equals("SWC")){
                return "SWITCHCHOOSEMODE";
            }
            if(input.equals("/")){
                return "DIVIDE";
            }
            if(input.equals("MC")){
                return "MCALL";
            }
            if(input.equals("CLR")){
                return "CLEAR";
            }
            if(input.equals("^?")){
                return "POWEROF";
            }
            if(input.equals("FAC")){
                return "FACTORIAL";
            }
            if(input.equals("NAT")){
                return "NATLOG";
            }
            if(input.equals("SW+")){
                return "SWITCHMODE";
            }
            if(input.equals("10^")){
                return "INVLOG";
            }
            if(input.equals("E^X")){
                return "INVNAT";
            }
            if(input.equals("NLG")){
                return "NATLOG";
            }
            if(input.equals("UC")){
                return "UNITCHOOSE";
            }
            if(input.equals(":D")){
                return "SB";
            }
            if(input.equals(":(")){
                return "SQ";
            }
            if(input.equals("APP")){
                return "ART";
            }
            if(input.equals("//")){
                return "WATER";
            }
            else {
                return "";
            }

        }
        return input;

    }


    public void runFunction(){
        switch(functionEnum){

            case TAN:
                if(!degrees){
                    actualValue = Math.toDegrees(actualValue);
                }
                actualValue = tanFunction(actualValue);
                break;
            case INVTAN:
                if(!degrees){
                    actualValue = Math.toDegrees(actualValue);
                }
                actualValue = (invTanFunction(actualValue));
                break;
            case COS:
                if(!degrees){
                    actualValue = Math.toDegrees(actualValue);
                }
                actualValue = cosFunction(actualValue);
                break;
            case INVCOS:
                if(!degrees){
                    actualValue = Math.toDegrees(actualValue);
                }
                actualValue = invCosFunction(actualValue);
                break;
            case SIN:
                if(!degrees){
                    actualValue = Math.toDegrees(actualValue);
                }
                actualValue = sinFunction(actualValue);
                break;
            case INVSIN:
                if(!degrees){
                    actualValue = Math.toDegrees(actualValue);
                }
                actualValue = invSinFunction(actualValue);
                break;
            case SQUARE:
                actualValue = squareFunction(actualValue);
                displayOutput();
                break;
            case SQUAREROOT:
                actualValue = squareRootFunction(actualValue);
                break;
            case DIVIDE:
                actualValue = divideFunction(actualValue);
                break;
            case PLUS:
                actualValue = addFunction(actualValue);
                break;
            case MINUS:
                actualValue = minusFunction(actualValue);
                break;
            case MPLUS:
                memoryValue = actualValue + 0;
                break;
            case MCALL:
                actualValue = memoryValue + 0;
                break;
            case MCLEAR:
                memoryValue = 0.0;
                break;
            case MULT:
                actualValue = multFunction(actualValue);
                break;
            case CLEAR:
                actualValue = 0;
                break;
            case POWEROF:
                actualValue = powerFunction(actualValue);
                break;
            case INVERSE:
                actualValue = (actualValue * -1);
                break;
            case FACTORIAL:
                actualValue = factFunction(actualValue);
                break;
            case NATLOG:
                actualValue = natLogFunction(actualValue);
                break;
            case INVNAT:
                actualValue = invNatLogFunction(actualValue);
                break;
            case LOG:
                actualValue = logFunction(actualValue);
                break;
            case INVLOG:
                actualValue = invLogFunction(actualValue);
                break;
            case SWITCHCHOOSEMODE:
                setMode();
                changeMode();
                break;
            case SWITCHMODE:
                nextMode();
                changeMode();
                break;
            case UNIT:
                changeUnits();
                break;
            case UNITCHOOSE:
                chooseUnits();
                break;
            case SB:
                printSB();
                break;
            case SQ:
                printSQ();
                break;
            case ART:
                printAPP();
                break;
            case WATER:
                printWater();
                break;
            case NC:
                printNC();
                break;
            case OFF:
                powerOff();
                break;
            default:
                errorDisplay = "ERROR SCREEN:";
                errorOn = true;
                errorScreen();
                break;
        }


    }

    public void errorScreen(){

        while(errorOn){
            printErrorNC();
            Scanner errorScanner = new Scanner(System.in);
            String errorInput = errorScanner.next();
            errorInput = errorInput.toLowerCase();
            if(errorInput.equals("clear")){
                errorOn = false;
            }
            else {
                errorDisplay = "ERROR: 'clear'";
                continue;
            }

        }

    }
public void printSB(){
    System.out.println("      .--..--..--..--..--..--.\n" +
            "    .' \\  (`._   (_)     _   \\\n" +
            "  .'    |  '._)         (_)  |\n" +
            "  \\ _.')\\      .----..---.   /\n" +
            "  |(_.'  |    /    .-\\-.  \\  |\n" +
            "  \\     0|    |   ( O| O) | o|\n" +
            "   |  _  |  .--.____.'._.-.  |\n" +
            "   \\ (_) | o         -` .-`  |\n" +
            "    |    \\   |`-._ _ _ _ _\\ /\n" +
            "    \\    |   |  `. |_||_|   |\n" +
            "    | o  |    \\_      \\     |     -.   .-.\n" +
            "    |.-.  \\     `--..-'   O |     `.`-' .'\n" +
            "  _.'  .' |     `-.-'      /-.__   ' .-'\n" +
            ".' `-.` '.|='=.='=.='=.='=|._/_ `-'.'\n" +
            "`-._  `.  |________/\\_____|    `-.'\n" +
            "   .'   ).| '=' '='\\/ '=' |\n" +
            "   `._.`  '---------------'\n" +
            "           //___\\   //___\\\n" +
            "             ||       ||\n" +
            "    LGB      ||_.-.   ||_.-.\n" +
            "            (_.--__) (_.--__)\n");
}
public void printSQ(){
    System.out.println("Squidward\n" +
            "\n" +
            "           .--'''''''''--.\n" +
            "        .'      .---.      '.\n" +
            "       /    .-----------.    \\\n" +
            "      /        .-----.        \\\n" +
            "      |       .-.   .-.       |\n" +
            "      |      /   \\ /   \\      |\n" +
            "       \\    | .-. | .-. |    /\n" +
            "        '-._| | | | | | |_.-'\n" +
            "            | '-' | '-' |\n" +
            "             \\___/ \\___/\n" +
            "          _.-'  /   \\  `-._\n" +
            "        .' _.--|     |--._ '.\n" +
            "        ' _...-|     |-..._ '\n" +
            "               |     |\n" +
            "               '.___.'\n" +
            "                 | |\n" +
            "                _| |_\n" +
            "               /\\( )/\\\n" +
            "              /  ` '  \\\n" +
            "             | |     | |\n" +
            "             '-'     '-'\n" +
            "             | |     | |\n" +
            "             | |     | |\n" +
            "             | |-----| |\n" +
            "          .`/  |     | |/`.\n" +
            "          |    |     |    |\n" +
            "          '._.'| .-. |'._.'\n" +
            "                \\ | /\n" +
            "                | | |\n" +
            "                | | |\n" +
            "                | | |\n" +
            "               /| | |\\\n" +
            "             .'_| | |_`.\n" +
            "   LGB       `. | | | .'\n" +
            "          .    /  |  \\    .\n" +
            "         /o`.-'  / \\  `-.`o\\\n" +
            "        /o  o\\ .'   `. /o  o\\\n" +
            "        `.___.'       `.___.'");
}
public void printAPP(){
    System.out.println(
            "       \\/.--,\n" +
            "        //_.'\n" +
            "   .-\"\"-/\"\"-.\n" +
            "  /       __ \\\n" +
            " /        \\\\\\ \\\n" +
            " |         || |\n" +
            " \\            /\n" +
            " \\  \\         /\n" +
            "  \\  '-      /\n" +
            "   '-.__.__.'     sjw\n");
}
public void printWater(){
    System.out.println(
            "        ~  ~\n" +
            "      ( o )o)\n" +
            "     ( o )o )o)\n" +
            "   (o( ~~~~~~~~o\n" +
            "   ( )' ~~~~~~~'\n" +
            "   ( )|)       |-.\n" +
            "     o|     _  |-. \\\n" +
            "     o| |_||_) |  \\ \\\n" +
            "      | | ||_) |   | |\n" +
            "     o|        |  / /\n" +
            "      |        |.\" \"\n" +
            "      |        |- '\n" +
            "      .========.   mb\n");
}
public void printNC(){
    System.out.println(
                    " _______________________________\n" +
                    "|  ____________________________  |\n" +
                    "| | " + displayValue + "\n" +
                    "| |                            | |\n" +
                    "| |____________________________| |\n" +
                    "|  _______________  _________  | |\n" +
                    "| | CLR| M+ | MC | | +  |1/S | | |\n" +
                    "| |____|____|____| |____|____| | |\n" +
                    "| | TAN| MRC| INV| | -  |1/C | | |\n" +
                    "| |____|____|____| |____|____| | |\n" +
                    "| | COS| ^2 | 1/x| | *  |1/T | | |\n" +
                    "| |____|____|____| |____|____| | |\n" +
                    "| | SIN| ^? | SQT| | /  |FAC | | |\n" +
                    "| |____|____|____| |____|____| | |\n" +
                    "| | :( | APP| LOG| | // |SW+ | | |\n" +
                    "| |____|____|____| |____|____| | |\n" +
                    "| | E^X| 10^| NLG| | :D |SWC | | |\n" +
                    "| |____|____|____| |____|____| | |\n" +
                    "|________________________________|\n" +
                    "\n");
}
public void printErrorNC(){
        System.out.println(
                " _______________________________\n" +
                        "|  ____________________________  |\n" +
                        "| | " + errorDisplay + "\n" +
                        "| |                            | |\n" +
                        "| |____________________________| |\n" +
                        "|  _______________  _________  | |\n" +
                        "| | CLR| M+ | MC | | +  |1/S | | |\n" +
                        "| |____|____|____| |____|____| | |\n" +
                        "| | TAN| MRC| INV| | -  |1/C | | |\n" +
                        "| |____|____|____| |____|____| | |\n" +
                        "| | COS| ^2 | 1/x| | *  |1/T | | |\n" +
                        "| |____|____|____| |____|____| | |\n" +
                        "| | SIN| ^? | SQT| | /  |FAC | | |\n" +
                        "| |____|____|____| |____|____| | |\n" +
                        "| | :( | APP| LOG| | // |SW+ | | |\n" +
                        "| |____|____|____| |____|____| | |\n" +
                        "| | E^X| 10^| NLG| | :D |SWC | | |\n" +
                        "| |____|____|____| |____|____| | |\n" +
                        "|________________________________|\n" +
                        "\n");
    }
}
