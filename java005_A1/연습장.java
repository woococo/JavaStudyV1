package java005_A1;

import java.util.Scanner;

public class ¿¬½ÀÀå {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 - num2;
		System.out.print("P(" + num1 + "," + num2 + ") = ");
		System.out.print(num1 + "!/(" + num1 + "-" + num2 + ")! = (");
		printFirst(num1);
		System.out.print(")/(");
		printFirst(num3);
		System.out.print(") = ");
		System.out.print(factorial(num1) + "/" + factorial(num3) + " = ");
		System.out.println(factorial(num1) / factorial(num3));
	}

	private static void printFirst(int num1) {
		for (int i = num1; i > 0; i--) {
			System.out.print(i + "X");
		}
	}

	private static void printSecond(int num3) {
		for (int i = num3; i > 0; i--) {
			System.out.print(i + "x");
		}
	}

	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * factorial(--number);
		}
	}

}