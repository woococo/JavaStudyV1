package java003;

import java.util.Scanner;

public class P12 { // ¿Âµµ
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Celsius -> Fahrenheit"); // ¼·¾¾ -> È­¾¾
		System.out.println("2. Fahrenheit -> Celsius"); // È­¾¾ -> ¼·¾¾

		int choice = scanner.nextInt();
		float num = scanner.nextFloat();
		float result = 0;

		switch (choice) {
		case 1:
			result = (num * 9 / 5) + 32; // ¼·¾¾ -> È­¾¾
			break;
		case 2:
			result = (num - 32) * 5 / 9; // È­¾¾ -> ¼·¾¾
			break;
		}
		System.out.println(result);
	}
}


//end