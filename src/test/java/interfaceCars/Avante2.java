package interfaceCars;

public class Avante2 extends Car2 {
    private static final double DISTANCE_PER_LITER = 15;
    private final double tripDistance;

    public Avante2(double tripDistance) {
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