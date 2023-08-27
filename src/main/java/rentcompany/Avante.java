package rentcompany;

public class Avante implements Car {
    private final int tripDistance;
    private final static int distancePerLiter = 15;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public String getName() {
        return "Avante";
    }

    @Override
    public double getChargeQuantity() {
        return (double) tripDistance / distancePerLiter;
    }
}

