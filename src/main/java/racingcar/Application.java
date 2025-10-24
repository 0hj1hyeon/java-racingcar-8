package racingcar;

import racingcar.controller.GameExecutor;
import racingcar.controller.GameSetupProcessor;
import racingcar.controller.RacingGameController;
import racingcar.view.IOView;

public class Application {
    public static void main(String[] args) {
        RacingGameController gameController = new RacingGameController();
        gameController.run();
    }
}
