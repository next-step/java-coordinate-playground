package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    public static List<String> findWinners(List<Car> cars) {
               return toString(findWinners(cars, maxPosition(cars)));
    }

    private static List<Car> findWinners(List<Car> cars, int maxPosition) {
        return cars.stream()
                .filter(car -> car.isMaxPosition(maxPosition))
                .collect(Collectors.toList());
    }

    private static int maxPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = car.maxPosition(maxPosition);
        }
        return maxPosition;
    }

    private static List<String> toString(List<Car> cars){
        List<String> winners = new ArrayList<>();
        for(Car car : cars){
            winners.add(car.getCarName());
        }
        return winners;
    }

}
