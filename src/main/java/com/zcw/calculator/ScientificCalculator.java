package com.zcw.calculator;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "0";
        System.out.println(result);
        System.out.println("Enter an operand : ");
        double a = sc.nextDouble();
        if (a == (long) a) {
            result = String.format("%d", (long) a);
        }
        System.out.println(result);

        System.out.println("Select an Operation form the list : ");
        System.out.println("square : 1 ");
        System.out.println("square root : 2");
        System.out.println("inverse : 3");
        int enter = sc.nextInt();

        switch (enter) {
            case 1 : ScientificArithmeticOperations sc1 = new ScientificArithmeticOperations();
                        result = sc1.square(a);
                        break;
            case 2: ScientificArithmeticOperations sc2 = new ScientificArithmeticOperations();
                        result = sc2.squareRoot(a);
                        break;
            case 3: ScientificArithmeticOperations s3 = new ScientificArithmeticOperations();
                        s3.inverse(a);
                        break;
            case 4: ScientificArithmeticOperations s4 = new ScientificArithmeticOperations();
                        double b = sc.nextDouble();
                        result = s4.sum(a,b);
                        break;
            default: System.out.println("ERR");


        }
        System.out.println(result);

    }
}
