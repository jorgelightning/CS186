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
