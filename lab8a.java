package week8;
import java.util.ArrayList;
import java.util.Scanner;

/*
* File: Lab8a.java 
* Description: Sum integers from an array list.
* Instructor's Name: Jeff Light 
* 
* @author      Giovanni Galbuchi, Ronald Britos
* @since       02/22/2022
*/ 

public class lab8a {

	public static void main(String[] args) {
		String playAgain = "Y";
		Scanner in = new Scanner(System.in);
		boolean stopAdding = false;
		boolean validAnswer = false;
		do {
			ArrayList<Integer> userNumbers = new ArrayList<Integer>();
			System.out.println("This program will ask the user to enter a series of numbers.\n"
					+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\n"
					+ "The program will then display the array of numbers and the sum total of those numbers.");
			
			do { //beginning of adding numbers
				do { //beginning of int validation
					validAnswer = false;
					System.out.println("Please enter a number (or just hit enter to finish): ");
					String input = in.nextLine();
					int validInt = 0;
					if(input.equals("")) {
						validAnswer = true;//stop adding 
						stopAdding = true;
					} else {
						try {
							validInt = Integer.parseInt(input);
							userNumbers.add(validInt);
							validAnswer = true;
						} catch (Exception e) {
							System.out.println("Invalid response. Please enter a valid whole number.");
						}
					}
					
				} while (!validAnswer);
				
			} while (!stopAdding);
			
			sumValues(userNumbers);
			
			playAgain = getValidYN("Would you like to play again? (Y/N): ",
					"Invalid response. Please answer with a 'Y' or 'N'");
			
		} while (playAgain.equalsIgnoreCase("Y"));

	}
	
	public static void sumValues(ArrayList<Integer> userNumbers) {
		int total = 0;
		System.out.println("Array Index      Item");
		for (int i=0; i < userNumbers.size(); i++) {
			System.out.printf ("%-20d%,d%n", i, userNumbers.get(i));
			total += userNumbers.get(i);
		}
		System.out.println("There are " + userNumbers.size() + " elements in the Array List");
		System.out.println("The sum total of numbers in the ArrayList is " + total);
		
	}
	
	public static String getValidYN(String question, String warning) {
		Scanner in = new Scanner(System.in);
		boolean validAnswer = false;
		String validYN = "";
		do {
			System.out.println(question);
			validYN = in.nextLine();
			if(validYN.equalsIgnoreCase("Y") || validYN.equalsIgnoreCase("N")) {
				validAnswer = true;
			} else {
				System.out.println(warning);
			}
		} while (!validAnswer);
		return validYN;
	}

}
