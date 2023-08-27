package coordinate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateCalculatorTest {
    @Test
    void 두_점_사이의_거리를_구한다() {
        Coordinate coor1 = new Coordinate(0, 0);
        Coordinate coor2 = new Coordinate(5, 5);
        double result = CoordinateCalculator.calculateLength(coor1, coor2);

        assertEquals(7.071, result, 0.001);
    }
}
