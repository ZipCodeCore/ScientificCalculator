public class Basic{
    public float add(float a, float b){
        float sum = a+b;
        return sum;
    }
    public float subtract(float a, float b){
        float difference = a-b;
        return difference;

    }
    public float multiply(float a, float b){
        float product = a*b;
        return product;
    }

    public float divide(float a, float b){
        float quotient = a/b;
        return quotient;
    }

    public float square(float a){
        float squareResult = (float) Math.pow(a,2);
        return squareResult;

    }
    public float squareRoot(float a){
        float squareRootResult = (float) Math.sqrt(a);
        return squareRootResult;
    }
    public float exponent(float a, float b){
        float exponentResult = (float) Math.pow(a,b);
        return exponentResult;
    }
    public float inverse(float a){
        float inverseResult = 1/a;
        return inverseResult;
    }
    public float signChange(float a){
        float opposite = 0;
        if (a > 0){
            opposite = a - (2 * Math.abs(a));
        } else if(a < 0){
            opposite = a + (2 * Math.abs(b));
        } else {
            opposite = 0;
        }

        return opposite;
    }
}