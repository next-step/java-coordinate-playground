package coordinate.line;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BeCoordinateTest {

    @DisplayName("Is OK Coordinate")
    @ParameterizedTest
    @CsvSource(value={"0:0", "24:24", "8:24"}, delimiter=':')
    void is_BeCoordinate(String xVal, String yVal) {
        assertThat(new BeCoordinate(xVal,yVal)).isInstanceOf(BeCoordinate.class);
    }

}
