
public class Player {
    String name;
    String move;

    public Player(String name) {
        this.name = name;
        this.move = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String makeMove() {
        return getMove();
    }
}
