package coordinate;

import java.util.List;

public class CoordinatePlane {
    private final List<Coordinate> coordinates;

    public CoordinatePlane(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 24; y >= 0; y--) {
            sb.append(generateRow(y));
        }
        sb.append(generateLastRow());
        return sb.toString();
    }

    private String generateRow(int y) {
        StringBuilder row = new StringBuilder();
        row.append(getYLabel(y));
        row.append(generateRowContents(y));
        row.append("\n");
        return row.toString();
    }

    private String generateRowContents(int y) {
        StringBuilder rowContents = new StringBuilder();
        for (int x = 0; x <= 24; x++) {
            rowContents.append(getSymbolForCoordinate(x, y));
        }
        return rowContents.toString();
    }

    private String getSymbolForCoordinate(int x, int y) {
        if (hasCoordinateAt(x, y)) {
            return "\t★";
        }
        return "\t ";
    }

    private String getYLabel(int y) {
        if (y % 2 == 0) {
            return String.format("%2d|", y);
        }
        return "  |";
    }

    private boolean hasCoordinateAt(int y, int x) {
        return coordinates.stream()
                .anyMatch(coordinate -> coordinate.getY() == y && coordinate.getX() == x);
    }

    private String generateLastRow() {
        StringBuilder lastRow = new StringBuilder();
        lastRow.append("  |-----------------------------------------------------------------------------------------------------\n");
        lastRow.append("   ");

        for (int x = 0; x <= 24; x++) {
            lastRow.append(getTabWithNumber(x));
        }

        return lastRow.toString();
    }

    private String getTabWithNumber(int x) {
        StringBuilder tabWithNumber = new StringBuilder();
        tabWithNumber.append("\t");
        if (x % 2 == 0) {
            tabWithNumber.append(x);
        }
        return tabWithNumber.toString();
    }
}
