package java005_A1;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 - num2;
		System.out.print("C(" + num1 + "," + num2 + ") = ");
		System.out.print(num1 + "!/(" + num1 + "-" + num2 + ")!/" + num2 + "! = (");
		printResult(num1);
		System.out.print(")/(");
		printResult(num3);
		System.out.print(")/(");
		printResult(num2);
		System.out.print(") = " + factorial(num1) + "/" + factorial(num3) + "/" + factorial(num2) + " = ");
		System.out.println(factorial(num1) / (factorial(num2) * factorial(num3)));
	}

	private static void printResult(int number) {
		for (int i = number; i > 0; i--) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(i + "X");
			}
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(--n);
		}
	}
}
