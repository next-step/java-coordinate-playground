import domain.Cars;
import domain.RacingRecordDTO;
import domain.Winners;
import util.BoundedRandomNumberGenerator;
import util.RandomNumberGenerator;
import view.InputView;
import view.OutputView;

public class RacingGameController {

    private static final int MAX_BOUND = 9;
    private static final int MIN_BOUND = 0;

    public final RandomNumberGenerator randomNumberGenerator;

    public RacingGameController() {
        this.randomNumberGenerator = new BoundedRandomNumberGenerator(MAX_BOUND, MIN_BOUND);
    }

    public void playGame() {
        Cars cars = generateCars();
        int trialCount = getTrialCount();

        OutputView.printRacingResultMsg();
        for (int i = 0; i < trialCount; i++) {
            cars.race(randomNumberGenerator);
            OutputView.printRacingRecords(new RacingRecordDTO(cars.getRacingResult()));
        }

        OutputView.printWinnerNames(Winners.findWinners(cars.getCars()));
    }

    private int getTrialCount() {
        int trialCount;
        try {
            trialCount = InputView.getTrialCount();
        } catch (RuntimeException exception) {
            System.out.println("[ERROR]" + exception.getMessage() + "\n");
            return getTrialCount();
        }
        return trialCount;
    }

    private Cars generateCars() {
        Cars cars;
        try {
            cars = new Cars(InputView.getCarNames());
        } catch (RuntimeException exception) {
            System.out.println("[ERROR]" + exception.getMessage() + "\n");
            return generateCars();
        }
        return cars;
    }


}
