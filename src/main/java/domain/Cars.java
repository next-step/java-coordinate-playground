package domain;

import util.RandomNumberGenerator;

import java.util.*;

public class Cars {
    public final List<Car> cars;
    private static final String DUPLICATED_NAME = "자동차이름은 중복될 수 없습니다.";

    public Cars(List<String> carsNames) throws IllegalArgumentException{
        cars = new ArrayList<>();
        for (String carName : carsNames) {
            cars.add(new Car(carName));
        }
        isDuplicate(carsNames);
    }

    private void isDuplicate(List<String> carsNames) {
        if(carsNames.size() != carsNames.stream().distinct().count()){
            throw new IllegalArgumentException(DUPLICATED_NAME);
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

    public Map<String,Integer> getRacingResult(){
        Map<String,Integer> racingRecord = new LinkedHashMap<>();
        for(Car car : cars){
            racingRecord.put(car.getCarName(),car.getPosition());
        }
        return racingRecord;
    }

}
