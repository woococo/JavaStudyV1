package java002;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		System.out.println("What number do you want?");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int result = 0;
		int i = 0;
		result = inputNum * i;

		for (i = 2; i < 10; i++) {
			result = inputNum * i;
			System.out.println(inputNum + "X" + i + "=" + result);
		}

	}
}
