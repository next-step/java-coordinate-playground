package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private List<Coordinate> coordinates = new ArrayList<>();

    public Coordinates(String coordinatesStr) {
        String[] coordinateStrArr = coordinatesStr.split("-");
        for (String coordinateStr : coordinateStrArr) {
            Coordinate coordinate = new Coordinate(coordinateStr);
            coordinates.add(coordinate);
        }
    }

    public Coordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public CoordinateCalculateResult calculate() {
        if (coordinates.size() == 2) {
            return new CoordinateCalculateResult(CalculateType.LINE, calculateLength());
        }
        if (coordinates.size() == 4) {
            return new CoordinateCalculateResult(CalculateType.RECT, calculateRectArea());
        }

        return new CoordinateCalculateResult(CalculateType.TRIANGLE, calculateTriangleArea());
    }

    private double calculateTriangleArea() {
        Triangle triangle = new Triangle(coordinates);
        return triangle.calculateArea();
    }

    private double calculateLength() {
        Line line = new Line(coordinates);
        return line.calculateLength();

    }

    private int calculateRectArea() {
        Rect rect = new Rect(coordinates);
        return rect.calculateArea();
    }

    public boolean hasCoordinateAt(int x, int y) {
        return coordinates.stream()
                .anyMatch(coordinate -> coordinate.getY() == y && coordinate.getX() == x);
    }
}
