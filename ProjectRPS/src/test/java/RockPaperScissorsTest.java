import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsTest {

    @Test
    void test_create_new_game_success() {
        Game game = new Game();

        assertNotNull(game);

        assertEquals("computer", game.getComputer());
        assertEquals("player", game.getPlayer());
    }

    @Test
    void test_get_moves_success() {
        Game game = new Game();

        assertEquals("SCISSORS", game.getComputerMove());
        assertEquals("ROCK", game.getPlayerMove());

        assertNotEquals("PAPER", game.getPlayerMove());
        assertNotEquals("SCISSORS", game.getPlayerMove());

        assertNotEquals("PAPER", game.getComputerMove());
        assertNotEquals("ROCK", game.getComputerMove());
    }

}
