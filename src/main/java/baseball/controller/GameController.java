package baseball.controller;

import baseball.domain.GamePlay;
import baseball.domain.Player;
import baseball.view.ConsoleInput;

public class GameController {

    public static void start() {

        Player player = new Player();
        GamePlay gamePlay = new GamePlay();

        ConsoleInput.inputMessage();
        gamePlay.addToPlayerNumbers(player.inputNumber());

    }
}
