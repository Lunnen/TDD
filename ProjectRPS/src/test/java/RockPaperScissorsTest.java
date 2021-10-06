import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsTest {
    Game game;
    Player player;
    Computer computer;

    @BeforeEach
    public void init() throws IllegalArgumentException {
        game = new Game();
        player = game.getPlayer();
        computer = game.getComputer();

    }

    @Test
    void test_win_rockVsRock_fail() {

        player.setMove(Move.ROCK);
        computer.setMove(Move.ROCK);

        assertFalse(player.getMove().beats(computer.getMove()));
        assertFalse(computer.getMove().beats(player.getMove()));
    }

    @Test
    void test_win_paperVsRock_success() {

        player.setMove(Move.ROCK);
        computer.setMove(Move.PAPER);

        assertFalse(player.getMove().beats(computer.getMove()));
        assertTrue(computer.getMove().beats(player.getMove()));
    }

    @Test
    void test_win_scissorsVsRock_success() {

        player.setMove(Move.SCISSORS);
        computer.setMove(Move.ROCK);

        assertFalse(player.getMove().beats(computer.getMove()));
        assertTrue(computer.getMove().beats(player.getMove()));
    }

    @Test
    void test_win_paperVsScissors_success() {

        player.setMove(Move.PAPER);
        computer.setMove(Move.SCISSORS);

        assertFalse(player.getMove().beats(computer.getMove()));
        assertTrue(computer.getMove().beats(player.getMove()));
    }

    @Test
    void check_scoring_draw_success() {
        assertEquals(Result.DRAW, game.getGameOutcome());
        assertEquals(0, player.getScore());
    }

    @Test
    void check_scoring_win_success() {
        player.addScore();
        assertEquals(Result.WIN, game.getGameOutcome());
        assertEquals(1, player.getScore());

    }

    @Test
    void check_scoring_loss_success() {
        computer.setScore(2);
        assertEquals(Result.LOSE, game.getGameOutcome());
        assertEquals(0, player.getScore());
        assertEquals(2, computer.getScore());
    }

    @Test
    void check_full_game_success() {

        Move[] myMoves = {Move.PAPER, Move.SCISSORS, Move.ROCK};

        int nrOfRounds = 3;
        for (int i = 0; i < nrOfRounds; i++) {
            player.setMove(myMoves[i]);
            computer.makeMove();

            // Check who wins round
            if (computer.getMove().equals(player.getMove())) {
                player.addScore();
                computer.addScore();
            } else {
                if (computer.getMove().beats(player.getMove())) {
                    computer.addScore();
                } else {
                    player.addScore();
                }
            }
        }

        // Check that result exists
        assertNotNull(game.getGameOutcome());
    }

    @Test
    void test_feedback_addendum() {

        // TestPlayer logic check
        TestPlayer tPlayer = new TestPlayer("Kalle");
        tPlayer.setName("Pelle Svan");
        assertEquals("Pelle Svan", tPlayer.getName());

        tPlayer.setMove(Move.ROCK);
        assertEquals(Move.ROCK, tPlayer.makeMove());

    }

    @Test
    public void test_addendum_illegal_argument_exception() {

        PlayerFactory playerFactory = new PlayerFactory();

        IllegalArgumentException illegalArgumentException =
                assertThrows(IllegalArgumentException.class,
                        () -> playerFactory.createPlayerModel("MrBean", "MrBean"));

        assertEquals("No such model!", illegalArgumentException.getMessage());

    }
}