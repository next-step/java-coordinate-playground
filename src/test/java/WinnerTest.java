import domain.Car;
import domain.Cars;
import domain.Winners;
import org.junit.jupiter.api.Test;
import util.BoundedRandomNumberGenerator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {


    @Test
    void findWinners(){
        Cars cars = new Cars(Arrays.asList("CarA","CarB","CarC"));
        cars.race(new BoundedRandomNumberGenerator(9, 4));

        List<Car> result = cars.getCars();
        List<Car> winners = Winners.findWinners(result);

        assertThat(winners).contains(result.get(0));
        assertThat(winners).contains(result.get(1));
        assertThat(winners).contains(result.get(2));


    }
}
