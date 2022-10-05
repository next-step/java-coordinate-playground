package domain;

public class Car {
    private static final int STARTING_POSITION = 0;
    private static final int MOVE_LIMIT = 4;
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = STARTING_POSITION;
    }

    public void move(int number) {
        if(isMovable(number)) {
            position++;
        }
    }

    private boolean isMovable(int number) {
        return number >= MOVE_LIMIT;
    }

    public int getPosition(){
        return this.position;
    }
}
