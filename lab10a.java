package week10;

import java.util.Scanner;
import java.io.File;

public class lab10a {

	public static void main(String[] args) {
		File filename = new File("Student Assignment Scores.csv");
		Scanner file = null;

		try {
			file = new Scanner(filename);
		} catch (Exception e) {
			System.out.println("File not found");
			return;
		}
		while (file.hasNext()) {
			String row = file.nextLine();
			System.out.println(row);

		}
	}

}