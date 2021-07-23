package coordinate.domain;

public class Sonata extends Car {

    private final int distance;

    Sonata(int distance){
        this.distance = distance;
    }

    @Override
    String getName() {
        return "Sonata :";
    }

    @Override
    int getDistance() {
        return distance;
    }

    @Override
    int getDistancePerLiter() {
        return 10;
    }
}
