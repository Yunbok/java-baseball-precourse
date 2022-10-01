package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.GamePlay;
import baseball.domain.Player;
import baseball.domain.Score;
import baseball.view.ConsoleInput;
import baseball.view.ConsoleOutput;

import java.util.List;

public class GameController {

    public static void start() {

        Computer computer = new Computer();
        Player player = new Player();
        GamePlay gamePlay = new GamePlay();

        ConsoleInput.inputMessage();
        List<Integer> playerNumbers = gamePlay.initPlayerNumbers(player.inputNumber());
        Score score = computer.compareAnswers(playerNumbers);
        ConsoleOutput.printResult(score.getScoreMessage());

    }
}
