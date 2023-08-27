package coordinate;

import coordinate.view.CoordinateConsole;
import coordinate.view.CoordinateInput;
import coordinate.view.CoordinateOutput;

public class Main {
    public static void main(String[] args) {
        CoordinateInput in = new CoordinateInput();
        CoordinateOutput out = new CoordinateOutput();

        CoordinateConsole console = new CoordinateConsole(in, out);
        console.start();
    }
}
