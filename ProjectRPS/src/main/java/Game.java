
public class Game {
    Player player;
    Computer computer;

    // UNIT tests
    public Game() throws IllegalArgumentException {
        PlayerFactory playerFactory = new PlayerFactory();
        player = playerFactory.createPlayerModel("test", "player");
        computer  = new Computer();
    }
    // MOCK tests
    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public Result getGameOutcome() {

        return switch (
                Utils.returnDrawWinLose(
                        player.getScore(), computer.getScore())) {
            case "draw" -> Result.DRAW;
            case "playerWin" -> Result.WIN;
            default -> Result.LOSE;
        };
    }

    public Player getPlayer() {
        return player;
    }

    public Computer getComputer() {
        return computer;
    }
}
