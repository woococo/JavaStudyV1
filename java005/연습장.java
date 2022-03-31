package java005;

import java.util.Scanner;

public class ø¨Ω¿¿Â {
	public static void main(String[] args) {
		input();
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	}
	
	static String input() {
		Scanner sc = new Scanner(System.in);
		String decision = sc.nextLine();
		double num1 = 0, num2 = 0;
		
		if(decision.contains("+")) {
			addition(num1, num2);
		} else if(decision.contains("-")) {
			subtraction(num1, num2);
		} else if(decision.contains("*")) {
			multiplication(num1, num2);
		} else if(decision.contains("/")) {
			division(num1, num2);
		}
		return decision;
		
	}
	
	private static void substring(int indexOf) {
	
	}

	public static void addition(double num1, double num2) {
		double result = (num1 + num2);
	}
	
	public static void subtraction(double num1, double num2) {
		double result = num1 - num2;
	}
	
	public static void multiplication(double num1, double num2) {
		double result = num1 * num2;
	}
	
	public static void division(double num1, double num2) {
		double result = num1 / num2;
		if (num1 == 0 || num2 == 0) {
			System.out.println("Error");
		} else {
			continue;
		}
	}
	
	void print(double result) {
		System.out.println(result);
	}
	
}
