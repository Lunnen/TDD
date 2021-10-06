import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a game of Rock[R,1] Paper[P,2] Scissors[S,3]");

        String  name =  getValidName(input);

        System.out.println("\nPlayer VS Computer, Game on!");
        new LocalGame(name);
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