package coordinate.line;

public class BeDoubleCoord extends BeCoordinates {

    private final BeCoordinate first;
    private final BeCoordinate second;

    public BeDoubleCoord(BeCoordinate first, BeCoordinate second){
        this.first = first;
        this.second = second;
    }

    public int getXValue(BeCoordinate beCoordinate) {
        return beCoordinate.getXValue();
    }

    public int getYValue(BeCoordinate beCoordinate) {
        return beCoordinate.getYValue();
    }
    
    
    @Override
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

    @Override
    public String makeStrings() {
        return this.first.toString() + "-" + this.second.toString();
    }
    
}
