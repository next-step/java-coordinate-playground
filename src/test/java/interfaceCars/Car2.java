package interfaceCars;

public abstract class Car2 implements CarInterface {
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}