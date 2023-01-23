package week6;

//Tomas Soares & Ronald Britos CS 105
import java.util.Scanner;

public class lab6b {
		///////////////////MAIN////////////////////
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				String input;
				int num1 = 0;
				int num2 = 0;
				boolean valid = false;

				
					System.out.println(
							"This program will ask the user for 2 numbers and raise the first number to the power of the second.");
		do {
					do {
						System.out.println("Please enter the first number: ");
						input = in.nextLine();
						try {
							num1 = Integer.parseInt(input);
							valid = true;
						} catch (Exception e) {
							System.out.println("Invalid Response: Please enter a whole number.");
						}

					} while (!valid);////// END OF FIRST INPUT VALIDATION///////

					valid = false;

					do {
						System.out.println("Please enter the second number");
						input = in.nextLine();
						try {
							num2 = Integer.parseInt(input);
							valid = true;
						} catch (Exception e) {
							System.out.println("Invalid Response: Please enter a whole number.");
						}
					} while (!valid);///// END OF SECOND NUMERIC INPUT VALIDATION//////
					valid = false;

					System.out.println(num1 + " raised to the power of " + num2 + " is: " + power(num1, num2) + ".");
 
					
								
			
					
					do { 	
						System.out.println("Would you like to play again? (Y/N): ");
						input = in.nextLine();
						if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y")) {
							valid = true;
						} else {
							System.out.println("Invalid response: Please answer with a 'Y' or 'N'.");
							valid = false;
						}
					} while (!valid);//// END OF NON-NUMERIC INPUT VALIDATION////

					if (input.equalsIgnoreCase("N")) {
						valid = true;
					} else {
						valid = false;
					}
		}while(!valid);
			}////// END OF MAIN/////

			public static int power(int numero1, int numero2) {
				int total = 1;
				for (int i = 0; i < numero2; i++) {

					total = numero1 * total;

				}
				return total;
			}
		


}


