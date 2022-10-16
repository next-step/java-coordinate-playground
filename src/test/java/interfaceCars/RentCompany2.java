package interfaceCars;

import java.util.List;

import java.util.ArrayList;

public class RentCompany2 {
    List<Car2> cars = new ArrayList<>();
    public static final String SEPARATOR = " : ";
    public static final String NEWLINE = System.lineSeparator();

    public static RentCompany2 create() {
        return new RentCompany2();
    }

    public void addCar(Car2 car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuffer sb = new StringBuffer();
        for(Car2 car : cars){
            sb.append(car.getName()).append(SEPARATOR).append((int)car.getChargeQuantity()).append("리터").append(NEWLINE);
        }
        return sb.toString();
    }
}
