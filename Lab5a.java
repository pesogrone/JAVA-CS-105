package week5;

import java.util.Scanner;

//Tomas Soares & Ronald Britos CS 105
public class Lab5a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = null;
		boolean valid = false;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean quit = false;

		while (!quit) {

			System.out.println(
					"In this program, we will display a series of numbers divisible by an integer specified by the user.\r\n"
							+ "You will ask the user for the starting number, the ending number and the integer to be considered.");
			valid = false;
			do {

				System.out.println("Enter the starting number: ");
				input = in.nextLine();

				try {

					num1 = Integer.parseInt(input);
					valid = true;
				} catch (Exception e) {
					System.out.println("Error: Please enter a whole number.");
					
				}
				
			} while (!valid);

			valid = false;

			do {
				System.out.println("Enter the ending number: ");
				input = in.nextLine();

				try {

					num2 = Integer.parseInt(input);
					valid = true;
				} catch (Exception e) {
					System.out.println("Error: Please enter a whole number.");
					
				}

			} while (!valid);
			valid = false;

			do {
				System.out.println("Enter the test number: ");
				input = in.nextLine();

				try {

					num3 = Integer.parseInt(input);
					valid = true;
				} catch (Exception e) {
					System.out.println("Error: Please enter a whole number.");
					
				}

			} while (!valid);
			valid = false;
			do {
				System.out.printf("Here are the numbers between %d and %d that are divisible by %d%n", num1, num2,
						num3);

				for (int i = num1; i <= num2; i++)

					if (i % num3 == 0)
						System.out.println(i);

				valid = true;
				
			} while (!valid);
			
				do {
					System.out.println("Would you like to play again?");
					input = in.nextLine();

					if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y")) {
						valid = true;
					} else {
						System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
						valid = false;
					}
				} while (!valid);// end of Non-Numeric Input Validation

				if (input.equalsIgnoreCase("n")) {
					quit = true;
				} 
			}// end of first while. 
		}
	}
