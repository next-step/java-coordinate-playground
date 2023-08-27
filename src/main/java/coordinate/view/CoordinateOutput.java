package coordinate.view;

import coordinate.domain.CoordinateCalculateResult;
import coordinate.domain.CoordinatePlane;

public class CoordinateOutput {
    public void requestCoordinates() {
        System.out.println("좌표를 입력하세요.");
    }

    public void printCoordinatePlane(CoordinatePlane coordinatePlane) {
        System.out.println(coordinatePlane.toString());
    }


    public void printResult(CoordinateCalculateResult result) {
        System.out.println(result.toString());
    }
}
