package coordinate.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Rect {
    private final List<Coordinate> coordinates;

    public Rect(List<Coordinate> coordinates) {
        List<Coordinate> sortedCoordinates = sortCoordinates(coordinates);
        if (!isValidRectangle(sortedCoordinates)) {
            throw new IllegalArgumentException();
        }
        this.coordinates = sortedCoordinates;
    }

    public int calculateArea() {
        int minX = coordinates.stream().mapToInt(Coordinate::getX).min().orElse(0);
        int maxX = coordinates.stream().mapToInt(Coordinate::getX).max().orElse(0);
        int minY = coordinates.stream().mapToInt(Coordinate::getY).min().orElse(0);
        int maxY = coordinates.stream().mapToInt(Coordinate::getY).max().orElse(0);

        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }

    private List<Coordinate> sortCoordinates(List<Coordinate> unsortedCoordinates) {
        List<Coordinate> sortedCoordinates = new ArrayList<>(unsortedCoordinates);
        sortedCoordinates.sort(Comparator.comparingInt(Coordinate::getX).thenComparingInt(Coordinate::getY));
        return sortedCoordinates;
    }

    private boolean isValidRectangle(List<Coordinate> coordinates) {
        if (coordinates.size() != 4) return false;

        int sideAB = calculateDistance(coordinates.get(0), coordinates.get(1));
        int sideBC = calculateDistance(coordinates.get(1), coordinates.get(2));
        int sideCD = calculateDistance(coordinates.get(2), coordinates.get(3));
        int sideDA = calculateDistance(coordinates.get(3), coordinates.get(0));
        int diagonalAC = calculateDistance(coordinates.get(0), coordinates.get(2));
        int diagonalBD = calculateDistance(coordinates.get(1), coordinates.get(3));

        return sidesAreEqual(sideAB, sideCD) && sidesAreEqual(sideBC, sideDA) &&
                diagonalsAreEqual(diagonalAC, diagonalBD);
    }

    private boolean sidesAreEqual(int side1, int side2) {
        return side1 == side2;
    }

    private boolean diagonalsAreEqual(int diagonal1, int diagonal2) {
        return diagonal1 == diagonal2;
    }

    private int calculateDistance(Coordinate a, Coordinate b) {
        int xDiff = a.getX() - b.getX();
        int yDiff = a.getY() - b.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
