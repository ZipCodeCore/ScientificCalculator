package holland.andres;

public class ConvertToString {
    public String convert (double number) {
        boolean infinite = Double.isInfinite(number);
        if (infinite) {
            return "Err";
        }
        return String.valueOf(number);
    }
}
