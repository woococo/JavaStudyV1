package java004_A1;

import java.util.Scanner;

public class P5 { // Data Confirmation
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==CONDITIONS==");
		System.out.println("1. The string length should be over 8.");
		System.out.println("2. The string should contains numbers.");
		System.out.println("3. The string should contains uppercase characters.");
		System.out.println("4. The string should contains no spaces.");
		System.out.println("5. The string should contains \"!\"");

		String pwd = sc.nextLine();
		int result = 1; // FAIL

		if ((pwd.length() > 8) && (pwd.matches(".*[0-9].*")) && (pwd.matches(".*[A-Z].*")) && (!pwd.contains(" ")) && (pwd.contains("!"))) {
			result = 0; // PASS
		}

		if (result == 1) {
			System.out.println("FAIL");
		} else if (result == 0) {
			System.out.println("PASS");
		}
	}

}

// end