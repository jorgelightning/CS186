import java.util.Scanner;

// Forms often allow a user to enter an integer. Write a program that takes in a string representing an integer as input, and outputs Yes if every character is a digit 0-9.

// Ex: If the input is:

// 1995
// the output is:

// Yes
// Ex: If the input is:

// 42,000
// or

// 1995!
// the output is:

// No

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        boolean isDigits = false;

        userString = scnr.next();
        // int userInterger = userString;

        for (int a = 0; a < userString.length(); a++) {
            if (!Character.isDigit(userString.charAt(a))) {
                isDigits = false;
                break;
            }

        }
        if (isDigits == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}
