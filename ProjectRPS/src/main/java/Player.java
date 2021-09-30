
public interface Player {
    void setMove(Move move);
    Move getMove();
    Move makeMove();
    String getName();
    int getScore();
    void addScore();
}
