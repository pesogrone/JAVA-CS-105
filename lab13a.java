package week13;
//TODO Auto-generated method stub
/**
*Program/Project: Lab12a - Shopping list printin in file
*Your Name: Ronald Britos || Gio Galbuchi
*Date: 3/31/2022
*Instructor: Jeff Light
*Description: password
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class lab13a {

	public static void main(String[] args) {

		String FILENAME = "pwd.txt";
		String VALIDPWDFILENAME = "validpwd.txt";
		String INVALIDPWDFILENAME = "invalidpwd.txt";
		File outfile = new File(FILENAME);
		File validPwdOutfile = new File(VALIDPWDFILENAME);
		File invalidPwdOutfile = new File(INVALIDPWDFILENAME);
		
		
     
		System.out.println("Beginning password analysis....");

		System.out.println("Opening file 'Pwd.txt'.");
		Scanner readFile = null;
		PrintWriter invalidPwdWriter = null;
		PrintWriter validPwdWriter = null;

		try {
			readFile = new Scanner(outfile);
		} catch (Exception e) {
			System.out.println("Pwd File not found");
		}
		try {
			invalidPwdWriter = new PrintWriter(invalidPwdOutfile);
		} catch (FileNotFoundException e) {
			System.out.println("invalidPwd out File not found");
		}
		try {
			validPwdWriter = new PrintWriter(validPwdOutfile);
		} catch (FileNotFoundException e) {
			System.out.println("validPwd out File not found");
		}
		
		while (readFile.hasNextLine()) {
			String data = readFile.nextLine();
			if (data.length() < 8) {
				invalidPwdWriter.println(data + "    Invalid Password! Must be at least 8 characters long.");
			} else if (!hasUpper(data)) {
				invalidPwdWriter.println(data + "    Invalid Password! Must contain at least one UPPERCASE letter.");
			} else if (!hasLower(data)) {
				invalidPwdWriter.println(data + "    Invalid Password! Must contain at least one LOWERCASE letter.");
			} else if (!hasNumber(data)) {
				invalidPwdWriter.println(data + "    Invalid Password! Must contain at least one NUMBER.");
			} else if (!hasSpecial(data)) {
				
				invalidPwdWriter.println(data + "      Must contain one of the following characters: @,#,%,-,&,*");
			}else {
				validPwdWriter.println(data);
			}
		}
		readFile.close();
		invalidPwdWriter.close();
		validPwdWriter.close();

		System.out.println("Analysis complete. Closing files.");

		System.out.println("Results can be found in files 'invalidpwd.txt' "
				+ "and 'validpwd.txt' in the C:\\MyLDSBC\\CS105\\eclipse-workspace\\CD105\\ directory.");
	}

	public static boolean hasUpper(String word) {

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				//invalid Password! Must contain at least one UPPERCASE character.
				return true;
			}
		}

		return false;
	}

	public static boolean hasLower(String word) {

		for (int i = 0; i < word.length(); i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				return true;
				//invalid Password! Must contain at least one LOWERCASE character.
			}
		}
		return false;
	}

	public static boolean hasNumber(String word) {
		
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				
				return true;
				//invalid Password! Must contain at least one NUMBER.
			}
		}
		return false;
	}

	public static boolean hasSpecial(String word) {
         String special = "@#%-&*";
		for (int i = 0; i < word.length(); i++) {
			if (special.indexOf(word.charAt(i)) > 0)  {
				//invalid Password! Must contain at least one {@,#,%,-,&,*}.
				
				return true;
			}
		}
		return false;
	}

}
