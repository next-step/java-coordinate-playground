package coordinate.domain;

public class Avante extends Car {

    private final int distance;

    Avante(int distance){
        this.distance = distance;
    }

    @Override
    String getName() {
        return "Avante :";
    }

    @Override
    int getDistance() {
        return distance;
    }

    @Override
    int getDistancePerLiter() {
        return 15;
    }
}
