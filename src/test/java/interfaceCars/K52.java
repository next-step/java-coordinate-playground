package interfaceCars;

public class K52 extends Car2 {
    private static final double DISTANCE_PER_LITER = 13;
    private final double tripDistance;

    public K52(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    public double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    public double getTripDistance() {
        return tripDistance;
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}