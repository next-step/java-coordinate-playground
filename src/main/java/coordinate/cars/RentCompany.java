package coordinate.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private final List<Car> carList;


    public RentCompany(List<Car> carList) {
        this.carList = carList;
    }

    // extends Car, array In
    static RentCompany create() {
        ArrayList<Car> carList = new ArrayList<Car>();
        return new RentCompany(carList);
    }

    //list.add(3); //값 추가
    //list.add(null); //null값도 add가능
    //list.add(1,10); //index 1뒤에 10 삽입 -- 함부로 ㄴㄴ

    //parameter is a subClass but can be added as SuperClass
    public void addCar(Sonata car) {
        this.carList.add(car);
    }
    public void addCar(K5 car) {
        this.carList.add(car);
    }
    public void addCar(Avante car) {
        this.carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public String generateReport() {
        return carList.stream()
                .map(o -> o.toString())
                .collect(Collectors.joining());

    }

}
