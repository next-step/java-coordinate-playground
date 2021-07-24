package coordinate.line.view;

import coordinate.line.BeCoordinate;
import coordinate.line.BeCoordinates;
import coordinate.line.BeDoubleCoord;
import coordinate.line.BeSingleCoord;

public class OutputView {

    OutputView() {
    }

    public static final void showInput(BeCoordinates soloOrLine) {
        System.out.println(String.format("%s", soloOrLine.makeStrings()));
    }

    public static final void showBoard(BeCoordinates soloOrLine) {
        if (soloOrLine instanceof BeDoubleCoord) {
            showLineBoard((BeDoubleCoord) soloOrLine);
            printXAxis();
        }
        if (soloOrLine instanceof BeSingleCoord) {
            showSoloBoard((BeSingleCoord) soloOrLine);
            printXAxis();
        }
    }
    
    private static final void showLineBoard(BeDoubleCoord line) {
        if (line.isFirstBigYValue()) {
            printUpperAxis(line.getFirst());
            printPoint(line.getFirst());
            printLowerAxis(line.getFirst(), line.getSecond().getYValue());
            printPoint(line.getSecond());
            printLowerAxis(line.getSecond(), 0);
        } else {
            printUpperAxis(line.getSecond());
            printPoint(line.getSecond());
            printLowerAxis(line.getSecond(), line.getFirst().getYValue());
            printPoint(line.getFirst());
            printLowerAxis(line.getFirst(), 0);
        }
    }

    private static final void showSoloBoard(BeSingleCoord solo) {
        printUpperAxis(solo.getSolo());
        printPoint(solo.getSolo());
        printLowerAxis(solo.getSolo(), 0);
    }

    public static final void showDistance(BeCoordinates soloOrLine) {
        System.out.println("\n두 점 사이의 거리는 " + soloOrLine.askDistance());
    }


    private static final void printUpperAxis(BeCoordinate coord) {
        for (int i = 24; i > coord.getYValue() ; i--) {
            isEvenPrintAxis(i);
        }
    }

    private static final void printXAxis() {
        System.out.println("  +" + printXLines());
        isEvenPrintXAxis();
    }

    private static String printXLines() {
        StringBuffer axis = new StringBuffer();
        for (int i = 0 ; i < 24 ; i+= 2) {
            axis.append("------");
        }
        return axis.toString();
    }

    private static void isEvenPrintAxis(int i) {
        if (i % 2 == 0) {
            System.out.println(String.format("%2d|", i));
        } else {
            System.out.println("  |");
        }
    }

    private static void isEvenPrintXAxis() {
        for (int i = 0; i <= 24; i ++) {
            if (i % 2 == 0) {
                System.out.print(String.format(" %2d   ", i));
            }
        }
    }

    private static final void printLowerAxis(BeCoordinate coord, int lower) {
        for (int i = coord.getYValue()-1; i > lower ; i--) {
            isEvenPrintAxis(i);
        }
    }

    private static final void printPoint(BeCoordinate coord) {
        if (coord.getYValue() % 2 == 0) {
            System.out.println(String.format("%2d|", coord.getYValue())
                    + printEmptySpace(coord) + "@");
        } else {
            System.out.println("  |"+ printEmptySpace(coord) + "@");
        }
    }

    private static final String printEmptySpace(BeCoordinate coord) {
        StringBuffer rightSpace = new StringBuffer();
        for (int i = 0; i < coord.getXValue() ; i++) {
            rightSpace.append("   ");
        }
        return rightSpace.toString();
    }
}