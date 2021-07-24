package coordinate.domain;

abstract class Car {
    private static final String NEWLINE = System.getProperty("line.separator");

    abstract String getName();

    abstract int getDistance();

    //연비
    abstract int getDistancePerLiter();

    // not abstract, 구현체
    int putLiters() {
        return getDistance() / getDistancePerLiter();
    }

    @Override
    public String toString() {
        return getName() +
                Integer.toString(putLiters()) + "리터" + NEWLINE;
    }
}

