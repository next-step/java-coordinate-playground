package coordinate.domain;

public class Avante extends Car {

    private final int distance;

    Avante(int distance) {
        this.distance = distance;
    }

    @Override
    String getName() {
        return "Avante : ";
    }

    @Override
    int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return getName() +
                Double.toString(getDistancePerLiter()) + "리터";
    }

    @Override
    int getDistancePerLiter() {
        return 15;
    }

}
