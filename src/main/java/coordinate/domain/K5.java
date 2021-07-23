package coordinate.domain;

public class K5 extends Car {

    private final int distance;

    K5(int distance) {
        this.distance = distance;
    }

    @Override
    String getName() {
        return "K5 :";
    }

    @Override
    int getDistance() {
        return distance;
    }

    @Override
    int getDistancePerLiter() {
        return 13;
    }
}
