package coordinate.domain;

public class Position {
    private final int position;

    public Position(int position) {
        if (position < 1 || position > 24) {
            throw new IllegalArgumentException();
        }

        this.position = position;
    }

    public int get() {
        return this.position;
    }
}
