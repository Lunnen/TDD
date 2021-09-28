
public class Player {
    String name;
    Move move;

    public Player(String name) {
        this.name = name;
        this.move = null;
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
