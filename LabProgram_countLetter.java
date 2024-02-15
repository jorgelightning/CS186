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
