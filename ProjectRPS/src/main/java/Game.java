import lombok.Value;

@Value
public class Game {
    String player, computer;

    String playerMove, computerMove;

    public Game() {
        player = "player";
        computer = "computer";

        playerMove = "ROCK"; // Default move
        computerMove = "SCISSORS";
    }

}
