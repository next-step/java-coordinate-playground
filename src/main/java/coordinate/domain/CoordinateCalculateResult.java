package coordinate.domain;

public class CoordinateCalculateResult {
    private CalculateType calculateType;
    double result;

    public CoordinateCalculateResult(CalculateType calculateType, double result) {
        this.calculateType = calculateType;
        this.result = result;
    }

    @Override
    public String toString() {
        if (calculateType == CalculateType.LINE) {
            return String.format("두 점 사이의 거리는 %f", result);
        }
        return String.format("사각형 넓이는 %d", (int) result);
    }

    public double getResult() {
        return this.result;
    }
}
