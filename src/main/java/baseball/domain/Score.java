package baseball.domain;

import static baseball.constant.GameConfig.ANSWER_SIZE;

public class Score {

    private int strike;
    private int ball;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void countStrike() {
        this.strike++;
    }

    public void countBall() {
        this.ball++;
    }

    public boolean isWin() {
        return this.strike == ANSWER_SIZE;
    }

    public boolean isNothing() {
        return this.strike == 0 && this.ball == 0;
    }

    public String getScoreMessage() {
        if (isNothing()) {
            return "낫싱";
        }
        if (this.ball > 0 && this.strike == 0) {
            return this.ball + " 볼";
        }
        if (this.ball == 0 && this.strike > 0) {
            return this.strike + " 스트라이크";
        }
        if (this.ball > 0 && this.strike > 0) {
            return this.ball + " 볼 " + this.strike + " 스트라이크";
        }
        return null;
    }

    public void initScore() {
        this.strike = 0;
        this.ball = 0;
    }
}
