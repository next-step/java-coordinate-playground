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
        return first.getXVal() - second.getXVal();
    }

    private int askYDistance() {
        return first.getYVal() - second.getYVal();
    }
    
}
