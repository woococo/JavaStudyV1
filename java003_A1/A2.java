package java003_A1;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number, positive = 0, negative = 0, odd = 0, even = 0;

		while (true) {
			number = scanner.nextInt();

			if (number == 0) {
				continue;
			} else if (number > 0) {
				positive++;
				if (number % 2 == 1) {
					odd++;
				} else {
					even++;
				}
			} else {
				negative++;
				number = Math.abs(number);
				if (number % 2 == 1) {
					odd++;
				} else {
					even++;
				}
			}
			System.out.println("P - " + positive + ", N - " + negative + ", O - " + odd + ", E - " + even);
			System.out.println();
		}

	}
}
