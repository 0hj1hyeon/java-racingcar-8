package racingcar.validation;

public class Validator {

    public static void validateCarName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름은 공백이거나 비어있을 수 없습니다.");
        }

    }
}
