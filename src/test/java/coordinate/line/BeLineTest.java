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
        assertThat(new BeLine(first, second)).isInstanceOf(BeLine.class);
    }
    
    @DisplayName("Ask Distance")
    @Test
    void can_askDistance() {
        BeCoordinate first = new BeCoordinate("10", "10");
        BeCoordinate second = new BeCoordinate("14", "15");
        BeLine beLine = new BeLine(first, second);
        assertThat(beLine.askDistance()).isEqualTo(6.403124, offset(0.00009));
    }
}
