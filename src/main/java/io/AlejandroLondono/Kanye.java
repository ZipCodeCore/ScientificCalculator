package io.AlejandroLondono;


import java.io.Console;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by alejandrolondono on 4/29/16.
 */


public class Kanye {

    public String display = "";
    public double memory = 0;
    public double inputOne = 0;
    public Mode currentMode = Mode.DECIMAL;
    public boolean rest = false;

    public Random random= new Random();
    public int willKanyeQuoteHimself = random.nextInt(100);
    public int willKanyeGuess = random.nextInt(100);
    public int whichQuote = random.nextInt(32);
    public String[] kanyeQuotes = {"Jay is Kweli's favorite rapper, 50 is Eminem's favorite rapper, and I'm my favorite rapper.",
            "I'm like a vessel, and God has chosen me to be the voice and the connector.",
            "My music isn't just music -- it's medicine.",
            "Don't ask me what I think the best song of last year was, because my opinion is the same as most of America's. It was Gold Digger.",
            "'Everything I'm not made me everything I am.' In my humble opinion, that's a prophetic statement. Gandhi would have said something like that.",
            "Come on now! How could you be me and want to be someone else?",
            "When I think of competition it's like I try to create against the past. I think about Michelangelo and Picasso. You know... the pyramids.",
            "I'm the No. 1 living and breathing rock star.",
            "When someone comes up and says something like, 'I am a god,' everybody says 'Who does he think he is?' I just told you who I thought I was. A god. I just told you. That's who I think I am.",
            "For me to say I wasn't a genius, I would just be lying to you and to myself.",
            "I feel like a little bit, like, I'm the Braveheart of creativity.",
            "I am Warhol! I am the number one most impactful artist of our generation. I am Shakespeare in the flesh. Walt Disney, Nike, Google.",
            "I'm going down as a legend, whether or not you like me or not. I am the new Jim Morrison. I am the new Kurt Cobain.",
            "The Bible had 20, 30, 40, 50 characters in it. You don't think that I would be one of the characters of today's modern Bb le?",
            "My greatest pain in life is that I will never be able to see myself perform live.",
            "You can't look at a glass half full or empty if it's overflowing.",
            "I have, like, nuclear power, like a superhero, like Cyclops when he puts his glasses on.",
            "Yeah. I'm rich and I'm famous, but I try not to be extra with it.",
            "A lot of people were wondering what I was going to do if I didn't win anything. I guess we'll never know.",
            "I'm a creative genius and there's no other way to word it.",
            "This is a gospel album with a whole lotta cursing on it but it's still a gospel album and it's the gospel according to 'Ye.",
            "I am offended by the word 'luck.'",
            "I have no interest in working with anyone who is too important or too good or too traditional to take a call at 3 a.m.",
            "Caught 10,000 retweets in half a second. #facts",
            "Ultra light beams, 3 years in the making.",
            "Sometimes creatively because I'm being held to task by the highest critics in every form of art, I feel like one of those guys who'd steal something and their form of death would be to be tied to four different horses and then be pulled to death.",
            "This is not album of the year. This is album of the life.",
            "Being fresh is more important than having money.",
            "I think the words \"dreamer\" and \"passionate\" diminish my will to execute. Because to be passionate about something or to dream about something does not say that it was executed.",
            "I think if Michelangelo was alive or Da Vinci was alive, there's no way that they wouldn't be working with shoes.",
            "When you're the absolute best, you get hated on the most.",
            "Sweatshirts are (expletive) important. That might sound like the funniest quote ever. How can you say all this stuff about running for president in 2020 and then say sweatshirts are important? But they are. Just mark my words. Mark my words like Mark Twain.",
            "Fame is often looked down upon in the design world, so it's actually been something I had to overcome.",
            "I have millions of ideas and I represent a new generation just trying to express themselves in a broken world."
    };




    public enum Mode {
        DECIMAL, BINARY, HEX, OCTAL
    }
    public TrigUnit currentTrigUnit =TrigUnit.RADIANS;
    public enum TrigUnit {
        RADIANS, DEGREES
    }

    public enum Command {
        ADD, SUBTRACT, DIVIDE, EXP, SQUARE, MULTIPLY, SQRT, INVERSE, SIGN, BINARY, HEX, OCTAL, SWITCH_MODE, SINE, COSINE, TANGENT, ARC_SINE, ARC_COSINE, ARC_TANGENT, TRIG_UNITS, SAVE, RESET, RECALL, KANYE_REST, LIST
    }

    /**
     * Methods begin below
     */

    public void equation(double input){
        this.inputOne = input;
    }

    public double add(double input){
        return this.inputOne + input;
    }

    public double subtract(double input){
        return this.inputOne - input;
    }

    public double divide(double input){
        return this.inputOne/input;
    }

    public double exp(double power){
        return Math.pow(this.inputOne, power);

    }

    public double exp(){
        return Math.pow(this.inputOne, 2);
    }

    public double multiply(double input){
        return this.inputOne * input;
    }

    public double sqrt(){
        return Math.sqrt(inputOne);
    }

