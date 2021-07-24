package coordinate.line;

public class BeCoordinate {

    private final BeX xVal;
    private final BeY yVal;

    public BeCoordinate(String xVal, String yVal) {
        this.xVal = new BeX(xVal);
        this.yVal = new BeY(yVal);
    }

    public int getXVal() {
        return xVal.getValue();
    }

    public int getYVal() {
        return yVal.getValue();
    }
}
