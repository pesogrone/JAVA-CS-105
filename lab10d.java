package week10;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class lab10d {

	public static void main(String[] args) {
		File filename = new File("Student Test Grades.csv");
		Scanner file = null;
		ArrayList<String[]> classRoster = new ArrayList<String[]>();
		try {
			file = new Scanner(filename);
		} catch (Exception e) {
			System.out.println("File not found");
			return;
		}
		String header = file.nextLine();
		String[] headerarray = header.split(",");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-20s%8s%8s%8s%n", headerarray[0], headerarray[1], headerarray[2], headerarray[3]);
		System.out.println("------------------------------------------------------");
		while (file.hasNext()) {
			String data = file.nextLine();
			String[] dataarray = data.split(",");
			classRoster.add(dataarray);

		}
	file.close();
	   for (int i = 0; i<classRoster.size(); i++) {
		   String[] student = classRoster.get(i); 
	
		 for (int j = 1; j<student.length; j++) {
			int grade = Integer.parseInt(student[j]);
			if (grade >= 94) {
				student[j] = "A";
			} else if (grade >= 90 && grade < 94) {
				student[j] = "A-";
			} else if (grade >= 87 && grade < 90) {
				student[j] = "B+";
			} else if (grade >= 84 && grade < 87) {
				student[j] = "B";
			} else if (grade >= 80 && grade < 84) {
				student[j] = "B-";
			} else if (grade >= 77 && grade < 80) {
				student[j] = "C+";
			} else if (grade >= 74 && grade < 77) {
				student[j] = "C";
			} else if (grade >= 70 && grade < 74) {
				student[j] = "C-";
			} else if (grade >= 67 && grade < 70) {
				student[j] = "D+";
			} else if (grade >= 64 && grade < 67) {
				student[j] = "D-";
			} else {
				student[j] = "E";
			}
		 
			
		}
		 System.out.printf("%-25s%-8s%-8s%-8s%n",student[0], student[1], student[2], student[3]);
		 }
	   }
		
	}

