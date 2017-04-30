package kim.christopher;


import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {


    private Scanner sc;

    public InputReader(){

        sc = new Scanner(System.in);
    }

    public ArrayList<String> readLine(){

        String line = sc.nextLine();
        ArrayList<String> result = new ArrayList<String>();

        for(String word: line.split("\\s+")){
            result.add(word);
        }

        return result;
    }

}
