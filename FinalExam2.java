/*
 * Program: Final Exam 2
 * Name:Ronald Mijhail Britos Granado
 * Date: 4/9/2020
 * Instructor: Jeff Light
 * Description: Arrays and Functions
 */
package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Declare Variables
		int num1 = 0;
		String input;
		boolean valid = false;
		boolean stopadding = false;
		ArrayList<Integer> userNumbers = new ArrayList<Integer>();

		do {
			// Telling the user what the program will do
			System.out.println("In this program, you will ask the user to enter a list of numbers.");
			System.out.println(
					"The program will then find the sum of the numbers and determine which of the numbers is the largest.");
			System.out.println("");
			do {
				do {
					// question to put the number
					System.out.print("Please enter a number (or just hit enter to finsih):");
					input = in.nextLine();
					if (input.equals("")) {
						valid = true;
						stopadding = true;
					} else {
						num1 = Integer.parseInt(input);
						userNumbers.add(num1);
					}
				} while (!stopadding);

			} while (!valid);
		} while (!valid);
		System.out.println("");
		// calling the arrays
		addNumbers(userNumbers);
		largestNumber(userNumbers);

	}// end of main()

	public static int addNumbers(ArrayList<Integer> userNumbers) {
		// Declare Variables
		int sum = 0;
		// for loop for every data in the array
		for (int i = 0; i < userNumbers.size(); i++) {
			// Sum every number in the array
			sum += userNumbers.get(i);

		}
		// Print the sum
		System.out.printf("The sum of the list of numbers is: %d%n", sum);
		return sum;
	}// end of addnumbers method

	public static int largestNumber(ArrayList<Integer> userNumbers) {
		
		//Declare Variables
		
	    int largest = 0;
	
		
	 //for loop to pass for every number in the data. 
	
	for (int i = 0; i < userNumbers.size(); i++) {
		
		if (userNumbers.get(i) >largest) {
			largest = userNumbers.get(i);

			

		}

	}
		System.out.printf("The largest number in the list is: %d", largest);
		return largest;
	}// end of the largest method

}// end of class FinalExam2
