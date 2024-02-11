// Write a class called ToCelsius that accepts one command line argument (an integer) that is a Fahrenheit 
// value and then prints its equivalent Celsius value (a double).  Note that the unicode for the ° symbol is \u00B0.  Sample input and output:

// $ java ToCelsius 32
// 32° Fahrenheit is 0.00° Celsius.
// $ java ToCelsius 75
// 75° Fahrenheit is 23.89° Celsius.
// $ java ToCelsius 13
// 13° Fahrenheit is -10.56° Celsius.


public class ToCelsius {
	public static void main(String[] args) {

		String userInput = args[0];

        int fahrenheit = Integer.valueOf(userInput);
        Double fahrenheitC = Double.valueOf(fahrenheit);

        double celsius = (fahrenheitC - 32) * 5 / 9;

        System.out.printf("%d° Fahrenheit is %.2f° Celsius.\n",fahrenheit,celsius);

	}
}