import lombok.Value;

@Value
public class Game {
    Player player, computer;

    public Game() {
        this.player = new Player("player");
        this.computer = new Player("computer");
    }



}
