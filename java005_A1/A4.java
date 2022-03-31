package java005_A1;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		printResult(inputNum);
	}

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return sum(n - 2) + sum(n - 1);
		}
	}
	
	public static void printResult(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(sum(i) + " ");
		}
	}
}

