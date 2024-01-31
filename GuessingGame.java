import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1; // Randomize number 1 - 100

        System.out.print("Player one, enter your name and guess a number between 1 and 100! ");
        String player1Name = scanner.next();
        int player1Guess = scanner.nextInt();

        System.out.print(
                "Thanks, " + player1Name + ". Player two, enter your name and guess a number between 1 and 100! ");
        String player2Name = scanner.next();
        int player2Guess = scanner.nextInt();

        int closestGuess = Math.abs(randomNumber - player1Guess) < Math.abs(randomNumber - player2Guess) ? player1Guess : player2Guess;

        if (player1Guess == player2Guess)
            System.out.println("It's a tie!");
        else if (closestGuess == player1Guess) {
            System.out.println(player1Name + ", you won!");
        } else {
            System.out.println(player2Name + ", you won!");
        }

        System.out.println("The number was " + randomNumber);
    }
}
