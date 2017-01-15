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

    double runUserOperation (){
        if(desiredOperation.equals("+")) {
            return this.addThem();
        } else if(desiredOperation.equals("-")) {
            return this.subtractSecondFromFirstNum();
        } else if (desiredOperation.equals("/")){
            return  this.divideNum1ByNum2();
        } else if (desiredOperation.equals("*")){
            return  this.multiplyThem();
        } else
            return 404.404;
    }

}
