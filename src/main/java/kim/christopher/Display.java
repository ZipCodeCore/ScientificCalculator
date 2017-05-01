package kim.christopher;


public class Display {

    private static String currentDisplay;


    public Display(){

        currentDisplay = "0";
    }

    public void clearDisplay(){

        currentDisplay = "0";
        System.out.print("DISPLAY: ");
        show();
    }

    public void show(){

            System.out.println(currentDisplay);

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



}
