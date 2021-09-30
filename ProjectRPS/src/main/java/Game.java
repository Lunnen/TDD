import lombok.Value;

@Value // getters and setters
public class Game {
    Player player;
    Computer computer;

    // UNIT tests
    public Game() {
        PlayerFactory playerFactory = new PlayerFactory();
        player = playerFactory.createPlayerModel("test", "player");
        computer  = new Computer();
    }
    // Standalone game
    public Game(String name) {
        PlayerFactory playerFactory = new PlayerFactory();
        player = playerFactory.createPlayerModel("local", name);
        computer  = new Computer();
        startGame(player);
    }
    // MOCK tests
    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public Result getGameOutcome() {
        if (player.getScore() == computer.getScore()) {
            return Result.DRAW;
        } else if (player.getScore() > computer.getScore()) {
            return Result.WIN;
        } else {
            return Result.LOSE;
        }
    }

    /* ---------------- For running terminal game from main -------------- */
    public void startGame(Player player) {
        while (this.player.getScore() != 3 && computer.getScore() != 3) {
            String winner = startGameRound();

            if (winner.equals("player")) {
                this.player.addScore();
            } else if (winner.equals("computer")) {
                computer.addScore();
            } else { // It is a tie
                this.player.addScore();
                computer.addScore();
            }
            System.out.println("Current Score: " + this.player.getScore() +
                    " - " + computer.getScore());
        }

        announceWinner();
    }

    public String startGameRound() {
        Move playerMove = player.makeMove();
        Move computerMove = computer.makeMove();

        System.out.print(player.getName() + " VS " + computer.getName() + " : ");
        return getWinningMove(playerMove, computerMove);
    }

    public String getWinningMove(Move firstMove, Move secondMove) {
        String winner;
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

    public void announceWinner() {
        if (player.getScore() == computer.getScore()) {
            System.out.println("\nIt is a " + Result.DRAW + "!");
        } else if (player.getScore() > computer.getScore()) {
            System.out.println("\nYou  " + Result.WIN + "!");
        } else {
            System.out.println("\nYou  "+ Result.LOSE + "!");
        }
    }
}
