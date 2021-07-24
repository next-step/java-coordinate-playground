package coordinate.line;

public class BeSingleCoord extends BeCoordinates {

    private final BeCoordinate solo;

    public BeSingleCoord(BeCoordinate solo) {
        this.solo = solo;
    }

    public int getXValue() {
        return solo.getXValue();
    }

    public int getYValue() {
        return solo.getYValue();
    }

    @Override
    public double askDistance() {
        return 0;
    }

    @Override
    public String makeStrings() {
        return this.solo.toString();
    }
}