    public double inverse(){
        return 1/this.inputOne;

    }

    public double switchSign(){
        double negOne = -1 ;
        return multiply(negOne);
    }

    public String binaryMode(){
        int inputInt = (int) inputOne;
        return Integer.toBinaryString(inputInt);
    }

    public String hexMode(){
        int inputInt = (int) inputOne;
        return Integer.toHexString(inputInt);
    }

    public String octalMode(){
        int inputInt = (int) inputOne;
        return Integer.toOctalString(inputInt);
    }
//if you keep incrementing, you will eventually increment out of the range
    public void switchDisplayMode(){
        int i = Mode.valueOf(currentMode.toString()).ordinal();
        i++;

        convertDisplayMode(Mode.values()[i]);
    }

//    THIS IS NOT FULLY OPERATIONAL. IT NEEDS TO TAKE A STRING AND COMPARE A MODE BEFORE????
    public void convertDisplayMode(Mode mode){
        this.currentMode = mode;

        switch (currentMode){
            case BINARY:
                binaryMode();
                break;
            case HEX:
                hexMode();
                break;
            case OCTAL:
                octalMode();
                break;
            default:

                break;

        }
//        return to display variable
    }

    public double sine(){
        return Math.sin(inputOne);
    }

    public double cosine(){
        return Math.cos(inputOne);
    }

    public double tangent(){
        return Math.tan(inputOne);
    }

    public double arcSine(){
        double modOne = inputOne%1;
        return Math.asin(modOne);
    }

    public double arcCosine(){
        double modOne = inputOne%1;
        return Math.acos(modOne);
    }

    public double arcTangent(){
        double modOne = inputOne%1;
        return Math.atan(modOne);
    }

    public void switchUnitsMode(){
        if(currentTrigUnit == TrigUnit.DEGREES){
            currentTrigUnit = TrigUnit.RADIANS;
        }else currentTrigUnit = TrigUnit.DEGREES;
    }

    public void storeToMemory(double answer){
        this.memory = answer;
    }

    public void resetMemory(){
        this.memory = 0;
    }

    public void recallMemory(){
        String memString = Double.toString(memory);
        this.display = memString;
    }

    public String display(Double input){
        this.display = Double.toString(input);
        System.out.println(this.display);
        return this.display;
    }

    public String display(String input){
        this.display = input;
        System.out.println(this.display);
        return this.display;
    }
    public void numGenerator(){
        this.willKanyeGuess = this.random.nextInt(100);
        this.willKanyeQuoteHimself = this.random.nextInt(100);
        this.whichQuote = this.random.nextInt(32);
    }

    public String kanyeGuess(double answer){

        if(willKanyeGuess <=20){
            double wrongAnswer = answer + random.nextInt(30);
            String kanyeAnswerString= "Bruh, its probably like "+ wrongAnswer +" or something.";
            display(kanyeAnswerString);
            return kanyeAnswerString;

        }else {
            String ans = Double.toString(answer);
            display(ans);
            return ans;
        }

    }

    public String immaLetYouFinish(double answer){

        if(willKanyeQuoteHimself <=40){
            String quote = this.kanyeQuotes[whichQuote];
            String kanyeResponse = quote+"\n"+answer;
            return kanyeResponse;
        }else return null;
    }

    public void kanyeRest(){
        this.rest = true;
    }

    /**
     * CLI Method calls all other methods in the runnit while loop
     */
    public void CLI(String command, double input){
        int i = Command.valueOf(command).ordinal();
        Command comm=Command.values()[i];
        double answer = 0;
        switch(comm){
            case ADD:
                answer = this.add(input);
                immaLetYouFinish(answer);
                kanyeGuess(answer);
                break;
            case SUBTRACT:
                answer = this.subtract(input);
                immaLetYouFinish(answer);
                kanyeGuess(answer);
                break;
            case DIVIDE:
                answer = this.divide(input);
                immaLetYouFinish(answer);
                kanyeGuess(answer);
                break;
            case EXP:
                answer = this.exp(input);
                immaLetYouFinish(answer);
                kanyeGuess(answer);
            case MULTIPLY:
                answer = this.multiply(input);
                immaLetYouFinish(answer);
                kanyeGuess(answer);
                break;
            case SAVE:
                break;
        }
//        call
    }

    public void runnit(){
        System.out.println("welcome to KanyeL8tor\n the Yeezy that makes math easy");
        Scanner scanner = new Scanner(System.in);

        while(!this.rest){

            String command;

            System.out.println("please enter a number\n");
            double first = scanner.nextDouble();
            this.equation(first);
            System.out.println(java.util.Arrays.asList(Command.values()));
            scanner.nextLine();
            System.out.println("type the operation you want to use");
            command = scanner.nextLine().toUpperCase();
            System.out.println("you entered "+command);
            System.out.println("enter the second number");
            Double second = scanner.nextDouble();
            this.CLI(command, second);

            this.rest = true;
        }
    }

    public static void main(String[] args) {
        Kanye kanye = new Kanye();
        kanye.runnit();

    }



}
