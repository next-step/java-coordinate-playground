package coordinate.line;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class BeLineTest {

    @DisplayName("Is OK Line")
    @Test
    void is_BeLine() {
        BeCoordinate first = new BeCoordinate("3", "4");
        BeCoordinate second = new BeCoordinate("5", "4");
        assertThat(new BeDoubleCoord(first, second)).isInstanceOf(BeDoubleCoord.class);
    }
    
    @DisplayName("Ask Distance")
    @Test
    void can_askDistance() {
        BeCoordinate first = new BeCoordinate("10", "10");
        BeCoordinate second = new BeCoordinate("14", "15");
        BeDoubleCoord line = new BeDoubleCoord(first, second);
        assertThat(line.askDistance()).isEqualTo(6.403124, offset(0.00009));
        assertThat(line.makeStrings()).isEqualTo("(10,10)-(14,15)");
    }

    @DisplayName("A Line Without Second")
    @Test
    void is_LineWithoutSecond() {
        BeCoordinate first = new BeCoordinate("14", "15");
        BeSingleCoord solo = new BeSingleCoord(first);
        assertThat(solo.askDistance()).isEqualTo(0);
        assertThat(solo.makeStrings()).isEqualTo("(14,15)");
    }
}
