package week7;

import java.util.Scanner;
import java.lang.Math;

//Tomas Soares & Ronald Britos CS 105-02
public class lab7b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Boolean valid = false;
		int num1 = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		String answer = "";

		do {
			System.out.println(
					"This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.");
			System.out.println(
					"The program will ask the user which side they wish to calculate and the lengths of the other two sides.");
			 System.out.println("Assume that the three sides are called a, b, and c "
					+ "where c is the hypotenuse (the side opposite the right angle).\n");

			
			do {
				System.out.print("Which side of the triangle do you wish to calculate? (a/b/c):");
				answer = in.nextLine();

				if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("C")) {
					valid = true;
				} else {
					System.out.println("Invalid response. Please enter a whole number.\n ");
					valid = false;
				}

			} while (!valid);
			if (answer.equalsIgnoreCase("a")) {
				calculateSideA();

			} else if (answer.equalsIgnoreCase("b")) {
				calculateSideB();

			} else {
				calculateSideC();
			}//end of input validation

			do {
				System.out.print("Would you like to play again? (Y/N): ");
				answer = in.nextLine();

				if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y")) {
					valid = true;
				} else {
					System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
					valid = false;
				}
			} while (!valid);
			if (answer.equalsIgnoreCase("N")) {
				valid = true;

			} else {
				valid = false;
			}

		} while (!valid);
	}// end of main

	public static void calculateSideA() {
		int b = getSideLength("b ");
		int c = getSideLength("c ");
		double a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
		System.out.println("A right triangle with sides 'b' = " + b + " and 'c' (hypotenuse) = " + c
				+ ", has a side 'a' which has a length of: " + a);

	}// end of the first method

	public static void calculateSideB() {
		int a = getSideLength("a ");
		int c = getSideLength("c ");
		double b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
		System.out.println("A right triangle with sides 'a' = " + a + " and 'c' (hypotenuse) = " + c
				+ ", has a side 'b' which has a length of: " + b);
	}// end of the second method

	public static void calculateSideC() {
		int a = getSideLength("a");
		int b = getSideLength("b");
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("A right triangle with sides 'a' = " + a + " and 'b' " + b
				+ ", has a side 'c' (hypotenuse) which has a length of: " + c);
	}// end of the third method

	public static int getSideLength(String letter)

	{
		int sideLength = 0;
		Boolean valid = false;
		Scanner in = new Scanner(System.in);
		String answer = "";
		while (!valid) {
			System.out.print("Please enter the length of " + letter + ":");
			answer = in.nextLine();

			try {
				sideLength = Integer.parseInt(answer);

				valid = true;
			}

			catch (Exception e) {
				System.out.println("Invalid response: Please enter a whole number.\n");

			}
		}

		return sideLength;
	}//end of forth method

}