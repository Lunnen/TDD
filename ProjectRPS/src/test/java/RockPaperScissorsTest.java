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
    void test_create_new_game_success() {
        assertNotNull(game);

        assertEquals("computer", game.getComputer().getName());
        assertEquals("player", game.getPlayer().getName());
    }

    @Test
    void test_get_moves_success() {
        assertEquals("", player.getMove());
        assertEquals("", computer.getMove());

        computer.setMove("SCISSORS");
        assertEquals("SCISSORS", computer.getMove());
        player.setMove("PAPER");
        assertEquals("PAPER",  player.getMove());
    }

}