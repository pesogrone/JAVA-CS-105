package week3;

public class Exception {
	static void checkAge(int age) {
		Object ArithmeticException;
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else if (age >= 18 && age < 70) {
			System.out.println("Access granted - You are old enough!");

		} else {
			throw new ArithmeticException("Access denied -You are too old ");
		}
	}

	public static void main(String[] args) {
		checkAge(10);
	}

}
