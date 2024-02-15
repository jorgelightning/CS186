// Write a method maxMagnitude() with three integer parameters that returns the largest magnitude value. Use the method in the main program that takes three integer inputs and outputs the largest magnitude value.

// Ex: If the inputs are:

// 5 7 9
// method maxMagnitude() returns and the main program outputs:

// 9
// Ex: If the inputs are:

// -17 -8 -2
// method maxMagnitude() returns and the main program outputs:

// -17
// Note: The method does not just return the largest value, which for -17 -8 -2 would be -2. Though not necessary, you may use the absolute-value built-in math method.

// Your program must define and call a method:
// public static int maxMagnitude(int userVal1, int userVal2, int userVal3)

import java.util.Scanner;

public class LabProgram_max {

    public static int maxMagnitude(int x, int y, int z) {
        int xa = Math.abs(x);
        int ya = Math.abs(y);
        int za = Math.abs(z);

        if (xa > ya) {
            if (xa > za) {
                return x;
            }
        }
        if (ya > za) {
            if (ya > xa) {
                return y;
            }
        }
        if (za > xa) {
            if (za > ya) {
                return z;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x = scnr.nextInt();
        int y = scnr.nextInt();
        int z = scnr.nextInt();

        int max = maxMagnitude(x,y,z);
        System.out.println(max);

    }
}
