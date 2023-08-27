package rentcompany;

public class Sonata implements Car {
    private final int tripDistance;
    private final static int distancePerLiter = 10;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }

    @Override
    public double getChargeQuantity() {
        return (double) tripDistance / distancePerLiter;
    }
}
