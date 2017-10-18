import java.util.Arrays;

/**
 * Created by luisgarcia on 4/29/17.
 */
public class Display
{

    private double currentNum = 0;

    public void setCurrentNum(double currentNum)
    {
        this.currentNum = currentNum;
    }

    public double getCurrentNum()
    {
        return currentNum;
    }

    public void clear()
    {
        setCurrentNum(0);
    }

    public String display()
    {
        if(Double.isNaN(currentNum))
        {
            clear();
            return "Err";
        }
        else
        {
            return String.valueOf(currentNum);
        }
    }



    private int count = 2;
    private String[] modes = {"binary", "octal", "decimal", "hexadecimal"};

    public void switchDisplayMode() {
        if (count == 3) {
            count = 0;
        } else {
            count++;
        }
    }

    public void switchDisplayMode(String mode)
    {
        this.count = Arrays.asList(modes).indexOf(mode);
    }

    public String displayCurrentMode()
    {
        return modes[count];
    }

    public String displayModeNum()
    {
        String value;
        switch (displayCurrentMode())
        {
            case "binary":
                value = Integer.toBinaryString((int)getCurrentNum());
                break;
            case "octal":
                value = Integer.toOctalString((int)getCurrentNum());
                break;
            case "decimal":
                value = display();
                break;
            case "hexadecimal":
                value = Integer.toHexString((int)getCurrentNum());
                break;
            default:
                value = display();
        }
        return value;
    }


}
