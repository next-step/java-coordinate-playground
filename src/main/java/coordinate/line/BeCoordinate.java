package coordinate.line;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BeCoordinate {

    private final Set<BeDot> setOfBeDots;

    public BeCoordinate(String xVal, String yVal) {
        this.setOfBeDots = makeBeDots(xVal, yVal);
    }

    private Set<BeDot> makeBeDots(String xVal, String yVal) {
        return new HashSet<>(Arrays.asList(new BeDot(xVal), new BeDot(yVal)));
    }
}
