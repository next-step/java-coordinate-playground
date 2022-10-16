package interfaceCars;

public class Sonata2 extends Car2 {
    private static final double DISTANCE_PER_LITER = 10;
    private final double tripDistance;

    public Sonata2(double tripDistance) {
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