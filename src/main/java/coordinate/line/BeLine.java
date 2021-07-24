package coordinate.line;

public class BeLine {

    private final BeCoordinate first;
    private final BeCoordinate second;

    public BeLine(BeCoordinate first, BeCoordinate second) {
        this.first = first;
        this.second = second;
    }

    public double askDistance() {
        return Math.sqrt(askXDistance() * askXDistance()
                        + askYDistance() * askYDistance());
    }

    private int askXDistance() {
        return first.getXValue() - second.getXValue();
    }

    private int askYDistance() {
        return first.getYValue() - second.getYValue();
    }
    
}
