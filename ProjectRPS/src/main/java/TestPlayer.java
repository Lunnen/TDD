
public class TestPlayer implements Player {
    private String name;
    private Move move;
    private int score;

    public TestPlayer(String name) {
        this.name = name;
        this.move = null;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore() {
        this.score += 1;
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
