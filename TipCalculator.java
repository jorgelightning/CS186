// Write a class called TipCalculator that accepts two command line arguments (the first a double, the second an integer): a dollar amount and a tip percentage. 
// The program should output the tip amount. Sample input and output:

// $ java TipCalculator 100 18
// A 18 percent tip on $100.00 is $18.00.
// $ java TipCalculator 150.15 18
// A 18 percent tip on $150.15 is $27.03.
 

public class TipCalculator {
	public static void main(String[] args) {

		String dollar = args[0];
        String tip = args[1];

        double dollarD = Double.valueOf(dollar);
        int tipI = Integer.valueOf(tip);

        double tipAmount = dollarD * (tipI / 100.0);

        System.out.printf("A %d percent tip on $%.2f is $%.2f",tipI,dollarD,tipAmount);
	}
}