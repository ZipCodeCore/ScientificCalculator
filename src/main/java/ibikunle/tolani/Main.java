package ibikunle.tolani;

/**
 * Created by tolaniibikunle on 1/14/17.
 */
public class Main {
    public static void main(String[] args){
        NumberFromUser.promptFirstNumberFromUser();
        NumberFromUser.promptTextFromUser();
        NumberFromUser.promptSecondNumberFromUser();
        Display.choose(NumberFromUser.choice);



    }
}