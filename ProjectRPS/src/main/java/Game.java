
public class Game {
    Player player;
    Computer computer;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
