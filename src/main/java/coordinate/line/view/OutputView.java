package coordinate.line.view;

import coordinate.line.BeCoordinates;

public class OutputView {

    OutputView() {
    }

    public static final void showInput(BeCoordinates soloOrLine) {
        System.out.print(String.format("%s\n", soloOrLine.makeStrings()));
    }

    public static final void showBoard(BeCoordinates soloOrLine) {

    }

    public static final void showDistance(BeCoordinates soloOrLine) {
        System.out.print("\n두 점 사이의 거리는 " + soloOrLine.askDistance());
    }


}
