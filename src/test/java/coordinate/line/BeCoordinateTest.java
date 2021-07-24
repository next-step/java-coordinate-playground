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
        BeCoordinate beCoordinate = new BeCoordinate(xVal, yVal);
        assertThat(beCoordinate).isInstanceOf(BeCoordinate.class);
        assertThat(beCoordinate.getXValue()).isEqualTo(Integer.parseInt(xVal));
        assertThat(beCoordinate.getYValue()).isEqualTo(Integer.parseInt(yVal));
    }

}
