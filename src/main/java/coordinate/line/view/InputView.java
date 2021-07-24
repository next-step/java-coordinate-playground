package coordinate.line.view;

import coordinate.line.*;

import java.util.Scanner;

public class InputView {

    InputView(){}

    public static final BeCoordinates askInput() throws Exception {
        System.out.print("좌표를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.trim().split("");
        if (inputs.length == 2) {
            return new BeSingleCoord(new BeCoordinate(inputs[0], inputs[1]));
        }
        if (inputs.length == 4) {
            return new BeDoubleCoord(new BeCoordinate(inputs[0], inputs[1]),
                    new BeCoordinate(inputs[2], inputs[3]));
        }
        throw new IllegalArgumentException("2개 또는 4개 입력하세요");
    }

}
