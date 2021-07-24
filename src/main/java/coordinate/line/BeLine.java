package coordinate.line;

public class BeLine {

    private final BeCoordinate first;
    private final BeCoordinate second;

    public BeLine(BeCoordinate first) {
        this.first = first;
        this.second = null;
    }

    public BeLine(BeCoordinate first, BeCoordinate second) {
        this.first = first;
        this.second = second;
    }

    public double askDistance() {
        if (second != null) {
            return Math.sqrt(askXDistance() * askXDistance()
                    + askYDistance() * askYDistance());
        }
        return 0;
    }

    private int askXDistance() {
        return first.getXValue() - second.getXValue();
    }

    private int askYDistance() {
        return first.getYValue() - second.getYValue();
    }
    

    @Override
    public String toString() {
        if (second != null) {
            return first.toString() + "-" + second.toString();
        }
        return first.toString();
    }
}
