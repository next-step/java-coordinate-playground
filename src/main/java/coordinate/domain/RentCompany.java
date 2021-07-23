package coordinate.domain;

import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");

    //List, null this(), factory
    private List<Car> carList;

    RentCompany() {
        this(null);
    }
    RentCompany(List<Car> carList) {
        this.carList = carList;
    }

    static RentCompany create() {
        return new RentCompany();
    }

    //list.add(3); //값 추가
    //list.add(null); //null값도 add가능
    //list.add(1,10); //index 1뒤에 10 삽입 -- 함부로 ㄴㄴ

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public String generateReport() {
        return carList.stream()
                .map(car -> car.toReport())
                .collect(Collectors.joining(NEWLINE));
    }
}
