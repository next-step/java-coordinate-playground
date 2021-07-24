package coordinate.line;

public class BeSingleCoord extends BeCoordinates {

    private final BeCoordinate solo;

    public BeSingleCoord(BeCoordinate solo) {
        this.solo = solo;
    }

    public BeCoordinate getSolo() {
        return solo;
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
