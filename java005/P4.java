package java005;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		P4 P4 = new P4();
		String input = P4.input();

		int result = 0;
		P4.print(result);
	}

	double input() {
		Scanner sc = new Scanner(System.in);
		String decision = sc.nextLine();

		double num1 = 0, num2 = 0;
		num1 = decision.charAt(0);
		num2 = decision.charAt(2);

		if (decision.charAt(1) == '+') {
			addition(num1, num2);
		} else if (decision.charAt(1) == '-') {
			subtraction(num1, num2);
		} else if (decision.charAt(1) == '*') {
			multiplication(num1, num2);
		} else if (decision.charAt(1) == '/') {
			division(num1, num2);
		}
		return decision;
		return num1;
		return num2;
	}

	public void addition(double num1, double num2) {
		double result = (num1 + num2);
	}

	public void subtraction(double num1, double num2) {
		double result = num1 - num2;
	}

	public void multiplication(double num1, double num2) {
		double result = num1 * num2;
	}

	public void division(double num1, double num2) {
		double div = num1 / num2;
		if (num2 == 0) {
			System.out.println("Error");
		}
	}

	void print(double result) {
		System.out.println(result);
	}

}
