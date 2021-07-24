package coordinate.line;

import coordinate.line.view.InputView;
import coordinate.line.view.OutputView;

public class CoordinateRunner {
    public static void main(String[] args) throws Exception {

        BeCoordinates beCoordinates = InputView.askInput();
        OutputView.showInput(beCoordinates);
        if (beCoordinates instanceof BeDoubleCoord) {
            OutputView.showLineBoard((BeDoubleCoord) beCoordinates);
        }
        if (beCoordinates instanceof BeSingleCoord) {
            OutputView.showSoloBoard((BeSingleCoord) beCoordinates);
        }
        OutputView.showDistance(beCoordinates);

    }
}
