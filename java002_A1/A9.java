package java002_A1;

import java.util.Scanner;

public class A9 { // 소수 구하기

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int prime = 0;
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					prime++;
				}
			}
			if (prime == 1) {
				System.out.println(i);
			}
			prime = 0;
		}
	}
}


//end