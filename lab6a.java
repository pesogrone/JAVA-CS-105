package week6;
//TOMAS SOARES & RONALD BRITOS CS 105
import java.util.Scanner;

public class lab6a {
/////Main//////
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int numlarge = 0;
		boolean valid = false;

		do {
			System.out.println(
					"This program will ask the user for three numbers and determine which of the three is the largest");

			do {
				System.out.println("");
				System.out.print("Please enter the first number:");
				input = in.nextLine();

				try {
					num1 = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}

			} while (!valid);
			valid = false;

			do {
				System.out.println("");
				System.out.print("Please enter the second number");
				input = in.nextLine();

				try {
					num2 = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}

			} while (!valid);
			valid = false;
			do {
				System.out.println("");
				System.out.print("Please enter the third number:");
				input = in.nextLine();

				try {
					num3 = Integer.parseInt(input);
					valid = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.");
				}

			} while (!valid);
			valid = false;

			numlarge = largestNumber(num1, num2, num3);

			do {
				System.out.println("Would you like to play again?");
				input = in.nextLine();

				if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y")) {
					valid = true;
				} else {
					System.out.println("Invalid entry. Must answer with a 'Y' or 'N'.");
					valid = false;
				}
			} while (!valid);
		if (input.equalsIgnoreCase("N")) {
			valid = true;
		
		}else { 
			valid=false;
		}
		} while (!valid);
	}// end main
///////largestNumger/////////

	public static int largestNumber(int numero1, int numero2, int numero3) {
		int largest = 0;
		if (numero1 > numero2 && numero1 > numero3) {
			largest = numero1;
			System.out.println("The largest of the three is: " + numero2);

		} else if (numero2 > numero1 && numero2 > numero3) {
			largest = numero2;
			System.out.println("The largest of the three is: " + numero1);
		} else {
			largest = numero3;
			System.out.println("The largest of the three is: " + numero3);
		}
		return largest;
	}// end of largestNumber

}// end of class
