package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public final List<Car> cars;

    public Cars(List<String> carsNames) {
        cars = new ArrayList<>();
        for (String carName : carsNames) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
