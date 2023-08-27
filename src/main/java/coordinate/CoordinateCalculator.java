package coordinate;

public class CoordinateCalculator {
    public static double calculateLength(Coordinate coor1, Coordinate coor2) {
        return Math.sqrt(
                Math.pow(coor1.getY() - coor2.getY(), 2.0)
                + Math.pow(coor1.getX() - coor2.getX(), 2.0)
        );
    }
}
