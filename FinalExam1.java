/*
 * Program: Final Exam 1
 * Name: Ronald Mijhail Britos Granado
 * Date: 4/9/2020
 * Instructor: Jeff Light
 * Description: Strings
 */
package Final;

import java.util.Scanner;

public class FinalExam1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Declare variables
		String name;
		String wardname;
		String input;
		int males = 0;
		int females = 0;
		boolean valid = false;
		// Star making question, because is a String will be not do input validation
		do {
			System.out.print("Please enter your name: ");
			input = in.nextLine();
			name = input;
			valid = true;

		} while (!valid);
		valid = false;
		do {
			System.out.println("");
			System.out.print("Please enter the name of your Ward: ");
			input = in.nextLine();
			wardname = input;
			valid = true;

		} while (!valid);
		valid = false;
		do {
			System.out.println("");
			System.out.print("Please enter the approximate number of adult males in the ward: ");
			input = in.nextLine();
			// input validation in case is not a whole number
			try {
				males = Integer.parseInt(input);
				valid = true;

			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
			}

		} while (!valid);
		valid = false;
		do {
			System.out.println("");
			System.out.print("Please enter the approximate number of adult females in the ward: ");
			input = in.nextLine();
			// input validation in case is not a whole number
			try {
				females = Integer.parseInt(input);
				valid = true;

			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
			}

		} while (!valid);
		valid = false;
		// Will sum the third and fourth question
		int total = males + females;
		// will show and display the results
		System.out.println("");
		System.out.printf("There are %d adult members in %s's %s ward.%n", total, name, wardname);

	}// end of main()

}// end of class FinalExam1
