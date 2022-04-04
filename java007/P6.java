package java007;

import java.util.Scanner;

public class P6 {	// Counting a Specified Charater
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String target = sc.next();
		int result = process(text, target);
		printResult(result);

	}

	static int process(String text, String target) {
		int result = 0;
		if (target.length() == 1) {
			String[] textArr = text.split("");
			for (int i = 0; i < textArr.length; i++) {
				if (textArr[i].equals(target) == true) {
					result++;
				}
			}
		} else if (target.length() > 1) {
			String[] textARR = text.split(" ");
			for (int i = 0; i < textARR.length; i++) {
				if (textARR[i].contains(target) == true) {
					result++;
				}
			}
		}
		return result;
	}

	static void printResult(int result) {
		System.out.println(result);
	}
}