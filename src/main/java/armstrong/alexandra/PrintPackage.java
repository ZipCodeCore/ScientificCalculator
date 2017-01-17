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
        println();
        println("Option Menu: please type a space between inputs");
        print(  "+ : Addition       s : Sine\n" +
                "- : Subtraction    n : Cosine\n" +
                "* : Multiply       t : Tangent\n" +
                "/ : Division       S : Inverse Sine\n" +
                "^ : Exponent       N : Inverse Cosine\n" +
                "c : Clear          T : Inverse Tangent\n" +
                "% : Percent        @ : Square\n" +
                "| : Square Root    ` : Inverse\n" +
                "_ : Invert Sign    M : Display To Memory\n" +
                "C : Reset Memory   R : Recall Memory\n" +
                "l : log            L : Inverse Log\n" +
                "e : Natural Log    E : Inverse Natural Log\n" +
                "! : Factorial\n" );

    }

    public static void modeDisplay(){
        print("DECIMAL : Decimal Mode\n" +
                "HEXADECIMAL : Hexadecimal Mode\n" +
                "STANDARD : Standard Notation\n" +
                "SCIENTIFIC : Scientific Notation\n" +
                "DEGREES : Degrees Mode\n" +
                "RADIANS : Radians Mode\n");
    }

    /*public static void main(String[] args){
        mockDisplay(4.3);
    }*/
}
