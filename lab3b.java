/* Program/project: lab3a
 Name 1: Ronald Britos
 Name 2: Bruno Mazzagardi
 Date: 1/24/2022
 Instructor: Jeff Light
 Description: Shirt sizes*/
package week3;

import java.util.Scanner;

public class lab3b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inches;
		String pounds;
		System.out.println("In this program we will calculate a person's BMI.");

		System.out.println("");

		System.out.println("Please enter a person's height in inches: ");
		inches = in.nextLine();
		System.out.println("Please enter a person's wheight in pounds: ");
		pounds = in.nextLine();

		double num1 = Double.parseDouble(pounds);
		double kg = 0.45359237 * num1;

		double num2 = Double.parseDouble(inches);
		double m = 0.0254 * num2;

		double BMI = kg / (m * m);

		if (BMI < 18.5) {
			System.out.println(
					"The person's BMI is: " + BMI + "." + "The person has a BMI classification of: Underweight");
		} else if (BMI >= 18.5 && BMI < 24.9) {
			System.out.println("The person's BMI is: " + BMI + ". " + "The person has a BMI classification of: Normal");
		} else if (BMI >= 24.9 && BMI <= 29.9) {
			System.out.println(
					"The person's BMI is: " + BMI + ". " + "The person has a BMI classification of: overweight");
		} else {
			System.out.println("The person's BMI is: " + BMI + ". " + "The person has a BMI classification of: obese");
		}
		
	}
}
