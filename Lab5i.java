package week5;

import java.util.Scanner;

public class Lab5i {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		int multi = 0;
		int num1 = 0;
		int num2 = 0;

		boolean valid = false;
		do {
			System.out.println("This program will ask the user for three numbers:");
			System.out.println("* A starting number");
			System.out.println("* An ending number");
			System.out.println("* A multiplier");
			System.out.println(
					"The program will multiply each number between the starting number and ending number by the multiplier.");

			valid = false;
			do {
				System.out.println("Please enter the starting number:  ");
				input = in.nextLine();

				try {

					num1 = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");

				}
			} while (!valid);

			valid = false;
			do {
				System.out.println("Please enter the ending number: ");
				input = in.nextLine();

				try {

					num2 = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");

				}
			} while (!valid);
			valid = false;
			do {
				System.out.println("Please enter the multiplier:: ");
				input = in.nextLine();

				try {

					multi = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");

				}
			} while (!valid);
			valid = false;
			int result = '0';
			result = (num1 * multi);

			for (int i = num1; i <= num2; i++) {

				System.out.printf("Multiplying " + num1++ + " by " + multi + " results in: " + result + "%n");
				result = (num1 * multi);

			}
			valid = false;

			do {
				System.out.println("Would you like to play again? (Y/N):");
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

			} else {
				valid = false;
			}
		} while (!valid);

	}

}
