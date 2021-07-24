package coordinate.line;

public class BeCoordinate {

    private final BeX xVal;
    private final BeY yVal;

    public BeCoordinate(String xVal, String yVal) {
        this.xVal = new BeX(xVal);
        this.yVal = new BeY(yVal);
    }

    //parameter BeX, BeY, method use superclass BeDot
    public int getXValue() {
        return xVal.getValue();
    }

    public int getYValue() {
        return yVal.getValue();
    }

    //toString can handle int
    @Override
    public String toString() {
        return "(" + getXValue() + "," + getYValue() + ')';
    }
}
