import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RockPaperScissorsMockTest {

    @Test
    void test_mock_classes_success() {
        Game game = new Game();
        Player player = mock(Player.class);
        Computer computer = mock(Computer.class);

        when(player.getMove()).thenReturn(Move.PAPER);
        when(computer.getMove()).thenReturn(Move.ROCK);

        assertEquals(Move.PAPER, player.getMove());
        assertEquals(Move.ROCK, computer.getMove());

        assertTrue(player.getMove().beats(computer.getMove()));
    }



}