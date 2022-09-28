package baseball.controller;

import baseball.domain.Player;
import baseball.view.ConsoleInput;

public class GameController {

    public static void start() {

        Player player = new Player();
        ConsoleInput.inputMessage();
        String inputNumber = player.inputNumber();
    }
}
