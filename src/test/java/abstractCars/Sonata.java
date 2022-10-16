package abstractCars;

public class Sonata extends Car {
    private final String name = "Sonata";
    private final double tripDistance ;
    private static final double DISTANCE_PER_LITER = 10;

    public Sonata(double i) {
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
