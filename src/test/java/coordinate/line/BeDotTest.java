package coordinate.line;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BeDotTest {

    @DisplayName("Is OK Dot")
    @ParameterizedTest
    @ValueSource(strings={"0", "24"})
    void is_BeDot(String value) {
        assertThat(new BeDot(value)).isInstanceOf(BeDot.class);
    }
}
