package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.List;

public class IOView {
    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public String inputTryCount(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Console.readLine();
    }

    public void printResultMessage() {
        System.out.println("\n실행 결과");
    }

    public void printRaceStatus(List<Car> cars){
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + repeatHyphen(car.getPosition()));
        }
        System.out.println();
    }

    private String repeatHyphen(int position) {
        return "-".repeat(position);
    }

    public void printWinners(List<String> winnerNames) {
        String result = String.join(", ", winnerNames);
        System.out.println("최종 우승자 : " + result);
    }

}
