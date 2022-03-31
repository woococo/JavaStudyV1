package java002;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1, num2;
		int change, change10000, change5000, change1000, change500, change100, change50, change10;

		System.out.println("Input first Number");
		num1 = scanner.nextInt();

		System.out.println("Input second Number");
		num2 = scanner.nextInt();

		change = num1 - num2;
		change10000 = change / 10000;
		change = change % 10000;
		change5000 = change / 5000;
		change = change % 5000;
		change1000 = change / 1000;
		change = change % 1000;
		change500 = change / 500;
		change = change % 500;
		change100 = change / 100;
		change = change % 100;
		change50 = change / 50;
		change = change % 50;
		change10 = change / 10;

		System.out.printf("\nÀÜµ· : %d¿ø\n", change);
		System.out.printf("10000 -> %d°³\n", change10000);
		System.out.printf("5000 -> %d°³\n", change5000);
		System.out.printf("1000 -> %d°³\n", change1000);
		System.out.printf("500 -> %d°³\n", change500);
		System.out.printf("100 -> %d°³\n", change100);
		System.out.printf("50 -> %d°³\n", change50);
		System.out.printf("10 -> %d°³\n", change10);

	}
}
