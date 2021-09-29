
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

    /*
          For running it as standalone executable (Main)
   */
    public Result startGame() {
        // Run until someone gets 3 points
        while (player.getScore() != 3 && computer.getScore() != 3) {

            String winner = startGameRound();

            if (winner.equals("player")) {
                player.addScore();
            } else if (winner.equals("computer")) {
                computer.addScore();
            } else { // It is a tie
                player.addScore();
                computer.addScore();
            }
            System.out.println("Current Score: " + player.getScore() + " - " + computer.getScore());
        }

        return getResult();
    }

    public Result getResult() {

        if (player.getScore() == computer.getScore()) {
            System.out.println("\nIt is a tie!");
            return Result.DRAW;
        } else if (player.getScore() > computer.getScore()) {
            System.out.println("\nYou are the winner!");
            return Result.WIN;
        } else {
            System.out.println("\nComputer wins!");
            return Result.LOSE;
        }
    }

    public String startGameRound() {

        Move player = this.player.makeMove();
        Move computer = this.computer.makeMove();

        System.out.print(player + " VS " + computer + " : ");
        return getWinningMove(player, computer);
    }

    public String getWinningMove(Move firstMove, Move secondMove) {
        String winner = "";

        if(firstMove == secondMove) {
            System.out.println("It is a tie! - both win!");
            winner = "both";
        } else {
            if (firstMove.beats(secondMove)) {
                System.out.println(firstMove + " beats " + secondMove);
                winner = "player";
            } else {
                System.out.println(secondMove + " beats " + firstMove);
                winner = "computer";
            }
        }
        return winner;
    }

    public Result getGameOutcome() {

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
