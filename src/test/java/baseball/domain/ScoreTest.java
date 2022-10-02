package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {

    @Test
    @DisplayName("스트라이크 카운트 증가 테스트")
    void countStrike_test() {
        //given
        Score score = new Score();
        //when
        score.countStrike();
        //then
        assertEquals(1, score.getStrike());

    }

    @Test
    @DisplayName("스트라이크와 볼 둘다 0일때 낫싱 여부 확인")
    void isNothing_test() {
        //given
        Score score = new Score();

        //when

        //then
        assertTrue(score.isNothing());

    }

    @Test
    @DisplayName("스트라이크 카운트 3개 일때 승리인지 확인")
    void isWin_test() {
        Score score = new Score();

        score.countStrike();
        score.countStrike();
        score.countStrike();

        assertTrue(score.isWin());
        assertEquals(score.getScoreMessage(), "3 스트라이크");

    }

    @Test
    @DisplayName("볼 카운트 증가 테스트")
    void countBall_test() {
        //given
        Score score = new Score();
        //when
        score.countBall();
        //then
        assertEquals(1, score.getBall());

    }

    @Test
    @DisplayName("볼 카운트가 있을때 낫싱과 승리가 아닌지 확인")
    void countBall_nothing_win_test() {
        //given
        Score score = new Score();
        //when
        score.countBall();
        //then
        assertEquals(1, score.getBall());
        assertFalse(score.isNothing());
        assertFalse(score.isWin());

    }
}