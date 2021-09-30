import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RockPaperScissorsParameterTest {

    Game game;
    Player player;
    Computer computer;

    @BeforeEach
    public void init() {
        player = mock(Player.class);
        computer = mock(Computer.class);
        game = new Game(player, computer);

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

    @ParameterizedTest
    @MethodSource("provideExpressions")
    void test_standard_game_round_success(
            Result expectedResult, Move playerMove, Move computerMove) {

        Result result = playerMove == computerMove ?
                Result.DRAW : playerMove.beats(computerMove) ?
                Result.WIN : Result.LOSE;

        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> provideExpressions() {
        return Stream.of(
                Arguments.of(Result.DRAW, Move.ROCK, Move.ROCK),
                Arguments.of(Result.WIN, Move.SCISSORS, Move.PAPER),
                Arguments.of(Result.LOSE, Move.SCISSORS, Move.ROCK)
        );
    }



}
