package week6;

import java.util.Scanner;

public class lab6d {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Declare variables
		int num = 0;
		boolean valid = false;
		String input;
		
		do {
		System.out.println("This program will ask the user to enter a number of pennies.\r\n"
				+ "It will then calculate how many days it would take to become a millionaire by doubling the amount they have each day.");
		System.out.println("");
		do {
			System.out.print("Please enter the number of pennies you start with: ");
			input = in.nextLine();
			try {
				num = Integer.parseInt(input);
				valid = true;

			} catch (Exception e) {
				System.out.println("Invalid response: Please enter a whole number.");
			}

		} while (!valid);
		valid = false;
		System.out.println("\nDays        Pennies");
		System.out.println("----------------------");
	
		
		System.out.println("By starting with " + input  + " and doubling the amount you have each day, it would only take " + daysToMillion(num) + " days to become a millionaire!!!" );

		do {
			System.out.println("");
			System.out.print("Would you like to play again?");
			input = in.nextLine();

			if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y")) {
				valid = true;
			} else {
				System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
				valid = false;
			}
		} while (!valid);
	if (input.equalsIgnoreCase("N")) {
		valid = true;
	
	}else { 
		valid=false;
	}
	} while (!valid);
		
	}// End of Main
	
	// Start daysToMillion
	public static int daysToMillion(int num) {
		int days = 0;
		while (num < 100000000) {
			System.out.printf("%-2d%,16d%n", days, num);
			num *= 2;
			days++;
		}
		System.out.printf("%-2d%,16d%n", days, num);
		return days; 
		
	}// End of daysToMillion
	
}