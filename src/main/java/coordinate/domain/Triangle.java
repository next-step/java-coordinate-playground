package coordinate.domain;

import java.util.List;

public class Triangle {
    private final List<Coordinate> coordinates;

    public Triangle(List<Coordinate> coordinates) {
        if (coordinates.size() != 3) {
            throw new IllegalArgumentException();
        }
        this.coordinates = coordinates;
    }

    public double calculateArea() {
        double area = 0.5 * (
                coordinates.get(0).getX() * (coordinates.get(1).getY() - coordinates.get(2).getY()) +
                        coordinates.get(1).getX() * (coordinates.get(2).getY() - coordinates.get(0).getY()) +
                        coordinates.get(2).getX() * (coordinates.get(0).getY() - coordinates.get(1).getY())
        );
        return Math.abs(area);
    }
}
