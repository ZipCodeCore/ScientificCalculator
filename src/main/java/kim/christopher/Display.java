package kim.christopher;


public class Display {

    private String currentDisplay;
    private DisplayMode mode;

    public Display(){

        currentDisplay = "0";
        mode = DisplayMode.DECIMAL;
    }

    public void clearDisplay(){

        currentDisplay = "0";
        System.out.print("DISPLAY: ");
        show();
    }

    public void show(){
        if(mode.equals(DisplayMode.DECIMAL))
            System.out.println(currentDisplay);
        else if(mode.equals(DisplayMode.HEXADECIMAL))
            System.out.println(Double.toHexString(Double.parseDouble(currentDisplay)));
//        else if(mode.equals(DisplayMode.OCTAL))
//            System.out.println(Double.(Double.parseDouble(currentDisplay)));
//        else if(mode.equals(DisplayMode.HEXADECIMAL))
//            System.out.println(Double.toHexString(Double.parseDouble(currentDisplay)));
    }

    public void setDisplay(String newCurrent){

        currentDisplay = newCurrent;
        System.out.print("DISPLAY: ");
        show();
    }

    public String getDisplay(){
        return currentDisplay;
    }

    public void displayError(){
        System.out.println("DISPLAY: ERROR");
    }

    public void showInvalidOperator(String s){
        System.out.println(s + " is not a valid operator, please try again");
    }

    public void showInvalidNumber(String s){
        System.out.println(s + " is not a number, please try again");
    }

    public void switchDisplayMode(){
        if(mode.equals(DisplayMode.BINARY)) {
            mode = DisplayMode.OCTAL;
            System.out.println("MODE: OCTAL");
            show();
        } else if(mode.equals(DisplayMode.OCTAL)) {
            mode = DisplayMode.DECIMAL;
            System.out.println("MODE: DECIMAL");
            show();
        } else if(mode.equals(DisplayMode.DECIMAL)) {
            mode = DisplayMode.HEXADECIMAL;
            System.out.println("MODE: HEXADECIMAL");
            show();
        } else {
            mode = DisplayMode.BINARY;
            System.out.println("MODE: BINARY");
            show();
        }
    }

    public void switchDisplayMode(String mode){
        if(mode.equalsIgnoreCase("binary")){
            this.mode = DisplayMode.BINARY;
        } else if (mode.equalsIgnoreCase("decimal")){
            this.mode = DisplayMode.DECIMAL;
        } else if (mode.equalsIgnoreCase("octal")){
            this.mode = DisplayMode.OCTAL;
        } else if (mode.equalsIgnoreCase("hexadecimal")){
            this.mode = DisplayMode.HEXADECIMAL;
        }
    }

}
