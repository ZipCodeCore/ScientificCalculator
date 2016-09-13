package Ragonese.Ken.ScientificCalculator;

/**
 * Created by kenragonese on 9/10/16.
 */

public class Display {

    public String display = "0";

    public void clearDisplay() {
        display = "0";
    }
    public void homePrompt(){
        System.out.println("//////////////////////////");
        System.out.println("//////////////////////////");
        System.out.println("Please select a function:");
        System.out.println("For basic functions type: '1'");
        System.out.println("For advanced functions type: '2'");
        System.out.println("For trigonometric Functions type: '3'");
        System.out.println("For logarithmic type: '4'");
        System.out.println("To change modes type: '5'");
        System.out.println("To access the memory type: '6'");
        System.out.println("To clear most recent value type: '7'");
        System.out.println("To invert the sign of the most recent value type: '8'");
        System.out.println("For help type: '9'");
        System.out.println("To end program type '0'");
        System.out.println("");
        System.out.println("Most recent value: " + ScientificCalculator.mostRecentValue);
        System.out.println("Value in memory: " + ScientificCalculator.valueInMemory);
        System.out.println("//////////////////////////");
        System.out.println("//////////////////////////");
    }
    public void help(){
        System.out.println("//////////////////////////");
        System.out.println("Scientific Calculator 1.0");
        System.out.println("Created by Ken Ragonese");
        System.out.println("If you need help, use GOOGLE");
        System.out.println("//////////////////////////");
    }

    public void basicFunctions(){
        System.out.println("Select a function:");
        System.out.println("(a)dd");
        System.out.println("  (s)ubtract");
        System.out.println("    (m)ultiply");
        System.out.println("      (d)ivide");
    }
    public void advancedFunctions(){
        System.out.println("(s)quare");
        System.out.println("  (r)oot");
        System.out.println("    (e)xponent");
        System.out.println("      (i)nverse");
        System.out.println("        (f)actorial");
    }
    public void trigFunctions(){
        System.out.println("(s)ine ** inverse s(i)ne");
        System.out.println("(c)osine ** inverse c(o)sine");
        System.out.println("(t)angent ** inverse t(a)ngent");
    }
    public void logFunctions(){
        System.out.println("(l)og ** inverse l(o)g");
        System.out.println("(n)atural log ** inverse n(a)tural log");
    }
    public void modeMenu(){
        System.out.println("To change display mode type: '1'");
        System.out.println("To change trig units type '2'");
    }
    public void displayMode(){
        System.out.println("To switch to a new display mode type: 1");
        System.out.println("Or select from available modes:");
        System.out.println("(b)inary");
        System.out.println("  (o)ctal");
        System.out.println("    (d)ecimal");
        System.out.println("      (h)exadecimal");
    }
    public void trigUnitsMode(){
        System.out.println("To switch from degrees/radians type: '1'");
        System.out.println("Or select from available unit types:");
        System.out.println("(d)egrees ** (r)adians");
    }
    public void memoryMenu(){
        System.out.println("to add most recent value to memory type: '1'");
        System.out.println("to reset memory type: '2'");
        System.out.println("to overwrite most recent value with value stored in memory type: '3'");
    }


}
