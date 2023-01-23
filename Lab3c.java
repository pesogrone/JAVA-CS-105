/* Program/project: lab3a
 Name 1: Ronald Britos
 Name 2: Bruno Mazzagardi
 Date: 1/24/2022
 Instructor: Jeff Light
 Description: Shirt sizes*/

package week3;

import java.util.Scanner;

public class Lab3c {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String age;
		String gender;
		System.out.println(
				"This program will ask a member's age and gender and determine which class they should attend on Sunday.");
		System.out.println ("");

		System.out.println("Please enter the member's age:");
		age = in.nextLine();

		int num1 = Integer.parseInt(age);
		if (num1 < 1) {
			System.out.println("The member is a Babe in Arms.");
		}

		else if (num1 >= 1 && num1 < 3) {
			System.out.println("The member should be in Nursery.");
		} else if (num1 >= 3 && num1 < 12) {
			System.out.println("The member should attend Primary.");
		} else if (num1 >= 12 && num1 < 18) {

			System.out.println("Please enter the member's gender:");
			gender = in.nextLine();

			if (gender.equalsIgnoreCase("f")) {
				System.out.println("The member should attend Young Women's.");
			} else {
				System.out.println("The member should attend Young men's.");

			}
		} else {
			System.out.println("Please enter the member's gender:");
			gender = in.nextLine();
			if (gender.equalsIgnoreCase("m")) {
				System.out.println("The member should attend Priesthood.");
			} else {
				System.out.println("The member should attend Relief Society.");
			}
		}

	}
}
