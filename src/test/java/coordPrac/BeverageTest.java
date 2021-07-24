package coordPrac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @DisplayName("addToList")
    @Test
    void addToBevList() {
        List<CaffeineBev> caffeineList = new ArrayList<>();
        caffeineList.add(new Coffee());
        caffeineList.add(new Tea());
        assertThat(caffeineList.size()).isEqualTo(2);
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
