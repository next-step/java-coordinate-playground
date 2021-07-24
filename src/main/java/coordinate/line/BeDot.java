package coordinate.line;

public class BeDot{

    private int value;

    public BeDot(String value) {
       this.value = BeDotFactory.makeDot(value);
    }

    public int getValue() {
        return value;
    }
}
