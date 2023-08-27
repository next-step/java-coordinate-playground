package coordinate;

public class Coordinate {
    private final Position yPos;
    private final Position xPos;

    public Coordinate(int y, int x) {
        this.yPos = new Position(y);
        this.xPos = new Position(x);
    }
}
