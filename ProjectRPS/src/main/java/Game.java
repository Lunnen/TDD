import lombok.Value;

@Value
public class Game {
    String player, computer;

    public Game() {
        player = "player";
        computer = "computer";

    }


}
