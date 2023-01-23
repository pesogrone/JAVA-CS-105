/**
* Module: Lab13b
* @author Giovanni Galbuchi, Ronald Britos
* @since 04/04/2022
* Assignment: Lab 13b - Open file and write files - Create Form Letter
* Instructor's Name: Jeff Light.
*/
package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab13b {

	public static void main(String[] args) {
		File studentsFile = new File("Student Assignment Scores.csv");
		File warningLetterFile = new File("Warning Letter to Student -.txt");
		Scanner csvFile = null;
		Scanner warningLetter = null;
		try {
			warningLetter = new Scanner (warningLetterFile);
		} catch (Exception e) {
			System.out.println("An error occurred.");
		}
		
		warningLetter.useDelimiter("\\Z"); //Change the delimiter of the letter Scanner object to "\\Z" since we know that the string "\\Z" is not found anywhere in our file.
		String letterBody = warningLetter.next(); 
		
		try {
			csvFile = new Scanner(studentsFile);
		} catch (Exception e) {
			System.out.println("An error occurred.");
		}
		
		String header = csvFile.nextLine();
		
		System.out.println("Creating letters for: \n");
		while(csvFile.hasNextLine()) {
			String data = csvFile.nextLine();
			String[] dataArray = data.split(",");
			List<String> studentList = new ArrayList<>(Arrays.asList(dataArray));
			if(studentList.contains("0")) {
				System.out.printf("%-25s%n",dataArray[0]);
				String STUDENTFILENAME = "Warning Letter to Student - "+ dataArray[0] + ".txt";
				File studentOutfile = new File(STUDENTFILENAME);
				PrintWriter warningLetterWriter = null;
				try {
					warningLetterWriter = new PrintWriter(studentOutfile);
				} catch (FileNotFoundException e) {
					System.out.println("student out File not found");
				}
				warningLetterWriter.println("Dear "+ dataArray[0] + ",");
				warningLetterWriter.println(letterBody + "\n");
				for(int i=0; i<dataArray.length; i++) {
					if (dataArray[i].equals("0")) {
						warningLetterWriter.println("Assignment " + i);
					}
				}
				warningLetterWriter.close();
			}
		}
		
		csvFile.close();
		warningLetter.close();

	}

}
