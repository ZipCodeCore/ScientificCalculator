package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class scientificCalc {
    static Scanner prompt = new Scanner(System.in);

    public double promptScreen() {
        System.out.println("Choose your scientific function");//
        System.out.println("1. SIN, 2. SIN-1, 3. COS, 4. COS-1 5. TAN");
        System.out.println("6. TAN-1, 7. LOG, 8. LOG10, 9. LOG1P, 10. FAC");

        int function = Integer.valueOf(prompt.nextLine());

        if (function == 1) {
            return sine();
        } else if (function == 2) {
            return inverseSine();
        } else if (function == 3) {
            return cosign();
        } else if (function == 4) {
            return inverseCoSine();
        } else if (function == 5) {
            return tangent();
        } else if (function == 6) {
            return inverseTangent();
        } else if (function == 7) {
            return logarithm();
        } else if (function == 8) {
            return logarithm10();
        } else if (function == 9) {
            return logp();
        } else if (function == 10){
            return factorial();
        }
        return promptScreen();
    }

    public double sine() {  // 1
        System.out.println("Give number:");
        double first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.sin(first));
        return Math.sin(first);
    }

    public double inverseSine() {  // 2
        System.out.println("Give number:");
        double first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.asin(first));
        return (int) Math.asin(first);

    }
    public double cosign() {  // 3
        System.out.println("Give number:");
        double first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.cos(first));
        return Math.cos(first);
    }

    public double inverseCoSine() {  // 4
        System.out.println("Give number:");
        double first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.acos(first));
        return (int) Math.acos(first);
    }

    public double tangent() {  // 5
        System.out.println("Give number:");
        double first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.tan(first));
        return Math.tan(first);
    }

    public double inverseTangent() {  // 6
        System.out.println("Give number:");
        double first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.atan(first));
        return Math.atan(first);
    }

    public double logarithm() {  // 7
        System.out.println("Give number:");
        int first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.log(first));
        return Math.log(first);
    }

    public double logarithm10() {  // 8
        System.out.println("Give number:");
        int first = Integer.valueOf(prompt.nextLine());
        System.out.println(Math.log10(first));
        return Math.log10(first);
    }

    public double logp() {  // 9
        System.out.println("Give number:");
        double first = Integer.valueOf(prompt.nextLine());

        return Math.pow(Math.E, (Math.log(first)));
        //System.out.println(Math.E,(Math.log(first)));
    }
    public long factorial() {  // 10
        System.out.println("Give number:");
        long first = Integer.valueOf(prompt.nextLine());
        long fact = 1;
        for (int i = 2; i <= first; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        return (fact);
    }
}

//New Comment.










