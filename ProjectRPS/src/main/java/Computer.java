

public class Computer extends Player {

    public Computer(String name) {
        super("computer");
    }

    public String makeMove() {
        int randomNum = ((int) (Math.random() * 3)) + 1;     // Random generate value, 1-3
        // Rock = 1, Paper = 2, Scissors = 3
        switch (randomNum) {
            case 1 -> setMove("ROCK");
            case 2 -> setMove("PAPER");
            case 3 -> setMove("SCISSORS");
            default -> throw new IllegalStateException("Unexpected value: " + randomNum);
        }

        return getMove();
    }

}
