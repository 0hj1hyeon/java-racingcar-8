package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.view.IOView;

public class GameExecutor {

    private final IOView view;

    public GameExecutor(IOView view) {
        this.view = view;
    }

    public void startRace(RacingGame game, int tryCount) {
        view.printResultMessage();
        for (int i = 0; i < tryCount; i++) {
            game.raceOneTurn();
            view.printRaceStatus(game.getCars());
        }
    }

    public void printWinners(RacingGame game) {
        view.printWinners(game.determineWinners());
    }
}
