import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    
    @ParameterizedTest
    @CsvSource(value = {"0:CarA", "1:CarB", "2:CarC"}, delimiter = ':')
    public void 자동차_생성_테스트(int input,String expected){
        //given
        Cars cars = new Cars(Arrays.asList("CarA","CarB","CarC"));
        List<Car> result = cars.getCars();
        //when
        String value = result.get(input).getCarName();
        //then
        assertThat(value).isEqualTo(expected);
     
    }

    @Test
    void 자동차_전진_테스트(){
        Cars cars = new Cars(Arrays.asList("CarA","CarB","CarC"));


    }
}
