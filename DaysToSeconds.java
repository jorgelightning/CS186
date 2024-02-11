// Write a class called DaysToSeconds that accepts one command line argument (a whole number), which is a number of days. 
// The output should be the number of seconds in those days. Make sure that your program can handle an input of 25000 
// (what data type should you use to make this work?).  Sample input and output (note the difference between "days"/"day"):

// $ java DaysToSeconds 25
// There are 2160000 seconds in 25 days.
// $ java DaysToSeconds 25000
// There are 2160000000 seconds in 25000 days.
// $ java DaysToSeconds 1
// There are 86400 seconds in 1 day.
// $ java DaysToSeconds 0
// There are 0 seconds in 0 days.
 

public class DaysToSeconds {
	public static void main(String[] args) {

		String day = args[0];

        long dayD = Long.valueOf(day);

        long seconds = dayD * 86400;

        System.out.printf("There are %d seconds in %d days.",seconds,dayD);
	}
}