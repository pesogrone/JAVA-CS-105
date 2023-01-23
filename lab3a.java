/* Program/project: lab3a
 Name 1: Ronald Britos
 Name 2: Bruno 
 Date: 1/18/2022
 Instructor: Jeff Light
 Description: Shirt sizes*/

package week3;

import java.util.Scanner;

public class lab3a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
		System.out.println(
				"In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.\r\n"
						+ "Please enter the customer's chest measurement in inches:");
		answer = in.nextLine();
		// the int will determine what is the answer, then the first if will tell us the
		// first size "S"
		int chestSize = Integer.parseInt(answer);
		if (chestSize < 38) {
			System.out.println(
					"A customer with a chest measurement of " + chestSize + " inches needs to order a size S.");
		}
		// all the "else if" will have different numbers to show us "M" "L" "XL"
		else if (chestSize >= 38 && chestSize < 40) {
			System.out.println(
					"A customer with a chest measurement of " + chestSize + " inches needs to order a size M.");
		}

		else if (chestSize >= 40 && chestSize < 43) {
			System.out.println(
					"A customer with a chest measurement of " + chestSize + " inches needs to order a size L.");
		} else if (chestSize >= 43 && chestSize < 46) {
			System.out.println(
					"A customer with a chest measurement of " + chestSize + " inches needs to order a size XL.");
		}
		// "else" will show us the remaining numbers and will assign the size of "XXL"
		else {
			System.out.println(
					"A customer with a chest measurement of " + chestSize + " inches needs to order a size XXL.");

		}
	}
}
