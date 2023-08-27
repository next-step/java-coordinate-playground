package coordinate.domain;

import java.util.Arrays;

public class Coordinate {
    private final Position yPos;
    private final Position xPos;

    public Coordinate(int y, int x) {
        this.yPos = new Position(y);
        this.xPos = new Position(x);
    }

    public Coordinate(String coordinateStr) {
        coordinateStr = coordinateStr.substring(1, coordinateStr.length()-1);
        int[] xy = Arrays.stream(coordinateStr.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        this.yPos = new Position(xy[1]);
        this.xPos = new Position(xy[0]);
    }

    public int getY() {
        return yPos.get();
    }

    public int getX() {
        return xPos.get();
    }
}
