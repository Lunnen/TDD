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
    void test_get_moves_success() {
        assertNull(player.getMove());
        assertNull(computer.getMove());

        computer.setMove(Move.SCISSORS);
        assertEquals(Move.SCISSORS, computer.getMove());
        player.setMove(Move.PAPER);
        assertEquals(Move.PAPER,  player.getMove());
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

}