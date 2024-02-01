import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1; // Randomize number 1 - 100

        System.out.print("Player one, enter your name and guess a number between 1 and 100! ");
        String userOneName = scanner.next();
        int userOneGuess = scanner.nextInt();

        System.out.print("Thanks, " + userOneName + ". Player two, enter your name and guess a number between 1 and 100! ");
        String userTwoName = scanner.next();
        int userTwoGuess = scanner.nextInt();

        int closestGuess = Math.abs(randomNumber - userOneGuess) < Math.abs(randomNumber - userTwoGuess) ? userOneGuess : userTwoGuess;

        if (userOneGuess == userTwoGuess)
            System.out.println("It's a tie!");
        else if (closestGuess == userOneGuess) {
            System.out.println(userOneName + ", you won!");
        } else {
            System.out.println(userTwoName + ", you won!");
        }

        System.out.println("The number was " + randomNumber);
    }
}
