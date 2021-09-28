import lombok.Value;

@Value
public class Game {
    Player player;
    Computer computer;

    public Game() {
        this.player = new Player("player");
        this.computer = new Computer("computer");
    }



}
