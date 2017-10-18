/**
 * Created by luisgarcia on 4/29/17.
 */
public class DisplayOperation
{
//    public static final String ADD = "add";
    private Display displayer = new Display();
    private Calculator calc = new Calculator();

    public void setDisplay(double value)
    {
        displayer.setCurrentNum(value);
    }

    public void clear()
    {
        displayer.clear();
    }

    public String display()
    {
        return displayer.display();
    }



    public double add(double input)
    {
        double d = calc.add(displayer.getCurrentNum(),input);
        displayer.setCurrentNum(d);
        return displayer.getCurrentNum();
    }

    public double divide(double input)
    {
        double d = calc.divide(displayer.getCurrentNum(), input);
        displayer.setCurrentNum(d);
        return displayer.getCurrentNum();
    }

    public double subtract(double input)
    {
        double val = calc.subtract(displayer.getCurrentNum(), input);
        displayer.setCurrentNum(val);
        return displayer.getCurrentNum();
    }

    public double multiply(double input)
    {
        double val = calc.multiply(displayer.getCurrentNum(), input);
        displayer.setCurrentNum(val);
        return displayer.getCurrentNum();
    }

    public double square()
    {
        double val = calc.square(displayer.getCurrentNum());
        displayer.setCurrentNum(val);
        return displayer.getCurrentNum();
    }

    public double squareRoot()
    {
        double val = calc.squareRoot(displayer.getCurrentNum());
        displayer.setCurrentNum(val);
        return displayer.getCurrentNum();
    }

    public double variableExp(double input)
    {
        double val = calc.variableExp(displayer.getCurrentNum(), input);
        displayer.setCurrentNum(val);
        return displayer.getCurrentNum();
    }

    public double inverse()
    {
        double val = calc.inverse(displayer.getCurrentNum());
        displayer.setCurrentNum(val);
        return displayer.getCurrentNum();
    }

    public double invert()
    {
        double val = calc.invert(displayer.getCurrentNum());
        displayer.setCurrentNum(val);
        return displayer.getCurrentNum();
    }




//    public double operation(String op, double x)
//    {
//        if(op.equalsIgnoreCase("ADD"))
//        {
//            return add(x);
//        }
//        else if(op.equalsIgnoreCase("DIVIDE"))
//        {
//            return divide(x);
//        }
//
//        return displayer.getCurrentNum();
//
//    }

    public String getMode()
    {
        return displayer.displayCurrentMode();
    }

    public void setMode(String mode)
    {
        displayer.switchDisplayMode(mode);
    }

    public String displayModeNum()
    {
        return displayer.displayModeNum();
    }





}
