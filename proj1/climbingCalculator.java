import java.util.*;

// User Notes:
// Here are the inputs for bouldering grades:
// American bouldering uses V grades, ranging from V0 to V17 (as of 2024, for usability, this code accommodates up to V11)
// European bouldering uses Font grades, starting from 3 and going up to 8a, including 5, 6a, 6a+, 6b, 6c, 6c+, 7a, 7b+, 7c, 7c+

// Bouldering grade conversion doesn't follow a mathematical formula; it's almost a 1:1 conversion

public class climbingCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            printGreeting();

            System.out.println("Enter your choice (1 or 2): ");

            int choice;
            try {
                choice = scanner.nextInt();
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("// Ivalid input. Please enter 1 or 2.");
                scanner.nextLine();
                continue;
            }

            if (choice == 1) {

                while (!quit) {
                    System.out.println("1. V grade conversion");
                    System.out.println("2. Font grade conversion");
                    System.out.println("3. Exit");

                    System.out.print("Enter your choice (1, 2, or 3): ");

                    int subChoice;
                    try {
                        subChoice = scanner.nextInt();
                        System.out.println();
                    } catch (InputMismatchException e) {
                        System.out.println("// Invalid input. Please enter 1, 2, or 3.");
                        scanner.nextLine();
                        continue;
                    }

                    if (subChoice == 1) {
                        convertVToFrench(scanner);
                        break;
                    }

                    if (subChoice == 2) {
                        convertFrenchToV(scanner);
                        break;

                    }

                    else if (subChoice == 3) {
                        quit = true;
                        System.out.println("Exiting");
                    } else {
                        System.out.println("// Invalid choice. Please enter 1, 2, or 3.");
                    }

                }

            } else if (choice == 2) {
                quit = true;
                System.out.println("Exiting program.");
            } else {
                System.out.println("// Invalid choice. Please enter 1 or 2.");
            }
        }

        scanner.close();
    }

    public static void printGreeting() {
        System.out.println("Welcome to bouldering grade coversion!");
        System.out.println("1. Start Here");
        System.out.println("2. Exit");
    }

    public static void convertVToFrench(Scanner scanner) {
        System.out.print("Enter V-scale grade (e.g., V0 - V11): ");
        String vGrade = scanner.next();

        // Conversion table
        String[][] conversionTable = {
                { "V0", "3" },
                { "V1", "5" },
                { "V2", "6a/6a+" },
                { "V3", "6b" },
                { "V4", "6b+" },
                { "V5", "6c/6c+" },
                { "V6", "7a" },
                { "V7", "7a+" },
                { "V8", "7b/7b+" },
                { "V9", "7c" },
                { "V10", "7c+" },
                { "V11", "8a" }
        };

        String vGradeUppercase = vGrade.toUpperCase();
        for (String[] entry : conversionTable) {
            if (entry[0].equals(vGradeUppercase)) {
                System.out.println("Equivalent French grade: " + entry[1] + "\n");
                return;
            }
        }

        System.out.println("V-scale grade not found in the conversion table." + "\n");
    }

    public static void convertFrenchToV(Scanner scanner) {
        System.out.print("Enter French grade (e.g., 6c,8a): ");
        String frenchGrade = scanner.next();

        // Conversion table
        String[][] conversionTable = {
                { "3", "V0" },
                { "5", "V1" },
                { "6a", "V2" },
                { "6a+", "V2" },
                { "6b", "V3" },
                { "6b+", "V4" },
                { "6c", "V5" },
                { "6c+", "V5" },
                { "7a", "V6" },
                { "7a+", "V7" },
                { "7b", "V8" },
                { "7b+", "V8" },
                { "7c", "V9" },
                { "7c+", "V10" },
                { "8a", "V11" }
        };

        String vGradeLowercase = frenchGrade.toLowerCase();
        for (String[] entry : conversionTable) {
            if (entry[0].equals(vGradeLowercase)) {
                System.out.println("Equivalent V-scale grade: " + entry[1] + "\n");
                return;
            }
        }

        System.out.println("French grade not found in the conversion table." + "\n");
    }
}
