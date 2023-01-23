package week5;

import java.util.Scanner;
//Tomas Soares & Ronald Britos CS 105 02
public class Lab5b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		
		double month = 0;
		double balance = 0;
		
		boolean valid = false;
		double deposit = 0;
		double annualrate = 0;
		
		
		do {
		System.out.println("This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.\r\n"
				+ "It will then show the monthly balance over the period of planned savings.");
		do {
		System.out.println("Please enter the amount to be deposited each month: ");
		input = in.nextLine(); 
		
		    try {
		    	
		    	deposit = Double.parseDouble(input);
		    	valid = true;
		    	
		    }catch (Exception e) { System.out.println("Invalid response: Please enter a whole number.");
		    
		    }
		}while (!valid);
		
		valid = false;
		do {
			System.out.println("Please enter the annual interest rate: ");
			input = in.nextLine(); 
			
			    try {
			    	
			    	annualrate = Double.parseDouble(input);
			    	valid = true;
			    	
			    }catch (Exception e) { System.out.println("Invalid response: Please enter a whole number.");
			    
			    }
			}while (!valid);
		valid = false;
		do {
			System.out.println("Please enter the number of months you plan to save: ");
			input = in.nextLine(); 
			
			    try {
			    	
			    	month = Double.parseDouble(input);
			    	valid = true;
			    	
			    }catch (Exception e) { System.out.println("Invalid response: Please enter a whole number.");
			    
			    }
			}while (!valid);
		double	montirate = annualrate / 100 / 12;     
		System.out.println("The following table shows the balance of the account for each month of the designated savings period.");
         System.out.println("  Month        Balance");
         
         balance = (balance + deposit) * (1 + montirate); 
         for (int i = 1; i <= month; i++) {
        	
        	 
        	 System.out.printf("Month: %-6d$%,.2f%n ", i, balance);
       
        
        	 balance = (balance + deposit) *(1 + montirate);
        	 
         }
         valid = false;
         
         do {
				System.out.println("Would you like to make another calculation?");
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
	}while(!valid);

}
}
