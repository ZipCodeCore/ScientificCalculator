package kim.christopher;


public class Display {

    private String currentDisplay;
    private String lastDisplay;

    public Display(){

        currentDisplay = "0";
        lastDisplay = "0";
    }

    public void clearDisplay(){

        currentDisplay = "0";
    }

    public void show(){
        System.out.println(currentDisplay);
    }

    public void setDisplay(String newCurrent){
        setLastDisplay(currentDisplay);
        currentDisplay = newCurrent;
        show();
    }

    public String getCurrentDisplay(){
        return currentDisplay;
    }

    public void setLastDisplay(String newLast){
        lastDisplay = newLast;
    }

    public String getLastDisplay(){
        return lastDisplay;
    }

}
