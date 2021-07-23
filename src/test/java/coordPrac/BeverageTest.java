package coordPrac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class BeverageTest {

    @DisplayName("isCoffeeOrNot")
    @Test
    void isCoffee() {
        CaffeineBev cafeLatte = new Coffee();
        CaffeineBev milkTea = new Tea();
        assertThat(cafeLatte.isCoffee()).isTrue();
        assertThat(milkTea.isCoffee()).isFalse();

    }


}
