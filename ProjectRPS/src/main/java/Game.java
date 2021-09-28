import lombok.Value;

@Value
public class Game {
    Player player;
    Computer computer;

    public Game() {
        this.player = new Player("player");
        this.computer = new Computer("computer");
    }

    public Result getGameOutcome() {
        // Game is over. Check if there is a winner or if it is a tie
        if (player.getScore() == computer.getScore()) {
            //System.out.println("\nIt is a tie!");
            return Result.DRAW;
        } else if (player.getScore() > computer.getScore()) {
            //System.out.println("\nYou are the winner!");
            return Result.WIN;
        } else {
            //System.out.println("\nComputer wins!");
            return Result.LOSE;
        }
    }

}
