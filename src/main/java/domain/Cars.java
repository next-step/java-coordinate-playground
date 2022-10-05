package domain;

import util.BoundedRandomNumberGenerator;
import util.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Collections;
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
        return Collections.unmodifiableList(cars);
    }

    public void race(RandomNumberGenerator numberGenerator) {
        for(Car car : cars){
            car.move(numberGenerator.generate());
        }
    }
}
