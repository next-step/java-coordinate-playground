import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {


    @Test
    public void 자동차_전진_테스트() throws Exception {
        //given
        Car car = new Car("CarA");
        //when
        car.move(4);
        
        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }
    @Test
    public void 자동차_정지_테스트() throws Exception {
        //given
        Car car = new Car("CarA");
        //when
        car.move(3);

        //then
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "longName"})
    public void 이름_길이_테스트(String validName){
        assertThatThrownBy(()->
            new Car(validName)
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[Error] 자동차 이름은 1자 이상, 5자 이하여야 합니다.");
    }
}
