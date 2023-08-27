package rentcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private static final RentCompany instance = new RentCompany();
    List<Car> cars;

    private RentCompany() {
        cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return instance;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return cars.stream()
                .map(car -> String.format("%s : %d리터", car.getName(), Math.round(car.getChargeQuantity())))
                .collect(Collectors.joining("\n", "", "\n"));
    }
}
