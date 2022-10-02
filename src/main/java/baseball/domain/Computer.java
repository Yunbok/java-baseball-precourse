package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

import static baseball.constant.GameConfig.*;

public class Computer {

    private final List<Integer> answer;
    private final Score score;

    public Computer() {
        this.answer = makeAnswer();
        this.score = new Score();

    }

    public Score compareAnswers(final List<Integer> playerNumbers) {
        score.initScore();

        for (int i = 0; i < ANSWER_SIZE; i++) {
            countStrike(playerNumbers.get(i), i);
            countBall(playerNumbers.get(i), i);
        }

        return score;
    }

    private void countStrike(final int number, final int index) {
        if (answer.contains(number) && answer.indexOf(number) == index){
            score.countStrike();
        }
    }

    private void countBall(final int number, final int index) {
        if (answer.contains(number) && answer.indexOf(number) != index){
            score.countBall();
        }
    }

   private List<Integer> makeAnswer() {
        return Randoms.pickUniqueNumbersInRange(MIN_NUMBER, MAX_NUMBER, ANSWER_SIZE);
    }

}
