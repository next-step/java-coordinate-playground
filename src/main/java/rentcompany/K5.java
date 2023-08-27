package rentcompany;

public class K5 implements Car {
    private final int tripDistance;
    private final static int distancePerLiter = 13;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public String getName() {
        return "K5";
    }

    @Override
    public double getChargeQuantity() {
        return (double) tripDistance / distancePerLiter;
    }
}
