package racingcar.controller;

import racingcar.validation.Validator;

import java.util.Arrays;
import java.util.List;

public class InputParser {

    Validator validator = new Validator();

    public static List<String> parseCarNames(String inputCarNames) {
        List<String> carNames = Arrays.asList(inputCarNames.split(","));

        carNames.forEach(name -> Validator.validateCarName(name.trim()));

        return carNames;
    }

    public static int parseTryCount(String inputTryCount) {

        Validator.validateTryCount(inputTryCount);
        return Integer.parseInt(inputTryCount);

    }

}
