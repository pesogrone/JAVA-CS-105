package week10;

import java.io.File;
import java.util.Scanner;

public class lab10b {

	public static void main(String[] args) {
		File filename = new File("Student Assignment Scores.csv");
		Scanner file = null;

		try {
			file = new Scanner(filename);
		} catch (Exception e) {
			System.out.println("File not found");
			return;
		}
		String header = file.nextLine();
		String[] headerarray = header.split(",");
		System.out.printf("%-25s%8s%8s%8s%8s%8s%8s%n", headerarray[0], headerarray[1],headerarray[2],headerarray[3],headerarray[4],headerarray[5],headerarray[6]);
		System.out.println("---------------------------------------------------------------------------");
		while (file.hasNext()) {
			String row = file.nextLine();
			//System.out.println(row); 
			String[] rowarray = row.split(",");
			System.out.printf("%-25s%8s%8s%8s%8s%8s%8s%n", rowarray[0],rowarray[1],rowarray[2],rowarray[3],rowarray[4],rowarray[5], rowarray[6]);
			
		}
	}

}
