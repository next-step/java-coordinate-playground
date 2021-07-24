package coordinate.line.view;

import coordinate.line.BeCoordinates;

public class OutputView {
    
    OutputView(){}
    
    public static final void showInput(BeCoordinates soloOrLine) {
        System.out.print(String.format("%s", soloOrLine.makeStrings()));
    }

    public static final void showBoard() {
        System.out.print(showYAxis());
        System.out.print(showXAxis());
        
    }

    public static final void showDistance(BeCoordinates soloOrLine) {
        System.out.print("두 점 사이의 거리는"+ soloOrLine.askDistance());
    }

    private static final String showYAxis() {
        String result = null;
        for (int i = 24; i >= 2 ; i -=2 ) {
            result += i +"|\n|\n";
        }
        return result;
    }

    private static final String showXAxis() {
        StringBuffer sb = new StringBuffer();
        sb.append(" +");
        for (int i = 0; i < 24; i++) {
            sb.append("-");
        }
        for (int i = 0; i <=24; i+= 2) {
            sb.append(String.valueOf(i) +" ");
        }
        return sb.toString();
    }
}
