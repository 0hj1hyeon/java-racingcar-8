package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.view.IOView;

public class RacingGameController {
    private final IOView view = new IOView();
    private final GameSetupProcessor setupProcessor = new GameSetupProcessor(view);
    private final GameExecutor executor = new GameExecutor(view);

    public void run(){
        RacingGame game = setupProcessor.setupGame();
        int tryCount = setupProcessor.inputTryCount();
        executor.startRace(game, tryCount);
        executor.printWinners(game);
    }
}
