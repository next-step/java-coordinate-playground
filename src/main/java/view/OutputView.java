package view;

import domain.Car;
import domain.CarStatusDTO;
import domain.RacingRecordDTO;

import java.util.List;

public class OutputView {
    private static final String RACING_RESULT_MESSAGE = "실행 결과";
    private static final String WINNER_NAME_DELIMITER = ",";
    private static final String WINNER_MESSAGE = "가 최종 우승했습니다";


    public static void printRacingResultMsg() {
        System.out.println(RACING_RESULT_MESSAGE);
    }

    public static void printRacingRecords(RacingRecordDTO racingRecords){
        for (CarStatusDTO record : racingRecords.getRacingRecord()){
            System.out.println(buildStatusView(record));
        }
        System.out.println();
    }

    private static StringBuilder buildStatusView(CarStatusDTO record) {
        StringBuilder stringBuilder = new StringBuilder(record.getCarName() + ":");
        for (int i = 0; i < record.getPosition(); i++) {
                stringBuilder.append("_");
        }
        return stringBuilder;
    }

    public static void printWinnerNames(List<String> result) {
        String winners = String.join(WINNER_NAME_DELIMITER,result);
        System.out.println(winners + WINNER_MESSAGE);
    }
}
