package abstractCars;

import java.util.List;

import java.util.ArrayList;

public class RentCompany {
    List<Car> cars = new ArrayList<>();
    public static final String SEPARATOR = " : ";
    public static final String NEWLINE = System.lineSeparator();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuffer sb = new StringBuffer();
        for(Car car : cars){
           sb.append(car.getName()).append(SEPARATOR).append((int)car.getChargeQuantity()).append("리터").append(NEWLINE);
        }
        return sb.toString();
    }
}
