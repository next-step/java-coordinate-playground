package coordinate.domain;

abstract class Car {

    //new Car(int)을 super construct로 하면 오류

    abstract String getName();

    abstract int getDistance();

    //연비

    abstract int getDistancePerLiter();
    // not abstract, 구현체
    double putLiters() {
        return getDistance() / getDistancePerLiter();
    }

    public String toReport() {
        return getName() + putLiters() + "리터";
    }
}
// "Sonata : 15리터"
