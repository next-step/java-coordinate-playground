package coordinate;

public class Position {
    private final int position;

    public Position(int position) {
        if (position < 0 || position > 24) {
            throw new IllegalArgumentException();
        }

        this.position = position;
    }
}
