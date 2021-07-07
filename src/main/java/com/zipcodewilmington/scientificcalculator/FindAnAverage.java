package com.zipcodewilmington.scientificcalculator;

public class FindAnAverage {
    static void findAnAverage() {
            double sumOfAverageInputs = 0;
            System.out.println("How many numbers would you like to find an average of?");
            System.out.println("Please enter \"return\" if you would like to quit.");
            String userInputAverage = Console.getStringInput(":");
            boolean correctInput;
            //run a while loop that checks if a proper number was entered
            while (true) {
                correctInput = InputChecker.isNumeric(userInputAverage);
                if (correctInput) break;
                System.out.println("Enter your value");
                userInputAverage = Console.getStringInput(":");
            }
            int userInputAverageInt = Integer.parseInt(userInputAverage);

            for (int i = 1; i <= userInputAverageInt; i++) {
                System.out.println("Enter a number.");
                String averageInput = Console.getStringInput(":");
                if(averageInput.equals("return")) break;
                while (true) {
                    correctInput = InputChecker.isNumeric(averageInput);
                    if (correctInput) break;
                    System.out.println("Enter a number");
                    averageInput = Console.getStringInput(":");
                }
                Integer averageInputInt = Integer.parseInt(averageInput);
                sumOfAverageInputs += averageInputInt;
                }
                double average = sumOfAverageInputs / userInputAverageInt;
                System.out.println("You average is " + average + ".");
            }
        }


