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


    @DisplayName("isNot")
    @Test
    void isBeverage() {
        CaffeineBev beverage = new Tea();

        //downCasting instanceOf
        if (beverage instanceof Tea) {
            Tea tea = (Tea)beverage;
        }
        if (beverage instanceof Coffee) {
            Coffee coffee = (Coffee)beverage;
        }
    }


}
