package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.CoordinateCalculateResult;
import coordinate.domain.Coordinates;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinatesTest {
    @Test
    void 두_점_사이의_거리를_구한다() {
        Coordinate coor1 = new Coordinate(1, 1);
        Coordinate coor2 = new Coordinate(6, 6);
        Coordinates coordinates = new Coordinates(List.of(coor1, coor2));
        CoordinateCalculateResult result = coordinates.calculate();

        assertEquals(7.071, result.getResult(), 0.001);
    }
}
