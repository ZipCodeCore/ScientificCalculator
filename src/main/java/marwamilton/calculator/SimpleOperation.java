package marwamilton.calculator;



/**
 * Created by mkulima on 1/14/17.
 */
public class SimpleOperation {
    String[] nums;
    String desiredOperation;
    

    // addition
    double addThem(){
        return Double.parseDouble(nums[0]) + Double.parseDouble(nums[1]);
    }

    double subtractSecondFromFirstNum(){
        return Double.parseDouble(nums[0]) - Double.parseDouble(nums[1]);
    }

    double multiplyThem(){
        return Double.parseDouble(nums[0]) * Double.parseDouble(nums[1]);
    }

    double divideNum1ByNum2(){
        return Double.parseDouble(nums[0]) / Double.parseDouble(nums[1]);
    }

    double toPower(){
        return Math.pow(Double.parseDouble(nums[0]), Double.parseDouble(nums[1]));
    }

    double nthRoot(){
        /* The number whose whose root is to be calculated comes first
        * the actual root is the second number*/
        return Math.pow(Double.parseDouble(nums[0]), 1.0/Double.parseDouble(nums[1]));
    }

    double runUserOperation (){
        if(desiredOperation.equals("+")) {
            return this.addThem();
        } else if(desiredOperation.equals("-")) {
            return this.subtractSecondFromFirstNum();
        } else if (desiredOperation.equals("/")){
            return  this.divideNum1ByNum2();
        } else if (desiredOperation.equals("*")) {
            return this.multiplyThem();
        } else if (desiredOperation.equals("^")) {
            return this.toPower();
        } else if (desiredOperation.equals("<")) {
            return this.nthRoot();
        } else
            return 404.404;
    }

}
