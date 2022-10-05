package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String CAR_NAME_DELEMITER = ",";
    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_TRIAL_MESSAGE = "시도할 횟수는 몇회인가요";

    private static final Scanner scanner = new Scanner(System.in);


    public static List<String> getCarNames() {
        System.out.println(INPUT_CAR_NAMES_MESSAGE);
        String carNames = scanner.nextLine();
        return splitCarName(carNames);
    }

    private static List<String> splitCarName(String carNames) {
        return Arrays.asList(carNames.split(CAR_NAME_DELEMITER));
    }

    public static int getTrialCount() {
        System.out.println(INPUT_TRIAL_MESSAGE);
        return scanner.nextInt();
    }
}
