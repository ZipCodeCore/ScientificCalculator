package holland.andres;

public class ConvertToDouble {
    public double convert (String string) {
        if (string.equalsIgnoreCase("")) {
            return 0;
        }
        return Double.parseDouble(string);
    }
}