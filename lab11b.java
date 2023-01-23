/*
 * Program/Project: Lab11b - 
 *Your Name: Ronald Britos || Gio Galbuchi
 *Date: 3/17/2022
 *Instructor: Jeff Light
 *Description: Switch
 */
package week11;

import java.util.Scanner;

public class lab11b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice;
		boolean valid = false;

		System.out.println("This program will show the"
				+ " name of an apostle based on the order they were called with President Nelson as #1");
		do {
			System.out.print("Enter a number between 1 and 15 to "
					+ "display the corresponding apostle (or press Enter to quit):");
			choice = in.nextLine();
			switch (choice) {
			case "1":
				System.out.printf("Number %s is: Russell M Nelson\n", choice );
                break;
			case "2":
				System.out.printf("Number %s is: Dallin H. Oaks\n", choice );
				break;
			case "3":
				System.out.printf("Number %s is: M. Russell Ballard\n", choice );
				break;
			case "4":
				System.out.printf("Number %s is: Jeffrey R. Holland\n", choice );
				break;
			case "5":
				System.out.printf("Number %s is: Henry B. Eyring\n", choice );
				break;
			case "6":
				System.out.printf("Number %s is: Dieter F. Uchtdorf\n", choice );
				break;
			case "7":
				System.out.printf("Number %s is: David A. Bednar\n", choice );
				break;
			case "8":
				System.out.printf("Number %s is: Quentin L. Cook\n", choice );
				break;
			case "9":
				System.out.printf("Number %s is: D. Todd Christofferson\n", choice );
				break;
			case "10":
				System.out.printf("Number %s is: Neil L. Andersen\n", choice );
				break;
			case "11":
				System.out.printf("Number %s is: Ronald A. Rasband\n", choice );
				break;
			case "12":
				System.out.printf("Number %s is: Gary E. Stevenson\n", choice );
				break;
			case "13":
				System.out.printf("Number %s is: Dale G. Renlund\n", choice );
				break;
			case "14":
				System.out.printf("Number %s is: Gerrit w. Gong\n", choice );
				break;
			case "15":
				System.out.printf("Number %s is: Ulisses Soares\n", choice );
				break;
			case "":
			    valid = true;
				break;
			default:
				System.out.println("That's not a valid choice. Try again.");
				break;
			
			}
			

		} while (!valid);

	}

}
