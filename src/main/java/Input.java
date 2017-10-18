import java.util.Scanner;

/**
 * Created by luisgarcia on 4/29/17.
 */
public class Input
{
    Scanner input = new Scanner(System.in);

    public double getValue(String input)
    {
        return Double.valueOf(input);
    }

    public String getOperation(String input)
    {
        return input;
    }
}
