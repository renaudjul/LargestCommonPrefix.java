import java.util.Scanner;

public class LargestCommonPrefix {

	//compare strings method
	private static boolean isCommonPrefix(String firstInput, String secondInput) {

		boolean isCommon = true;

		int minLength = 0;

		// comparing the lengths of string1 & string2. Then assigning the "minimum
		// length" variable to the shorter string
		minLength = firstInput.length() >= secondInput.length() ? secondInput.length() : firstInput.length();

		// An empty string to catch each matching common char as the loop iterates
		String gcp = "";

		// loop compares each the char of both strings per iteration.
		// if loop true = adds the match char's to the empty string.
		// when loop false = when the char's don't match; break = end loop
		// loop that iterates based on the shortest string assigned to the minLength
		// variable
		for (int i = 0; i < minLength; i++) {
			char c1 = firstInput.charAt(i);
			char c2 = secondInput.charAt(i);

			if (c1 != c2)
				break;
			gcp += c1;

		}
		isCommon = gcp.length() > 0;
		System.out.print(isCommon ? "\nThe common prefix is: " + gcp : "\nThere is no common prefix between: " + firstInput + " and " + secondInput);

		return isCommon;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// boolean for do loop - set to false to only run once.
		boolean doAgain = false;
	
		// do loop to run program at least once. 
		do {
		// "Compare strings" input variables
		System.out.print("Let's compare two strings!!!\n\nPlease enter the first string: ");
		String firstInput = input.next();
		System.out.print("Please enter the second string: ");
		String secondInput = input.next();

		// call first method to compare first two inputs for largest common prefix
		boolean isCommon = isCommonPrefix(firstInput, secondInput);

		//Redundant - but I didn't know what to do with the return boolean of the method. - but it said I needed a return.
		System.out.print(isCommon ? "\n\nThey are common!\n" : "\n\nNot common.\n");

		// "Run again" input variable
		System.out.print("\nType 'Y' to run program again or type 'N' to stop: ");
		String thirdInput = input.next().toUpperCase();
		doAgain = thirdInput.equals("Y");
	
		}while(doAgain);
		
		System.out.println("Thanks for stoping by!");
		input.close();
	}
}
