package week12;



	
	import java.io.BufferedReader;

//TODO Auto-generated method stub
	/**
	*Program/Project: Lab12a - Shopping list printin in file
	*Your Name: Ronald Britos || Gio Galbuchi
	*Date: 3/22/2022
	*Instructor: Jeff Light
	*Description: Prints shopping list to a file. 
	*/

	import java.io.File;
	import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class lab12b {
		/**
		 * main() method displays a menu to the user and asks them to select a command.
		 * The method will continue to display the menu to the user until they wish to
		 * quit by selecting 'Exit' from the menu. The method also creates a new, empty
		 * shoppingList of type ArrayList<String> Based on the user input, the
		 * appropriate method will be called to perform actions on the shoppingList.
		 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
		 */
		public static void main(String[] args) {
			// Initialize variables
			Scanner sIn = new Scanner(System.in); // Input Scanner for String
			ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
			String choice; // Holds user input of type String
			boolean done = false; // Keeps program running until user wants to quit
			String FILENAME = "Shopping List.txt";

			// Keep running the program until the user quits
			do {
				// Print out the menu to the console
				System.out.println();
				System.out.println("1. Add Items");
				System.out.println("2. Delete Items");
				System.out.println("3. Show Items");
				System.out.println("4. Sort Items");
				System.out.println("5. Save List");
				System.out.println("6. Open List");
				System.out.println("7. Exit");
				System.out.print("Please enter a command: ");
				choice = sIn.nextLine();

				// Call the appropriate method for the choice selected.
				switch (choice) {
				case "1": // Add items to the Shopping List
					System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
					break;
				case "2": // Delete items from the Shopping List
					System.out
							.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
					break;
				case "3": // Show the items in the Shopping List
					showItems(shoppingList);
					break;
				case "4": // Sort the items in the Shopping List
					sortItems(shoppingList);
					break;
				case "5":// saving
					saveList(sIn, shoppingList, FILENAME);
					break;
				case "6":// Open List
					shoppingList = openList(sIn, shoppingList, FILENAME);
					break;
				case "7": // Exit the program
					System.out.println("\nGoodbye");
					done = true;
					break;
				default: // Handles all input that is not between 1-5
					System.out.println("Invalid response.  Please enter a choice from the menu (1-6).");
				} // End of switch (choice)
			} while (!done); // Keep running the program until the user quits
		}// end of main()

		//////////////////////////////////////////////
		// STUDENTS, FILL IN THE METHOD STUBS BELOW://
		// addItems() //
		// deleteItems() //
		// showItems() //
		// sortItems() //
		//////////////////////////////////////////////

		/**
		 * addItems() method asks the user to enter an item to be stored in the
		 * shoppingList and then adds the item to the shoppingList ArrayList. The user
		 * may enter as many items as they want, hitting ENTER to stop entering items
		 * and return to main(). Each time the user enters an item into the list, a
		 * message will be displayed showing the item entered in the following format:
		 * '<item>' has been added to the Shopping List. [Example: 'Eggs' has been added
		 * to the Shopping List.] Returns the number of items added to the shoppingList
		 */
		public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
			sIn = new Scanner(System.in);
			boolean valid = false;
			int item = 0;

			do {// beginning of adding numbers

				System.out.print("\nAdd an item to the list (or just hit 'ENTER' when done):");
				String input = sIn.nextLine();

				if (input.equals("")) {
					valid = true; // stop adding

				} else if (input.contains(":")) {

					int colon = input.indexOf(":");
					String itemName = input.substring(0, colon).trim();
					String itemAmount = input.substring(colon + 1, input.length()).trim();
					String total = itemName + ":" + itemAmount;
					shoppingList.add(total);
					System.out.printf("'%s' has been added to the Shopping List.\n", total);

					item++;

				} else {
					System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");

				}
			} while (!valid);

			return item;

		}// end of method addItems(ArrayList<String>)

		/**
		 * deleteItems() method asks the user to enter an item to be deleted from the
		 * shoppingList and then deletes the item from the shoppingList ArrayList. The
		 * user may delete as many items as they want, hitting ENTER to stop deleting
		 * items and return to main(). Each time the user deletes an item from the list,
		 * a message will be displayed showing the item deleted in the following format:
		 * '<item>' has been deleted to the Shopping List. [Example: 'Peaches' has been
		 * deleted to the Shopping List.] If the user tries to delete an item not in the
		 * list, a message will be displayed indicating the error and showItems() will
		 * be called. Returns the number of items deleted from the shoppingList
		 */
		@SuppressWarnings("unlikely-arg-type")
		public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
			sIn = new Scanner(System.in);
			boolean valid = false;
			int item = 0;

			do {
				System.out.println("");
				System.out.print("Delete an item from the list (or just hit 'ENTER' when done): ");
				String input = sIn.nextLine();

				if (input.equals("")) {
					valid = true; // stop deleting

				} else if (shoppingList.remove(input)) {

					System.out.printf("'%s' has been deleted from the Shopping List.\n", input);
					item++;

				} else {

					System.out.printf("Invalid response! '%s' is NOT an item in the list.\n", input);
					showItems(shoppingList);

				}
			} while (!valid);// done adding and returning the values

			return item;

		}// end of method deleteItems(ArrayList<String>)

		/**
		 * showItems() method simply displays the contents of the shoppingList ArrayList
		 * in it's simplest form: Example output:
		 * 
		 * The Shopping List contains the following items: [item-1, item-2, item-n]
		 */
		public static void showItems(ArrayList<String> shoppingList) {
			System.out.println("---------------------------");
			System.out.printf("%20s %n", "Shopping List");
			System.out.println("---------------------------");

			for (String item : shoppingList) {
				int colon = item.indexOf(":");
				String itemName = item.substring(0, colon);
				String itemAmount = item.substring(colon + 1, item.length());
				System.out.printf("%-25s%s %n", itemName, itemAmount);
			}

			System.out.println("---------------------------");

		}// end of method showItems(ArrayList<String>)

		/**
		 * sortItems() method sorts the items in the shoppingList ArrayList, then calls
		 * showItems() to display the sorted list. Example output: The Shopping List has
		 * been sorted.
		 * 
		 * The Shopping List contains the following items: [item-1, item-2, item-n]
		 */
		public static void sortItems(ArrayList<String> shoppingList) {
			Collections.sort(shoppingList);
			System.out.println("The Shopping List has been sorted.");

			showItems(shoppingList);
		}// end of method sortItems(ArrayList<String>)

		public static void saveList(Scanner sIn, ArrayList<String> shoppingList, String FILENAME) {
			sIn = new Scanner(System.in);
			boolean valid = false;
			File outfile = new File(FILENAME);

			do {
				System.out.println("Are you sure you wish to overwrite the "
						+ "'Shopping List.txt' file with your current list? (Y/N)");
				String input = sIn.nextLine();

				if (input.equalsIgnoreCase("Y")) {
					PrintWriter writer = null;
					try {
						writer = new PrintWriter(outfile);
					} catch (FileNotFoundException e) {

						System.out.println("File not found");
					}
					writer.println("---------------------------");
					writer.printf("%20s %n","Shopping List");
					writer.println("---------------------------");
					
					for (String item : shoppingList) {
						int colon = item.indexOf(":");
						String itemName = item.substring(0, colon);
						String itemAmount = item.substring(colon + 1, item.length());
						writer.printf("%-25s%s %n", itemName, itemAmount);
					}
				
					writer.println("---------------------------");
					writer.close();

					System.out.println("Shopping List saved to file: Shopping List.txt.");
					valid = true;
				} else if (input.equalsIgnoreCase("N")) {
					System.out.println("Shopping List not saved.");
					valid = true;
				} else {

					System.out.println("Invalid Entry, answer must be 'Y' or 'N' ");
				}
			} while (!valid);

		}// end of SaveList
		public static  ArrayList<String> openList(Scanner sIn, ArrayList<String> shoppingList, String FILENAME) {
			boolean valid = false;
			File outfile = new File(FILENAME);
			ArrayList<String> newList = new ArrayList<String>();
            ArrayList<String> openedList = new ArrayList<String>();		
			
			
			do {
				System.out.print("Are you sure you wish to overwrite your "
						+ "current shopping list with the 'Shopping List.txt' file? (Y/N)");
				String input = sIn.nextLine();
								
				if (input.equalsIgnoreCase("Y")) {
					Scanner file = null;
						try {
							file = new Scanner(outfile);
							
							
						} catch (Exception e) {

							System.out.println("File Error: File 'Shopping List.txt' "
									+ "not found! Please save the list before trying to open it");
						
						}
						while(file.hasNextLine()) {
							String data = file.nextLine();
							newList.add(data);
						}
						
						for (int i = 3; i < newList.size()-1; i++ ) {
							String toParse = newList.get(i);
							int spaceIndex = toParse.indexOf(" ");
							String itemName = toParse.substring(0, spaceIndex).trim();
							String itemAmount = toParse.substring(spaceIndex + 1, toParse.length()).trim();
							String total = itemName + ":" + itemAmount;
							openedList.add(total);
						}
						
						shoppingList = openedList;
						
						file.close();
							
						
						System.out.println("Shopping List overwritten from file: Shopping List.txt.");
						valid = true;
						
				}else if(input.equalsIgnoreCase("N")) {
					System.out.println("Shopping List not opened.");
					valid = true;
				}else {
					System.out.println("Invalid response. Please answer with a 'Y' or 'N'.");
				}
				
			}while(!valid);
			return shoppingList;
			
		}//end of open list
		
	}// end of class Lab9aStartCode
