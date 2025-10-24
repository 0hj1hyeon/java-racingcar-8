package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final List<Car> cars;

    public RacingGame(List<String> carNames) {
        List<Car> carList = new ArrayList<>();
        for (String name : carNames) {
            carList.add(new Car(name));
        }
        this.cars = carList;
    }
}
