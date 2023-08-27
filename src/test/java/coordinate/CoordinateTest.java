package coordinate;

import coordinate.domain.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {
    @Test
    void 점의_좌표는_1_에서_24_만_입력_가능하다() {
        assertDoesNotThrow(() -> new Coordinate(1, 1));
        assertDoesNotThrow(() -> new Coordinate(24, 24));
        assertThrows(IllegalArgumentException.class,
                () -> new Coordinate(0, 0));
        assertThrows(IllegalArgumentException.class,
                () -> new Coordinate(25, 25));
    }
}
