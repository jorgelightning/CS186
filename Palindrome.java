public class Palindrome {
	public static void main(String[] args) {

		// This code has been written for you and should stay
		// at the top of the file:
		String str = args[0];
		String newS = "";
		str = str.toLowerCase();
		int len = str.length();

		// Your code goes here:

		for (int i = 0; i < len; i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				newS += str.charAt(i);
			}

		}
		str = newS;
		len = str.length();
		System.out.println(str);

		boolean isPalindrome = true;

		for (int e = 0; e < len / 2 + 1; e++) {
			if (str.charAt(e) != str.charAt(len - e - 1)) {
				isPalindrome = false;
				break;
			}
		}

		// This code has been written for you and should stay
		// at the bottom of your file:
		if (isPalindrome) {
			System.out.println("\"" + args[0] + "\" is a palindrome.");
		} else {
			System.out.println("\"" + args[0] + "\" is not a palindrome.");
		}

	}
}
