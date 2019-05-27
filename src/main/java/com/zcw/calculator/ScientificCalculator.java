package com.zcw.calculator;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "0";
        Memory memory = new Memory();
        while (true) {
            try {
                System.out.println("Result : " + result);
                System.out.print("Enter an operand : ");
                double a = sc.nextDouble();
                if (a == (long) a) {
                    result = String.format("%d", (long) a);
                }
                //System.out.println("");
                System.out.println("Result : " + result);


                System.out.println("Sum : 1 ");
                System.out.println("Subtraction : 2");
                System.out.println("Multiplication : 3");
                System.out.println("Modulus : 4 ");
                System.out.println("Division : 5 ");
                System.out.println("Square : 6 ");
                System.out.println("SquareRoot : 7 ");
                System.out.println("Inverse : 8 ");
                System.out.println("SwitchSign : 9 ");
                System.out.println("Sine : 10 ");
                System.out.println("Cosine : 11 ");
                System.out.println("Tangent : 12 ");
                System.out.println("InverseSine : 13 ");
                System.out.println("InverseCosine : 14 ");
                System.out.println("InverseTangent : 15 ");
                System.out.println("Factorial : 16 ");
                System.out.println("Log : 17 ");
                System.out.println("InverseLog : 18 ");
                System.out.println("NaturalLog : 19 ");
                System.out.println("InverseNaturalLogarith : 20 ");
                System.out.println("Store In Memory : 20 ");
                System.out.println("Reset Memory : 21");
                System.out.println("Recall Value from Memory : 22");
                System.out.println("Select an Operation form the list : ");
                int enter = sc.nextInt();

                switch (enter) {
                    case 1:
                        ScientificArithmeticOperations sc1 = new ScientificArithmeticOperations();
                        System.out.print("Enter 2nd Operand : ");
                        double b = sc.nextDouble();
                        result = sc1.sum(a, b);

                        break;
                    case 2:
                        ScientificArithmeticOperations sc2 = new ScientificArithmeticOperations();
                        System.out.print("Enter 2nd Operand : ");
                        b = sc.nextDouble();
                        result = sc2.diff(a, b);
                        break;
                    case 3:
                        ScientificArithmeticOperations s3 = new ScientificArithmeticOperations();
                        System.out.print("Enter 2nd Operand : ");
                        b = sc.nextDouble();
                        result = s3.multi(a, b);
                        break;
                    case 4:
                        ScientificArithmeticOperations s4 = new ScientificArithmeticOperations();
                        System.out.println("Enter 2nd Operand : ");
                        b = sc.nextDouble();
                        result = s4.modulus(a, b);
                        break;
                    case 5:
                        ScientificArithmeticOperations s5 = new ScientificArithmeticOperations();
                        System.out.println("Enter 2nd Operand : ");
                        b = sc.nextDouble();
                        result = s5.div(a, b);
                        break;
                    case 6:
                        ScientificArithmeticOperations s6 = new ScientificArithmeticOperations();
                        result = s6.square(a);
                        break;
                    case 7:
                        ScientificArithmeticOperations s7 = new ScientificArithmeticOperations();
                        result = s7.squareRoot(a);
                        break;
                    case 8:
                        ScientificArithmeticOperations s8 = new ScientificArithmeticOperations();
                        result = s8.inverse(a);
                        break;
                    case 9:
                        ScientificArithmeticOperations s9 = new ScientificArithmeticOperations();
                        result = s9.switchSign(a);
                        break;
                    case 10:
                        ScientificArithmeticOperations s10 = new ScientificArithmeticOperations();
                        result = s10.sine(a);
                        break;
                    case 11:
                        ScientificArithmeticOperations s11 = new ScientificArithmeticOperations();
                        result = s11.cosine(a);
                        break;
                    case 12:
                        ScientificArithmeticOperations s12 = new ScientificArithmeticOperations();
                        result = s12.tangent(a);
                        break;
                    case 13:
                        ScientificArithmeticOperations s13 = new ScientificArithmeticOperations();
                        result = s13.inverseSine(a);
                        break;
                    case 14:
                        ScientificArithmeticOperations s14 = new ScientificArithmeticOperations();
                        result = s14.inverseCosine(a);
                        break;
                    case 15:
                        ScientificArithmeticOperations s15 = new ScientificArithmeticOperations();
                        result = s15.inverseTangent(a);
                        break;
                    case 16:
                        ScientificArithmeticOperations s16 = new ScientificArithmeticOperations();
                        result = s16.factorial(a);
                        break;
                    case 17:
                        ScientificArithmeticOperations s17 = new ScientificArithmeticOperations();
                        result = s17.log(a);
                        break;
                    case 18:
                        ScientificArithmeticOperations s18 = new ScientificArithmeticOperations();
                        result = s18.inverseLog(a);
                        break;
                    case 19:
                        ScientificArithmeticOperations s19 = new ScientificArithmeticOperations();
                        result = s19.naturalLog(a);
                        break;
                    case 20:
                        memory.store(result);
                        break;
                    case 21:
                        memory.resetMemory();
                        result = "0";
                        break;
                    case 22:
                        result = memory.recallCurrentValue();
                        break;
                    default:
                        System.out.println("ERR");


                }
            } catch (Exception e) {
                e.printStackTrace();
                result = "ERR";
            }
            //System.out.println(result);
        }

    }
}
