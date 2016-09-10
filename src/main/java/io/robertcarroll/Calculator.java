package io.robertcarroll;

public class Calculator {
    private double value;
    private double previousValue;
    private boolean powerOn;
    private boolean displayInUse = false;
    private String commandKey;
    private Units units = Units.DEGREES;

    /**
     * setter for unit testing
     */
    public void setUnits(Units units) {
        this.units = units;
    }

    /**
     * Create the objects that the calculator will communicate with
     */
    Display display = new Display();
    Memory memory = new Memory();
    User user = new User();
    Commands commands = new Commands();

    /**
     *  Math methods to run based on the command entered
     */
    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    public double difference(double value1, double value2) {
        return value1 - value2;
    }

    public double product(double value1, double value2) {
        return value1 * value2;
    }

    public double quotient(double value1, double value2) {
        return value1 / value2;
    }

    public double exponentiation(double value1, double value2){
        return Math.pow(value1, value2);
    }

    public double sqaureRoot(double value) {
        return Math.sqrt(value);
    }

    public double square(double value) {
        return value * value;
    }

    public double inverseNumber(double value){
        return 1 / value;
    }

    public double sine(double value) {
        if(units == Units.RADIANS){
            return Math.sin(value);
        }else{
            value = Math.toRadians(value);
            return Math.sin(value);
        }
    }

    public double cosine(double value) {
        if(units == Units.RADIANS){
            return Math.cos(value);
        }else{
            value = Math.toRadians(value);
            return Math.cos(value);
        }
    }

    public double tangent(double value) {
        if(units == Units.RADIANS){
            return Math.tan(value);
        }else{
            value = Math.toRadians(value);
            return Math.tan(value);
        }
    }

    public double inverseSine(double value) {
        if(units == Units.RADIANS){
            return Math.asin(value);
        }else{
            double answer = Math.asin(value);
            return Math.toDegrees(answer);
        }
    }

    public double inverseCosine(double value) {
        if(units == Units.RADIANS){
            return Math.acos(value);
        }else{
            double answer = Math.acos(value);
            return Math.toDegrees(answer);
        }
    }

    public double inverseTangent(double value) {
        if(units == Units.RADIANS){
            return Math.atan(value);
        }else{
            double answer = Math.atan(value);
            return Math.toDegrees(answer);
        }
    }

    public double log(double value) {
        return Math.log10(value);
    }

    public double naturalLog(double value) {
        return Math.log(value);
    }

    public double inverseNaturalLog(double value) {
        return Math.pow(Math.E, value);
    }

    public double inverseLog(double value) {
        return Math.pow(10, value);
    }

    public double factorial(double value) {
        if(value == 0){
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }

    public double switchSign(double value) {
        return value * -1;
    }

    /**
     * Ask the user for number
     */
    public void getInput() {
        value = user.inputNumber();
        display.setStoredDecimalNumber(value);
        display.setShownNumber(value);
    }

    /**
     * Ask the user for a command for methods to run
     */
    public void getCommand() {
        commandKey = user.inputCommand();
        executeCommand(commandKey);
    }

    /**
     * run the correct method based on the command input
     */
    public void executeCommand(String commandKey) {
        double result;

        switch(commandKey){
            case "1":
                previousValue = display.getStoredDecimalNumber();
                value = user.inputNumber();
                result = sum(previousValue, value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "2":
                previousValue = display.getStoredDecimalNumber();
                value = user.inputNumber();
                result = difference(previousValue, value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "3":
                previousValue = display.getStoredDecimalNumber();
                value = user.inputNumber();
                result = product(previousValue, value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "4":
                previousValue = display.getStoredDecimalNumber();
                value = user.inputNumber();
                result = quotient(previousValue, value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "5":
                previousValue = display.getStoredDecimalNumber();
                value = user.inputNumber();
                result = exponentiation(previousValue, value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "6":
                value = display.getStoredDecimalNumber();
                result = sqaureRoot(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "7":
                value = display.getStoredDecimalNumber();
                result = square(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "8":
                value = display.getStoredDecimalNumber();
                result = inverseNumber(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "9":
                value = display.getStoredDecimalNumber();
                result = sine(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "10":
                value = display.getStoredDecimalNumber();
                result = cosine(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "11":
                value = display.getStoredDecimalNumber();
                result = tangent(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);;
                break;
            case "12":
                value = display.getStoredDecimalNumber();
                result = inverseSine(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "13":
                value = display.getStoredDecimalNumber();
                result = inverseCosine(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "14":
                value = display.getStoredDecimalNumber();
                result = inverseTangent(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "15":
                value = display.getStoredDecimalNumber();
                result = log(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "16":
                value = display.getStoredDecimalNumber();
                result = naturalLog(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "17":
                value = display.getStoredDecimalNumber();
                result = inverseLog(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "18":
                value = display.getStoredDecimalNumber();
                result = inverseNaturalLog(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "19":
                value = display.getStoredDecimalNumber();
                result = factorial(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "20":
                value = display.getStoredDecimalNumber();
                result = switchSign(value);
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "21":
                System.out.println("Clearing...");
                display.clearDisplay();
                displayInUse = false;
                break;
            case "22":
                memory.clearMemory();
                break;
            case "23":
                memory.setStoredValue(value);
                System.out.println("DISPLAY: " + display.getShownNumber());
                break;
            case "24":
                result = memory.getStoredValue();
                display.setStoredDecimalNumber(result);
                display.setShownNumber(result);
                break;
            case "25":
                int mode = user.inputDisplayMode();
                if(mode == 0){
                    display.switchMode();
                }else{
                    display.switchMode(mode);
                }
                break;
            case "26":
                if(units == Units.DEGREES){
                    units = Units.RADIANS;
                }else {
                    units = Units.DEGREES;
                }
                break;
            case "27":
                powerOn = false;
                System.out.println("Turning off...");
                break;
            default:
                System.out.println(commands.getCommandList());
        }
    }

    /**
     * main method for running the calculator and getting input
     */
    public void calculatorOn(){
        /**
         * Set up the defaults for the calculator settings
         */
        powerOn = true;

        System.out.println("DISPLAY: " + display.getShownNumber());

        while(powerOn){
            if(!displayInUse){
                getInput();
            }

            displayInUse = true;
            if(display.getShownNumber().equals("Err")){
                System.out.println("\nTHE SCREEN MUST BE CLEARED BEFORE CONTINUING\n");
                getCommand();
            }else{
                getCommand();
            }
        }
    }
}