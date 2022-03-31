package java005_A1;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		multiplication(num1);
	}
	
	public static int multiplication(int number) {
		if (number > 0 && number < 10) {
			for (int i = 1; i < 9; i++) {
				System.out.println(number + " X " + secondNumber(i) + " = " + number * secondNumber(i));
			}
		} else {
			System.out.println("Error");
		}
		return number;
	}

	public static int secondNumber(int number) {
		if (number == 1) {
			return 2;
		} else {
			return number + 1;
		}
	}
}

