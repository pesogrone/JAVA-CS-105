/* Program/project: lab4b
 Name 1: Ronald Britos
 Name 2: Bruno Mazzagardi
 Date: 1/24/2022
 Instructor: Jeff Light
 Description: Shirt sizes*/

package week4;

import java.util.Scanner;

public class Lab4b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1 = 0;

		boolean valid = false;

		// Declare variables

		do {

			System.out.print("Please enter a number: ");

			String input = in.nextLine();

			try {
				num1 = Integer.parseInt(input);
				valid = true;

			} catch (Exception e) {
				System.out.println("Error: Please enter a whole number.");

			} // end of try/catch

		} while (!valid);
		/*System.out.println("num1 =" + num1 + ".");
		System.out.println("num2 =" + (num1 + 1000) + ".");
		System.out.println("num3 =" + (num1*2) + ".");*/
	for (int i = 7; i >=1 || i <= 2; i++ ) {
			System.out.println("yes i got it" + (i / 5));

	}

}
}
