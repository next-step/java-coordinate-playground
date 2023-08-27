package coordinate.view;

import coordinate.domain.CoordinatePlane;

public class CoordinateOutput {
    public void requestCoordinates() {
        System.out.println("좌표를 입력하세요.");
    }

    public void printCoordinatePlane(CoordinatePlane coordinatePlane) {
        System.out.println(coordinatePlane.toString());
    }

    public void printLineLength(double lineLength) {
        System.out.printf("두 점 사이 거리는 %f%n", lineLength);
    }
}
