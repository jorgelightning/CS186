// Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.

// Ex: If the input is:

// n Monday
// the output is:

// 1 n
// Ex: If the input is:

// z Today is Monday
// the output is:

// 0 z's
// Ex: If the input is:

// n It's a sunny day
// the output is:

// 2 n's
// Case matters. n is different than N.

// Ex: If the input is:

// n Nobody
// the output is:

// 0 n's
// The program must define and call the following method that takes the input string and character as parameters, and returns the number of times the input character appears in the input string.
// public static int calcNumCharacters(String userString, char userChar)

import java.util.Scanner;

public class LabProgram_countLetter {

    public static int calcNumCharacters(String userString, char userChar) {
        int lens = userString.length();
        int b=0;
        for(int a=0;lens > a;a++) {
            if(userString.charAt(a) == userChar) {
                b++;
            }
        }
        return b;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char letter = scnr.next().charAt(0);
        String inputString = scnr.next();
        int counter = calcNumCharacters(inputString,letter);
        if(counter == 1) {
            System.out.printf("%d %s\n",counter,letter);
        }
        else {
            System.out.printf("%s's",counter);
        }


    }
}
