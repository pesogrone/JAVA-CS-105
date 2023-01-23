/* Program/project: lab4b
 Name 1: Ronald Britos
 Name 2: Bruno Mazzagardi
 Date: 2/1/2022
 Instructor: Jeff Light
 Description: javacode*/
package week4;

import java.util.Scanner;

public class Lab4c {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "";

		boolean java = true;

		while (java) {

			Boolean valid = false;

			while (!valid) {
				System.out.println("Do you like to code in Java?:");
				answer = in.nextLine();

				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}

			} // end of first while with error mark
			{
				if (answer.equalsIgnoreCase("Y")) {
					java = false;
					System.out.println("That's great! I do too!");
				} else {
					java = false;

					System.out.println("That's ok. There are many other wonderful things in life to learn.");
				}
			}
		}

	}

}
