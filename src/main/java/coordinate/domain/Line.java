package coordinate.domain;

import java.util.List;

public class Line {
    private final List<Coordinate> coordinates;

    public Line(List<Coordinate> coordinates) {
        if (coordinates.size() != 2) {
            throw new IllegalArgumentException();
        }
        this.coordinates = coordinates;
    }

    public double calculateLength() {
        Coordinate coor1 = coordinates.get(0);
        Coordinate coor2 = coordinates.get(1);

        return Math.sqrt(
                Math.pow(coor1.getY() - coor2.getY(), 2.0)
                        + Math.pow(coor1.getX() - coor2.getX(), 2.0)
        );
    }
}
