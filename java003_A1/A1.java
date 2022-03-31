package java003_A1;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number, result = 1, mean = 0, max = 0, min = 0;

		while (true) {
			number = scanner.nextInt();
			mean += number;

			if (result == 1) {
				max = number;
				min = number;
			} else {
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
			}

			System.out.println("Result : " + result + " - Mean" + mean / result + ", Max" + max + ", Min" + min);
			System.out.println();
			result++;
		}

	}
}


