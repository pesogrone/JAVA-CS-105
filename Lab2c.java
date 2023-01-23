/*
 Program/project: lab2b
 Name 1: Ronald Britos
 Name 2: Bruno 
 Date: 1/13/2022
 Instructor: Jeff Light
 Description: Calculate interest rate
*/

package week2;

import java.util.Scanner;

public class Lab2c {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
         
		System.out.println("This program will ask the user for a monthly deposit, an annual interest rate and then calculate the balance after 6 months.");
		System.out.print("Please enter the amount to be deposited each month: ");
		answer = in.nextLine();
		double num1 = Double.parseDouble(answer);
		
		System.out.print("Please enter the annual interest rate percent: ");
		answer = in.nextLine();
		double num2 = Double.parseDouble(answer);
		
		double a = num2 / 100 / 12;
		double b = num1 * (1 + a);
		double c = (num1 + b) * (1 + a);
		double d = (num1 + c) * (1 + a);
		double e = (num1 + d) * (1 + a);
		double f = (num1 + e) * (1 + a);
		double g = (num1 + f) * (1 + a);		
		System.out.println("The ending balance after 6 months is: $" + g + ".");
		
	}
	
	

	
		
		
		
				

	}


