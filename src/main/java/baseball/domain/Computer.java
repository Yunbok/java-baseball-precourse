package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Computer {

    public List<Integer> makeAnswer() {
        return Randoms.pickUniqueNumbersInRange(1, 9, 3);
    }

}
