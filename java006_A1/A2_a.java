package java006_A1;

import java.util.Scanner;

public class A2_a {
	public String inputNum() {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		return number;
	}

	public void printReverse(String number) {
		String reverse = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			reverse = reverse + number.charAt(i);
		}
		System.out.println(reverse);
	}
}

