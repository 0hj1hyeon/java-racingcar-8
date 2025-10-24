package racingcar.validation;

public class Validator {

    public static void validateCarName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름은 공백이거나 비어있을 수 없습니다.");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }

    }

    public static void validateTryCount(String input) {

        int count;
        try {
            count = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }

        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1회 이상이어야 합니다.");
        }

    }

}
