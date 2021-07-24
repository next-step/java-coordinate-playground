package coordinate.domain;

abstract class Car {

    abstract String getName();

    abstract int getDistance();

    //연비
    abstract int getDistancePerLiter();

    // not abstract, 구현체
    double putLiters() {
        return getDistance() / getDistancePerLiter();
    }
}

