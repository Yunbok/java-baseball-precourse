package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GamePlayTest {

    @Test
    @DisplayName("입력한 값이 숫자가 아니면 IllegalArgumentException 발생")
    void illegalArgumentException_if_not_number() {
        GamePlay gamePlay = new GamePlay();

        assertThatIllegalArgumentException()
                .isThrownBy(() -> gamePlay.addToPlayerNumbers("abc"));
    }

    @Test
    @DisplayName("입력한 값이 1 ~ 9 사이가 아니면 IllegalArgumentException 발생")
    void illegalArgumentException_if_not_between_1_and_9() {
        GamePlay gamePlay = new GamePlay();

        assertThatIllegalArgumentException()
                .isThrownBy(() -> gamePlay.addToPlayerNumbers("012"));
    }

    @Test
    @DisplayName("입력한 값에 중복된 숫자가 있으면 IllegalArgumentException 발생")
    void illegalArgumentException_if_duplicate_number() {
        GamePlay gamePlay = new GamePlay();

        assertThatIllegalArgumentException()
                .isThrownBy(() -> gamePlay.addToPlayerNumbers("122"));
    }
}