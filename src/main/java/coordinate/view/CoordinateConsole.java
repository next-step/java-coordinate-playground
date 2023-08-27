package coordinate.view;

import coordinate.domain.CoordinatePlane;
import coordinate.domain.Coordinates;

public class CoordinateConsole {
    private CoordinateInput in;
    private CoordinateOutput out;

    public CoordinateConsole(CoordinateInput in, CoordinateOutput out) {
        this.in = in;
        this.out = out;
    }

    public void start() {
        out.requestCoordinates();
        String coordinatesStr = in.receiveCoordinates();

        Coordinates coordinates = new Coordinates(coordinatesStr);
        CoordinatePlane coordinatePlane = new CoordinatePlane(coordinates);
        out.printCoordinatePlane(coordinatePlane);

        double lineLength = coordinates.calculateLength();
        out.printLineLength(lineLength);
    }
}
