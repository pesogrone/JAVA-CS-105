package week7;

import java.util.Scanner; 

public final class lab7i {

	public static void main(String[] args) {
		//Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

		//Get an integer from the user
		int intNum = getValidInt("Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");
		System.out.printf("The whole number your entered was: %d.\n", intNum);
		System.out.println("Now we will test your whole number in a math equation...");
		System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
		System.out.println();

		//Get a floating-point from the user
		double doubleNum = getValidDouble("Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");
		System.out.printf("The float your entered was: %f.\n", doubleNum);
		System.out.println("Now we will test your floating-point number in a math equation...");
		System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
		System.out.println();

		//Get a 'Y' or 'N' from the user
		playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response. Please answer with a 'Y' or 'N'");
		System.out.println();
		}// end of while (playAgain.equalsIgnoreCase("y"))
		}// end of Main()
	
	

	
	public static int getValidInt(String validint, String validint2 ) {
		Scanner in = new Scanner(System.in);
		String input;
		int intNum = 0;
		boolean valid = false;
		while (!valid) {
			System.out.print(validint);
			input = in.nextLine();

			try {
				intNum = Integer.parseInt(input);

				valid = true;
			}

			catch (Exception e) {
				System.out.println(validint2);

			}
		}
        
		return intNum;
	}
	public static double getValidDouble(String string, String string2) {
		Scanner in = new Scanner(System.in);
		String input;
		double doubleNum = 0;
		boolean valid = false;
		while (!valid) {
			System.out.print(string);
			input = in.nextLine();

			try {
				doubleNum = Double.parseDouble(input);

				valid = true;
			}

			catch (Exception e) {
				System.out.println(string2);
				

			}
		}
		return doubleNum;
	
}
	public static String getValidYN(String string, String string2) {
		Scanner in = new Scanner(System.in);
		Boolean valid =false;
		String answer;
		
		do {
			System.out.print(string);
			answer = in.nextLine();

			if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y")) {
				valid = true;
			} else {
				System.out.println(string2);
				valid = false;
			}
		} while (!valid);
		if (answer.equalsIgnoreCase("N")) {
			valid = true;

		} else {
			valid = false;
		}
		return answer;
	}
	}
	