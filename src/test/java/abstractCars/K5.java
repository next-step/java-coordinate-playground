package abstractCars;

public class K5 extends Car {
    private final String name = "K5";
    private final double tripDistance ;
    private static final double DISTANCE_PER_LITER = 13;

    public K5(double i) {
        this.tripDistance = i;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    public double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

}

