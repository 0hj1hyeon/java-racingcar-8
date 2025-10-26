package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.view.IOView;

import java.util.List;

public class GameSetupProcessor {

    private final IOView view;

    public GameSetupProcessor(IOView view) {
        this.view = view;
    }

    public RacingGame setupGame() {
        List<String> carNames = InputParser.parseCarNames(view.inputCarNames());
        return new RacingGame(carNames);
    }

    public int inputTryCount() {
        return InputParser.parseTryCount(view.inputTryCount());
    }
}
