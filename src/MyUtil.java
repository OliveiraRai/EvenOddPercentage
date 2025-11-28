import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyUtil {
    public static boolean isInteger(String input) {
        return input.matches("^-?[0-9]+$");
    }
}
