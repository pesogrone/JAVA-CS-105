/*
 Program/project: lab2b
 Name 1: Ronald Britos
 Name 2: Bruno 
 Date: 1/13/2022
 Instructor: Jeff Light
 Description: Calculate area
 */
package week2;

import java.util.Scanner;

public class Lab2b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
		
		System.out.println("Please enter the width of the square: ");
		answer = in.nextLine();
		int num1 = Integer.parseInt(answer);
		
		System.out.println("Please enter the width of the rectangle: ");
		answer = in.nextLine();
		int num2 = Integer.parseInt(answer);

		System.out.println("Please enter the height of the rectangle: ");
		answer = in.nextLine();
		int num3 = Integer.parseInt(answer);

		int z = num1 * num1;
		int x = num2 * num3;
		System.out.println("The area of a square with a width of " + num1 + " is " + z +  ".");
		System.out.println("The area of a rectangle with a width of " + num2 +  " and a height of " + num3 +  " is " + x + ".");
	}

}
