package coordinate.line;

import coordinate.line.view.InputView;
import coordinate.line.view.OutputView;

public class CoordinateRunner {
    public static void main(String[] args){

        BeCoordinates beCoordinates = InputView.askInput();
        OutputView.showInput(beCoordinates);
        OutputView.showBoard(beCoordinates);
        OutputView.showDistance(beCoordinates);

    }
}
