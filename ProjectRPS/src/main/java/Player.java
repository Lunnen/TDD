import java.util.Scanner;

public class Player {
    private Scanner input;
    private String name;
    private Move move;
    private int score;

    public Player(String name) {
        input = new Scanner(System.in);
        this.name = name;
        this.move = null;
        this.score = 0;
    }

    public void addScore() {
        score += 1;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int input) {
        this.score = input;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }


    /*
            For running it as standalone executable (Main)
     */
    public Move makeMove() {
        System.out.print("\nValid options are ROCK PAPER SCISSORS");
        return getValidMove();        // Make sure the move is valid
    }

    public Move getValidMove() {
        System.out.print("\nEnter your move: ");
        String move = input.nextLine();

        while (!isValidMove(move)) {
            System.out.println("\nInvalid option! Valid options are ROCK PAPER SCISSORS");
            System.out.print("Enter your move: ");
            move = input.nextLine();
        }
        return stringToMoveObject(move);
    }

    public boolean isValidMove(String value) {
        return value.equals("ROCK") || value.equals("PAPER") || value.equals("SCISSORS");
    }

    public Move stringToMoveObject(String value) {
        switch (value) {
            case "ROCK" -> setMove(Move.ROCK);
            case "PAPER" -> setMove(Move.PAPER);
            case "SCISSORS" -> setMove(Move.SCISSORS);
            default -> throw new IllegalStateException("Invalid option! Valid options are ROCK PAPER SCISSORS");
        }
        return getMove();
    }
    // ----------------------------------------------------------
}
