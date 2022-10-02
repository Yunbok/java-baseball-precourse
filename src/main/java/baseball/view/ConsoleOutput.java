package baseball.view;

public class ConsoleOutput {

    private ConsoleOutput() {

    }

    public static void printResult(final String message) {
        System.out.println(message);
    }

    public static void printGameEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
