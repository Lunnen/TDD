
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class RockPaperScissorsMockTest {
    Game game;
    Player player;
    Computer computer;

    @BeforeEach
    public void init() {
        player = mock(TestPlayer.class);
        computer = mock(Computer.class);
        game = new Game(player, computer);

    }

    @Test
    void test_mock_classes_success() {

        // Given
        when(player.getMove()).thenReturn(Move.PAPER);
        when(computer.getMove()).thenReturn(Move.ROCK);

        // When
        Move playerMove = player.getMove();
        Move computerMove = computer.getMove();

        //Then
        assertEquals(Move.PAPER, playerMove);
        assertEquals(Move.ROCK, computerMove);

        assertTrue(playerMove.beats(computerMove));
    }

    @Test
    void test_mock_game_outcome_win() {
        // Given
        when(player.getScore()).thenReturn(2);
        // When
        Result result = game.getGameOutcome();
        //Then
        assertEquals(Result.WIN, result);
    }

    @Test
    void test_mock_game_outcome_draw() {
        // Given
        when(player.getScore()).thenReturn(0);
        // When
        Result result = game.getGameOutcome();
        //Then
        assertEquals(Result.DRAW, result);
    }

    @Test
    void test_mock_game_outcome_lose() {
        // Given
        when(computer.getScore()).thenReturn(1);
        // When
        Result result = game.getGameOutcome();
        //Then
        assertEquals(Result.LOSE, result);
    }



}