package domain;

import java.util.Objects;

public class Car {
    private static final int STARTING_POSITION = 0;
    private static final int MOVE_LIMIT = 4;
    private static final String NAME_ARGUMENTS = "[Error] 자동차 이름은 1자 이상, 5자 이하여야 합니다.";
    private String name;
    private int position;

    public Car(String name) throws IllegalArgumentException{
        validate(name);
        this.name = name;
        this.position = STARTING_POSITION;
    }

    private void validate(String name) {
        isValidLength(name);
        isNotEmpty(name);
    }

    private void isNotEmpty(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(NAME_ARGUMENTS);
        }
    }

    private void isValidLength(String name) {
        if (name.length() >= 5) {
            throw new IllegalArgumentException(NAME_ARGUMENTS);
        }
    }

    public void move(int number) {
        if (isMovable(number)) {
            position++;
        }
    }

    private boolean isMovable(int number) {
        return number >= MOVE_LIMIT;
    }

    public int getPosition() {
        return this.position;
    }

    public String getCarName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    public boolean isMaxPosition(int maxPosition) {
        return this.position == maxPosition;
    }

    public int maxPosition(int maxPosition) {
        if(maxPosition<this.position){
            return this.position;
        }
        return maxPosition;
    }
}
