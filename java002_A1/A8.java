package java002_A1;

import java.util.Scanner;

public class A8 { // 최대공약수

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int big, small;
		int quotient, rest;
		int max;

		if (num1 >= num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}

		while (true) {
			quotient = big / small;
			rest = big - (quotient * small);
			if (rest == 0) {
				max = small;
				System.out.println(max);
				break;
			} else {
				big = small;
				small = rest;
			}
		}

	}
}












