import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
