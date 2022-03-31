package java002;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oper, num1, num2, result = 0;

		System.out.println("What operation do you want? \n1. + \n2. - \n3. * \n4. /");
		oper = scanner.nextInt();

		System.out.println("--->");
		System.out.println("Input first number");
		num1 = scanner.nextInt();

		System.out.println("Input second number");
		num2 = scanner.nextInt();

		if (oper == 1) {
			result = num1 + num2;
		} else if (oper == 2) {
			result = num1 - num2;
		} else if (oper == 3) {
			result = num1 * num2;
		} else if (oper == 4 && num2 != 0) {
			result = num1 / num2;
		} else {
			System.out.println("Error");
		}
		if (oper != 5 && (oper == 4 && num2 == 0)) {
			System.out.println(result);
		}
	}
}
