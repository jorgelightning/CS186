import java.util.Scanner;

// Write a program that reads an integer, a list of words, and a character. 
// The integer signifies how many words are in the list. The output of the program is every word in the list that contains the character at least once. 
// For coding simplicity, follow each output word by a comma, even the last one. Add a newline to the end of the last output. 
// Assume at least one word in the list will contain the given character.

// 4 hello zoo sleep drizzle z
// 3 school star SOS s
// 7 red roses racecar room sunrise rock train r

public class LabProgram_integerWords {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num = scnr.nextInt();
        String[] words = new String[num];
        for (int a = 0; a < num; a++) {
            words[a] = scnr.next();
            // System.out.println(words[a]);
        }
        char targetChar = scnr.next().toLowerCase().charAt(0);

        for (String word : words) {
            if (word.indexOf(targetChar) != -1) {
                System.out.print(word + ",");
                foundWords = true;
            }
        }
        System.out.println();
    }
}
