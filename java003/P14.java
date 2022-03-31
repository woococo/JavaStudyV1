package java003;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		char[] chars = text.toCharArray();
		for (int i = 0; i <= text.length(); i++) {
			if (chars[i] == 'a') {
				if (chars[i + 1] == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
					System.out.println(text.replaceAll("a", "an"));
				}
			}
		}
	}
}
