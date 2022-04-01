package java006_A1;

import java.util.Scanner;

public class A3_a {
	public String inputText() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}

	public void printReverse(String text) {
		String reverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse = reverse + text.charAt(i);
		}
		System.out.println(reverse);
	}
}
