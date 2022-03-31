package java005;

import java.util.Scanner;

public class P5 {

	public static void P5(String[] args) {
		Scanner sc = new Scanner(System.in);
		P5 main = new P5();
		int num = sc.nextInt();
		main.calculate(num);
	}

	public void calculate(int num) {
		int result = 0;
		if (num > 1 && num < 10) {
			for (int i = 1; i < 10; i++) {
				result = num * i;
				System.out.println(num + " X " + " = " + result);
			}
		} else {
			System.out.println("Error");
		}
	}
}