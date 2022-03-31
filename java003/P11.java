package java003;

import java.util.Scanner;

public class P11 { // 환율
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. South Korean won -> United States Doller");
		System.out.println("2. United States Doller -> South Korean won");

		int choice = scanner.nextInt();
		double money = scanner.nextDouble();
		double result = 0;

		switch (choice) {
		case 1:
			result = money / 1220.74; // 환율
			break;
		case 2:
			result = money * 1220.74; // 환율
			break;
		}
		System.out.println(result);
	}
}

//end