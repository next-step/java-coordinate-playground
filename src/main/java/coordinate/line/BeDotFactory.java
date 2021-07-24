package coordinate.line;

public class BeDotFactory {

    public static String makeDot(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("No Input");
        }
        if (!value.matches("^[0-9]+$")) {
            throw new IllegalArgumentException("Not a Number Format");
        }
        if (Integer.parseInt(value) < 0 || Integer.parseInt(value) > 24) {
            throw new IllegalArgumentException("Not in Dot Range");
        }
        return value;
    }
}
