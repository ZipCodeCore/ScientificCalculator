package kim.christopher;


import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {

    private String lastInput;
    private Scanner scanner;

    public InputReader(){
        lastInput = null;
        scanner = new Scanner(System.in);
    }

    public ArrayList<String> readLine(){

        String line = scanner.nextLine();
        ArrayList<String> result = new ArrayList<String>();

        for(String word: line.split("\\s+")){
            result.add(word);
        }

        return result;
    }



}
