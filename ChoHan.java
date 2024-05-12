package for_project3;

import java.util.Random;
import java.util.Scanner;

public class ChoHan extends Game {
    private int playerMoney = 100;  
    private Random random = new Random();

    @Override
    public String explainRules() {
        return "Welcome to Cho-Han!\n" +
               "Two dice will be rolled. You bet on whether the sum is even (Cho) or odd (Han).\n" +
               "You start with $" + playerMoney + ". Good luck!\n";
    }

    @Override
    public String setup() {
        System.out.println("You have $" + playerMoney);
        return "Enter your bet (or 0 to quit): ";
    }

    @Override
    public boolean goodPlayerInput(String input) {
        try {
            int bet = Integer.parseInt(input);
            return bet >= 0 && bet <= playerMoney;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String checkWinOrLose() {
        Scanner scanner = new Scanner(System.in);  
        int bet;                                 

        do {
            System.out.print("Enter your bet (or 0 to quit): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            bet = scanner.nextInt();
            scanner.nextLine(); 
        } while (bet <= 0);

        System.out.print("Cho (even) or Han (odd)? ");
        String prediction = scanner.nextLine().toLowerCase();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int sum = dice1 + dice2;
        boolean isEven = sum % 2 == 0;

        boolean playerWins = (isEven && prediction.equals("cho")) || (!isEven && prediction.equals("han"));

        String result = "The dice rolled: " + dice1 + " and " + dice2 + " (sum = " + sum + ")\n";
        if (playerWins) {
            result += "You win! ";
        } else {
            result += "You lose! ";
        }

        
        playerMoney += (playerWins) ? bet : -bet;
        result += "You now have $" + playerMoney;

        return result;
    }


    @Override
    public boolean canPlayAgain() {
        return playerMoney > 0; 
    }
}
