public class RockPaperScissors {

    public static void main(String[] args) {
        System.out.println("Welcome to a game of Rock[R,1] Paper[P,2] Scissors[S,3]");

        System.out.println("\nPlayer VS Computer, Game on!");
        Game game = new Game();
        game.startGame();
    }
}
