package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.view.IOView;

public class GameExecutor {

    private final IOView view;

    public GameExecutor(IOView view) {
        this.view = view;
    }

    public void startRace(RacingGame game, int tryCount) {
        printStartMessage();

        for (int i = 0; i < tryCount; i++) {
            runOneTurn(game);
        }

        printWinners(game);
    }

    private void runOneTurn(RacingGame game) {
        game.raceOneTurn();
        view.printRaceStatus(game.getCars());
    }

    private void printStartMessage() {
        view.printResultMessage();
    }

    private void printWinners(RacingGame game) {
        view.printWinners(game.determineWinners());
    }
}