package java002_A1;

import java.util.Scanner;

public class A5 { // ¿ªÁ¤»ï°¢Çü

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}


// end