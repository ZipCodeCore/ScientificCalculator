package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/11/17.
 */
public class PrintPackage {

    public static void println(){
        System.out.println();
    }
    public static void print(Object toBePrinted){
        System.out.print(toBePrinted);
    }
    public static void println(Object toBePrinted){
        System.out.println(toBePrinted);
    }

    public static void mockDisplay(double display){
        println("---------------------------------");
        print("|");
        System.out.printf("%31f", display);
        print("|\n");
        println("---------------------------------");
    }

    /*public static void main(String[] args){
        mockDisplay(4.3d);
    }*/
}
