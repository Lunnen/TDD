import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a game of Rock[R,1] Paper[P,2] Scissors[S,3]");

        String  name =  getValidName(input);

        System.out.println("\nPlayer VS Computer, Game on!");
        Game game = new Game(name);
    }

    static String getValidName(Scanner input) {
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        if (name.length() < 1 ) {
            name = "player";
            System.out.print("Invalid name, default name player given!");
        }

        return name;
    }
}