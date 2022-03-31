package java004_A1;

import java.util.Scanner;

public class P2 { // Banking System
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;

		while (true) {
			System.out.println("==MENU==\n1. Dsposit\n2. Whihdrawal");
			int menu = sc.nextInt();
			int money = sc.nextInt();

			switch (menu) {
			case 1:
				balance = balance + money;
				break;
			case 2:
				balance = balance - money;
				break;
			}

			System.out.println("Balance :" + balance);
		}
	}
}

// end
