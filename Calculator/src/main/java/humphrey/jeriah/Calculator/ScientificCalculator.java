package humphrey.jeriah.Calculator;

/**
 * Created by jeriahhumphrey on 1/16/17.
 */
public class ScientificCalculator extends Calculator {
 private String display= "binary";
 private double memoryValue=0;
 private String trigUnit= "degrees";


 public double fullDisplay(){
     System.out.println("Display Mode " + display);
     System.out.println(currentNumber);
     return currentNumber;
 }

 public String switchDisplayMode(){
     switch (display) {
         case "binary":
             display = "octal";
             break;
         case "octal":
             display = "decimal";
             break;
         case "decimal":
             display = "hexadecimal";
             break;
         case "hexadecimal":
             display = "binary";
             break;
         default:
             System.out.println("Invalid display type. Resetting to binary");
             display= "binary";
             break;
     }
            this.fullDisplay();
            return display;
    }

    public String switchDisplayMode(String display){
        this.display = display;
        this.fullDisplay();
        return display;
    }

    public double storeMemory(){
        memoryValue=currentNumber;
        return this.memoryValue;
    }

    public double resetMemory(){
        memoryValue=0;
        return memoryValue;
    }

    public double recallMemory(){
        currentNumber = memoryValue;
        this.displayNumber();
        return currentNumber;
    }

    public String switchUnitsMode(){
        if (trigUnit.equals("degrees")){
            trigUnit= "radians";
        }
        else if (trigUnit.equals("radians")){
            trigUnit= "degrees";
        }
        System.out.println("TrigUnit : " + trigUnit);
        return trigUnit;
    }

    public String switchUnitsMode(String unit){

        if (unit.equalsIgnoreCase("degrees")|| unit.equalsIgnoreCase("radians")){
            trigUnit= unit.toLowerCase();
            System.out.println("TrigUnit " + trigUnit);
        }
        else{
            System.out.println("Invalid choice. Unit will remain " + trigUnit );
        }
        return trigUnit;
    }

    public double sine() {
        if (trigUnit.equalsIgnoreCase("radians")) {
            currentNumber = Math.sin(currentNumber);
        } else if (trigUnit.equalsIgnoreCase("degrees")) {
            currentNumber = Math.sin(Math.toRadians(currentNumber));
        }
        this.displayNumber();
        return currentNumber;
    }

    public double inversesine(){
        if (trigUnit.equalsIgnoreCase("radians")){
            currentNumber= Math.asin(currentNumber);
        }
        else if(trigUnit.equalsIgnoreCase("degrees")){
            currentNumber= Math.toDegrees(Math.asin(currentNumber));
        }
        this.displayNumber();
        return currentNumber;
    }

    public double cosine(){
        if (trigUnit.equalsIgnoreCase("radians")){
            currentNumber= Math.cos(currentNumber);
        }
        else if(trigUnit.equalsIgnoreCase("degrees")){
            currentNumber= Math.cos(Math.toRadians(currentNumber));
        }
        this.displayNumber();
        return currentNumber;
    }

    public double inverseCosine(){
        if (trigUnit.equalsIgnoreCase("radians")){
            currentNumber= Math.acos(currentNumber);
        }
        else if(trigUnit.equalsIgnoreCase("degrees")){
            currentNumber= Math.toDegrees(Math.acos(currentNumber));
        }
        this.displayNumber();
        return currentNumber;
    }

    public double tangent(){
        if (trigUnit.equalsIgnoreCase("radians")){
            currentNumber= Math.tan(currentNumber);
        }
        else if(trigUnit.equalsIgnoreCase("degrees")){
            currentNumber= Math.tan(Math.toRadians(currentNumber));
        }
        this.displayNumber();
        return currentNumber;
    }

    public double inverseTangent(){
        if (trigUnit.equalsIgnoreCase("radians")){
            currentNumber= Math.atan(currentNumber);
        }
        else if(trigUnit.equalsIgnoreCase("degrees")){
            currentNumber= Math.toDegrees(Math.atan(currentNumber));
        }
        this.displayNumber();
        return currentNumber;
    }

    public double logBase10(){
        currentNumber = Math.log10(currentNumber);
        this.displayNumber();
        return currentNumber;
    }

    public double inverseLogBase10(){
        currentNumber= Math.pow(10,currentNumber);
        this.displayNumber();
        return currentNumber;
    }

    public double natralLog(){
        currentNumber = Math.log(currentNumber);
        this.displayNumber();
         return currentNumber;
    }

    public double inverseNaturalLog(){
        currentNumber= Math.exp(currentNumber);
        this.displayNumber();
        return currentNumber;
    }

    public double factorial(){
        double i =0;
        double j =currentNumber;
        for(i=1;i<j;i++){
            currentNumber *=i;
        }
        this.displayNumber();
        return this.currentNumber;
    }
public static void main(String[] args){
        ScientificCalculator sc = new ScientificCalculator();
        sc.changeNumber(5);
        sc.squareNumber();
        sc.squareRootNumber();
        sc.switchDisplayMode();
        sc.switchDisplayMode("binary");
        sc.switchUnitsMode();
        sc.switchUnitsMode("degrees");
        sc.changeNumber(90);
        sc.sine();
        sc.inversesine();
        sc.clearDisplay();
        sc.changeNumber(180);
        sc.cosine();
        sc.inverseCosine();
        sc.changeNumber(45);
        sc.tangent();
        sc.inverseTangent();
        sc.changeNumber(10);
        sc.factorial();
        sc.switchSign();
        sc.absoluteValue();
        sc.changeNumber(256);
        sc.percent(64);

}






}
