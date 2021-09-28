import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsTest {
    Game game;
    Player player;
    Player computer;

    @BeforeEach
    public void init() {
        game = new Game();
        player = game.getPlayer();
        computer = game.getComputer();

    }

    @Test
    void test_winning_move_success() {

        // Checking beats-function (ENUM) => PAPER beats ROCK
        player.setMove(Move.ROCK);
        computer.setMove(Move.PAPER);

        assertFalse(player.getMove().beats(computer.getMove()));
        assertTrue(computer.getMove().beats(player.getMove()));

        // Checking beats-function (ENUM)  => ROCK beats SCISSORS
        player.setMove(Move.SCISSORS);
        computer.setMove(Move.ROCK);

        assertFalse(player.getMove().beats(computer.getMove()));
        assertTrue(computer.getMove().beats(player.getMove()));

        // Checking beats-function (ENUM)  => SCISSORS beats PAPER
        player.setMove(Move.PAPER);
        computer.setMove(Move.SCISSORS);

        assertFalse(player.getMove().beats(computer.getMove()));
        assertTrue(computer.getMove().beats(player.getMove()));

    }

    @Test
    void check_enum_result_success() {
        assertEquals(Result.DRAW, game.getGameOutcome());
        assertEquals(0, player.getScore());

        player.addScore();
        assertEquals(Result.WIN, game.getGameOutcome());
        assertEquals(1, player.getScore());

        computer.setScore(2);
        assertEquals(Result.LOSE, game.getGameOutcome());
        assertEquals(1, player.getScore());
        assertEquals(2, computer.getScore());
    }
}