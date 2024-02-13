// Write a program that takes in an integer in the range 11-99 (inclusive) as input. 
// The output of the program is a countdown starting from the input integer until an integer where both digits are identical. End with a newline.

// Ex: If the input is:

// 93
// the output is:

// 93 92 91 90 89 88
// Ex: If the input is:

// 11
// the output is:

// 11
// Ex: If the input is:

// 9
// or any number not between 11 and 99 (inclusive), the output is:

// Input must be 11-99
// For coding simplicity, follow each output number by a space, even the last one.

// Use a while loop. Compare the digits; do not write a large if-else for all possible same-digit numbers (11, 22, 33, …, 99), as that approach would be cumbersome for larger ranges.

import java.util.Scanner;

public class LabProgram_countDown {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numCount = scnr.nextInt();

        if ((numCount >= 11) && (numCount <= 99)) {
            while (numCount % 11 != 0) {
                System.out.print(numCount+" ");
                numCount--;
            }
            System.out.println(numCount + " ");
        } else {
            System.out.println("Input must be 11-99");
        }
    }
}