
public class Player {
    private String name;
    private Move move;
    private int score;

    public Player(String name) {
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

    public Move makeMove() {
        return getMove();
    }
}
